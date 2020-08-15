package KedaxunfeiTest;

import java.util.Scanner;

public class AbstractNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(getNum(s));
        return;
    }
    public static int getNum(String s){
        boolean has=false;
        char[] arr=s.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<s.length();i++)
        {
            if(arr[i]=='+'||arr[i]=='-')
            {
                if(has==false) {
                    has = true;
                    sb.append(arr[i]);
                }
                else
                    return -1;
            }
            if(arr[i]>='0'&&arr[i]<='9')
                sb.append(arr[i]);
        }
       return Integer.valueOf(String.valueOf(sb));

    }
}
