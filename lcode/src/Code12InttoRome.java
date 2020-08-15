import java.util.HashMap;

public class Code12InttoRome {
    public static String intToRoman(int num) {
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String reps[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<values.length;i++)
        {
            while(num>=values[i])
            {
               sb.append(reps[i]);
                num-=values[i];
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(900));
    }
}
