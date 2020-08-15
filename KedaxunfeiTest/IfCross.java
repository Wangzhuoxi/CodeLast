package KedaxunfeiTest;

import java.util.Scanner;

public class IfCross {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int[] point=new int[8];

         for(int i=0;i<8;i++)
             point[i]=sc.nextInt();

     if(point[2]<point[0])
     {
         int temp=point[2];
         point[2]=point[0];
         point[0]=temp;
         int tempy=point[1];
         point[1]=point[3];
         point[3]=tempy;
     }
     if((point[4]>=point[0]&&point[4]<=point[2]&&point[5]>=point[1]&&point[5]<=point[3])||(point[6]>=point[0]&&point[6]<=point[2]&&point[7]>=point[1]&&point[7]<=point[3]))
         System.out.println(1);
     else
         System.out.println(0);
     return;
    }

}
