package Bit_Manipulation;

public class Code389FindDifference {
    public char findTheDifference(String s, String t) {
        char res=0;
        for(int i=0;i<s.length();i++)
        {
            res^=s.charAt(i)^t.charAt(i);
        }
        //异或会获得二者不同的地方。
        res^=t.charAt(s.length());
        return res;
    }
}
