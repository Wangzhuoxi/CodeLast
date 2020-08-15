package jianzhioffer;

public class Code48TwoSumNoadd {
    public  static int Add(int num1,int num2) {
        int sum=0;
        while(num1!=0&&num2!=0){
            int a=num1&1;
            num1=num1>>1;
            int b=num2&1;
            num2=num2>>1;
            sum+=a+b;
        }
        while(num1!=0) {
            sum += num1 & 1;
            num1=num1>>1;
        }  while(num2!=0) {
            sum += num2 & 1;
            num2=num2>>1;
        }
return sum;
    }

    public static void main(String[] args) {
        System.out.println(Add(1,2));
    }
}
