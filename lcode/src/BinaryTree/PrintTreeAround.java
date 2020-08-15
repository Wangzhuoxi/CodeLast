package BinaryTree;

public class PrintTreeAround {
    public class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

        public void printEdge1(Node head) {
            if (head == null) {
                return;
            }
            int height = getHeight(head, 0);
            Node[][] edgeMap = new Node[height][2];
            //获得每一层的左右节点
            setEdgeMap(head, 0, edgeMap);
            //打印左边界
            for (int i = 0; i != edgeMap.length; i++) {
                System.out.print(edgeMap[i][0].value + "");
            }
            //打印既不是左边界，也不是右边界的叶子节点
            printLeafNotInMap(head, 0, edgeMap);

          //倒着打印右边界，但不是左边界的节点
            for (int i = edgeMap.length - 1; i != -1; i--) {
                if (edgeMap[i][0] != edgeMap[i][1]) {
                    System.out.print(edgeMap[i][1].value + "");
                }
            }
            System. out .println();
        }
        public int getHeight (Node head, int h) {
            if(head==null) {
                return h;
            }
                return Math . max (getHeight( head.left, h + 1),getHeight (head.right, h + 1));
            }
            public void setEdgeMap (Node head, int h, Node[][] edgeMap) {
                if(head==null) {
                    return;
                }
                    edgeMap[h][0] = edgeMap[h][0] == null ? head : edgeMap[h][0];
                    edgeMap[h][1] = head;
                    setEdgeMap (head.left,h+1,edgeMap);
                    setEdgeMap (head.right,h + 1, edgeMap) ;
                }
                public void printLeafNotInMap (Node head, int h, Node[][] m) {
                    if(head==null) {
                        return;
                    }
                        if (head.left==null && head.right == null&&head != m[h][0] && head != m[h][1]) {
                            System.out.print(head.value + "");
                        }
                                    printLeafNotInMap (head.left,h + 1, m);
                            printLeafNotInMap (head.right,h + 1,m);

    }
    }
