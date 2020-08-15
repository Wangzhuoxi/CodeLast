import java.util.HashMap;

public class LRU {
    //Node是双向链表的节点
    public static class Node<V> {
        public V value;
        public Node<V> last;
        public Node<V> next;

        public Node(V value) {
            this.value = value;
        }
    }

    public static class NodeDoubleLinkedList<V> {
        //给定头尾指针
        private Node<V> head;
        private Node<V> tail;

        public NodeDoubleLinkedList() {
            this.head = null;
            this.tail = null;
        }

        /**
         * 增加newNode 在尾部 ，考虑linklist是否为null
         *
         * @param newNode
         */
        public void addNode(Node<V> newNode) {
            if (newNode == null)
                return;
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
                newNode.last = tail;
            }
        }

        /**
         * 当node已经存在时，挪到最后，考虑是否为头节点,考虑是否为尾节点
         *
         * @param node
         */
        public void removetotail(Node<V> node) {
            if (this.tail == node) {
                return;
            }
            if (node == head) {
                head = node.next;
                head.last = null;
                node.next = null;

            } else {
                node.last.next = node.next;
                node.next.last = node.last;

            }
            node.next = null;
            tail.next = node;
            node.last = tail;
            tail = node;
        }

        public Node<V> removeHead() {
            if (this.head == null) {
                return null;
            }
            Node<V> res = this.head;
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                this.head = res.next;
                res.next = null;
                this.head.last = null;
            }
            return res;
        }
    }

    public static class MyCache<K, V> {
        private HashMap<K, Node<V>> keyNodeMap;
        private HashMap<Node<V>, K> nodeKeyMap;
        private NodeDoubleLinkedList<V> nodeList;
        private int capacity;

        public MyCache(int capacity) {
            if (capacity < 1) {
                throw new RuntimeException("should be more than 0.");
            }
            this.keyNodeMap = new HashMap<K, Node<V>>();
            this.nodeKeyMap = new HashMap<Node<V>, K>();
            this.nodeList = new NodeDoubleLinkedList<V>();
            this.capacity = capacity;
        }

        public V get(K key) {
           if(this.keyNodeMap.containsKey(key))
           {
               Node<V> res=keyNodeMap.get(key);
               nodeList.removetotail(res);
               return res.value;
           }
           else
               return null;
        }

        public void set(K key, V value) {
            if(this.keyNodeMap.containsKey(key)) {
                Node<V> node = this.keyNodeMap.get(key);
                node.value = value;//修改一个即可。是地址。
                this.nodeList.removetotail(node);
            }
            else
            {
                Node<V> temp=new Node<>(value);
                keyNodeMap.put(key,temp);
                nodeKeyMap.put(temp,key);
                nodeList.addNode(temp);
                if (this.keyNodeMap.size() == this.capacity + 1) {
                    this.removeMostUnusedCache();
                }
            }


        }

        private void removeMostUnusedCache() {
            Node<V> removeNode = this.nodeList.removeHead();
            K removeKey = this.nodeKeyMap.get(removeNode);
            this.nodeKeyMap.remove(removeNode);
            this.keyNodeMap.remove(removeKey);
        }
    }
    public static void main(String[] args) {
        MyCache<String, Integer> testCache = new MyCache<String, Integer>(3);
        testCache.set("A", 1);
        testCache.set("B", 2);
        testCache.set("C", 3);
        System.out.println(testCache.get("B"));
        System.out.println(testCache.get("A"));
        testCache.set("D", 4);
        System.out.println(testCache.get("D"));
        System.out.println(testCache.get("C"));

    }
}

