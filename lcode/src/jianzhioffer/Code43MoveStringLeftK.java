package jianzhioffer;

public class Code43MoveStringLeftK {
    public static String LeftRotateString(String str,int n) {

        StringBuffer s= new StringBuffer(str);
        StringBuffer res=s.reverse();
        System.out.println(res.toString());
        StringBuffer a=new StringBuffer(res.substring(n-n,str.length()-n)).reverse();
        System.out.println(a);
        StringBuffer b=new StringBuffer(res.substring(str.length()-n,str.length())).reverse();
        return a+b.toString();


    }

    public static void main(String[] args) {
        System.out.println(LeftRotateString("abc",1));
    }

}
