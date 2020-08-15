package Backtrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 输⼊两个数字	n,k	，算法输出[1..n]中k个数字的所有组合。
 */

public class ArraySubsetLengthK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(n);
        int k=sc.nextInt();
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        dfs(res,temp,1,n,k);
        System.out.println(res);
        return;
    }
    public static void dfs(List<List<Integer>> res, List<Integer> temp,int i,int n,int k){
      if(temp.size()==k) {
         res.add(new ArrayList<>(temp));
          return;
      }
      for(int j=i;j<=n;j++){
          temp.add(j);
          dfs(res,temp,j+1,n,k);
          temp.remove(temp.size()-1);
      }


    }

}
