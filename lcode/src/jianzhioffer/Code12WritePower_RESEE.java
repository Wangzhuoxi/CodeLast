package jianzhioffer;

public class Code12WritePower_RESEE {
    /**
     * 要点：1.判断指数的正负，复数要转换为正数。
     * 2.不需要循环求解power运算，而是一半一半的求解，二者相乘，复杂度减半。
     * @param base
     * @param exponent
     * @return
     */
    public double Power(double base, int exponent) {
        if(base==0)
            return 0;
        if(exponent==0)
            return 1;
        if(exponent<0)
            return 1/calPower(base,-exponent);
        else
            return  calPower(base,exponent);
    }
    public double calPower(double base,int exponent)
    {
        if(exponent%2==0)
         return    Power(base,exponent/2)*Power(base,exponent/2);
        else return Power(base,exponent/2)*Power(base,exponent/2)*base;

    }

}
