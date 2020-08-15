package testTwice;

public class LeftRotate {
    public String ReverseSentence(String str) {
        String[] res=str.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=res.length-1;i>0;i--)
            sb.append(res[i]+" ");
        sb.append(res[0]);
        return sb.toString();
    }
}
