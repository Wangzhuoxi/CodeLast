import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LRU {
   /* int capacity;
    LinkedHashMap<Integer,Integer> cache;
    public LRU(int capacity) {
        this.capacity = capacity;
        //排序方式 false 基于插入顺序  t
        // rue  基于访问顺序
        cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75f, true){
          //  LinkedHashMap有一个removeEldestEntry(Map.Entry eldest)方法，
            //  通过覆盖这个方法，加入一定的条件，满足条件返回true。当put进新的值方法返回true时，便移除该map中最老的键和值。

            @Override
            protected boolean removeEldestEntry(java.util.Map.Entry eldest)
            {
                return capacity<cache.size();
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }
*/


    int capacity;
    LinkedHashMap<Integer,Integer> cache;
    public LRU(int capacity){
        this.capacity=capacity;
        cache=new LinkedHashMap<Integer, Integer>(capacity, (float) 0.75,true){
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return cache.size()>capacity;
            }
        };
    }
    public int get(int key){
        return cache.getOrDefault(key,-1);
    }
    public void put(int key,int value){
        cache.put(key,value);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        LRU lru=new LRU(N);
            String move=sc.nextLine();
            if(move.equals("get")){
              lru.get(sc.nextInt());
            }
            if(move.equals("put")){
               lru.put(sc.nextInt(),sc.nextInt());
            }

        for(Integer key:lru.cache.keySet()){
            System.out.println(key+" "+lru.get(key));
        }
     return;

    }
}