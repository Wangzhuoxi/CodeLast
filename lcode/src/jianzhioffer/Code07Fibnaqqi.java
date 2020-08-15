package jianzhioffer;

public class Code07Fibnaqqi {
    public  static int Fibonacci(int n) {
        if(n==1)
            return 1;
         if(n==2)
            return 1;

            return Fibonacci(n-1)+Fibonacci(n-2);

    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(5));
    }
}
