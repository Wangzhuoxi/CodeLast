import java.util.HashMap;

public class Code_02_RandomPool {
    public static class Pool<K>//K是泛型。
    {
        private HashMap<K,Integer> keyindexmap;
        private HashMap<Integer,K> indexkeymap;
        private int size=0;
        public Pool()
        {
            keyindexmap=new HashMap<>();
            indexkeymap=new HashMap<>();
            this.size=0;
        }
        public void insert(K key)
        {
            keyindexmap.put(key,size);
            indexkeymap.put(size++,key);
        }
        public K getRandom()
        {
            int n= (int) (Math.random()*this.size);
            return indexkeymap.get(n);

        }
        public void delete(K key)
        {
            Integer temp=keyindexmap.get(key);
            K last=indexkeymap.get(--this.size);//因为每放入一个keyvaluesize都指向下一个。
            indexkeymap.put(temp,last);
            keyindexmap.put(last,this.size);
            indexkeymap.remove(this.size);
            keyindexmap.remove(key);


        }

    }

    public static void main(String[] args) {
        Pool<String> pool = new Pool<String>();
        pool.insert("zuo");
        pool.insert("cheng");
        pool.insert("yun");
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());

        pool.delete("yun");
        System.out.println("=============");
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());

        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());
        System.out.println(pool.getRandom());

    }


}
