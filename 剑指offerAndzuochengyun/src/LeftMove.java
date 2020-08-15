import java.lang.*;

/**
 * 天杀的StringBuffer
 */
public class LeftMove {
    public java.lang.String LeftRotateString(String str, int n) {
        int len=str.toString().length();
       StringBuffer a=new StringBuffer(str.toString());
       a.reverse();
       StringBuffer tempa=new StringBuffer(a.substring(0,len-n));
       StringBuffer tempb=new StringBuffer(a.substring(len-n,len));
      String last=tempa.append(tempb).toString();
       return last;




    }
}
