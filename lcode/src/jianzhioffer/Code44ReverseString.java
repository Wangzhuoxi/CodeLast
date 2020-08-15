package jianzhioffer;

public class Code44ReverseString {
    public  static String ReverseSentence(String str) {

        String[] strs=str.split(" ");
      return   reverse(strs);

    }
    public  static String reverse(String[] strs) {
        int i = 0;
        int j = strs.length - 1;
        while (i < j) {
            String temp = strs[i];
            strs[i] = strs[j];
            strs[j] = temp;
            i++;
            j--;
        }
        StringBuffer a = new StringBuffer(strs[0]);
        for (int m = 1; m < strs.length; m++) {
            StringBuffer temp = new StringBuffer(strs[m]);
            a.append(" ");
            a.append(temp);
        }
    return a.toString();
    }

    public static void main(String[] args) {
        String a="student. a am I";
        System.out.println(ReverseSentence(a));
    }
}

