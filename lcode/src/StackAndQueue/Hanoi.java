package StackAndQueue;

public class Hanoi {
    public static void hanoi(int n)
    {
        hanois(n,'A','B','C');
    }
    public static void hanois(int n,char A,char B,char C)
    {
        if(n==1)
        {
            move(n,A,C);
            return;
        }
        else
        {
            hanois(n-1,A,C,B);
            move(n,A,C);
            hanois(n-1,B,A,C);
        }

    }
    public  static  void move(int a,char m,char n)
    {
        System.out.println("move  "+a+"from  "+m+"to  "+n);
    }

    public static void main(String[] args) {
        hanoi(3);
    }
}
