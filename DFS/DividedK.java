package DFS;

import java.util.Scanner;

/**
 * n个人，每次划分两个队伍，相差k个人，满足不了这个条件就驻扎。问一共可以驻扎多少个ying
 */
public class DividedK {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        System.out.println(getRes(n,k));
        return;
    }
    public static int getRes(int n,int k ){
        if(n<=k) {
            return 1;
        }
        else if((n-k)%2==0){
            return getRes((n-k)/2,k)+getRes((n+k)/2,k);
        }
        else
            return 1;
    }
}
