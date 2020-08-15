import javax.annotation.Resources;
import java.util.ArrayList;

public class ReverseSentence {
    /**
     * 先将整个字符串反转，再将每个单词反转。
     * @param str
     * @return
     */
    public static String ReverseSentence(String str) {
        if(str==null||str.length()==0)
            return str;
       String re= Reverse(str);

        String last="";
        String[] words=re.split(" ");
        for(int i=0;i<words.length-1;i++)
        {
           last+= Reverse(words[i])+" ";
        }
        last+=Reverse(words[words.length-1]);
        return last;

    }
    public static String Reverse(String str)
    {
        StringBuffer buffer=new StringBuffer();
        for(int i=str.length()-1;i>=0;i--)
        {
            buffer.append(str.charAt(i));
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        String a="student. a am I";
        System.out.println(ReverseSentence(a));
    }
}
