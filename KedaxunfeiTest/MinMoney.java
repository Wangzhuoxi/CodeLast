package KedaxunfeiTest;

import java.util.Scanner;

public class MinMoney {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();
        int k=sc.nextInt();
        int[] money={1,5,10,50,100};
        System.out.println(getminmoney(money,a,b,c,d,e,k));
        return;
    }
   public static int  getminmoney(int[] money,int a,int b,int c,int d,int e,int k){
        int count=0;
        if(k>=100){
            int m=k/100;
            if(m>=e){
                k=k-100*e;
                count+=e;
            }
            else {
                k=k-100*m;
                count+=m;
            }
        }
        if(k==0)
            return count;
        if(k>=50){
            int m=k/50;
            if(m>=d){
                k=k-50*d;
                count+=d;
            }
            else {
                k=k-50*m;
                count+=m;
            }
        }
       if(k==0)
           return count;
       if(k>=10){
           int m=k/10;
           if(m>=c){
               k=k-10*c;
               count+=c;
           }
           else {
               k=k-10*m;
               count+=m;
           }
       }
       if(k==0)
           return count;
       if(k>=5){
           int m=k/5;
           if(m>=b){
               k=k-5*b;
               count+=b;
           }
           else {
               k=k-5*m;
               count+=m;
           }
       }
       if(k==0)
           return count;
       if(k>=1){
        if(k>a)
            return 0;
        else
            return count+k;
       }
       return -1;
   }
}
