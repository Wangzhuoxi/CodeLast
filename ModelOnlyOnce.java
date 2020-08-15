import java.util.*;

public class ModelOnlyOnce {
    /**
     * 模型文件去重：给出多个用户类型对应模型文件 要求给出模型文件输出对应的用户类型
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        LinkedHashMap<String,HashSet<String>> map=new LinkedHashMap<>();
        for(int i=0;i<N;i++){
            String a=sc.next();
            String b=sc.next();
      if(map.containsKey(b)){
         HashSet<String>set=map.get(b);
         set.add(a);
         map.put(b,set);
      }
      else{
          HashSet<String> set=new HashSet<>();
          set.add(a);
          map.put(b,set);
      }
        }

        for(String s:map.keySet()) {
            System.out.print(s+" ");
            ArrayList<String> list=new ArrayList<>();
            for(String tmp:map.get(s)){
                list.add(tmp);
            }
           Collections.sort(list);
            for(String l:list)
                System.out.print(l+" ");

        }

    }
}
