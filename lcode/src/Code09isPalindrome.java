public class Code09isPalindrome {
    public static boolean isPalindrome(int x) {
if(x<0)
    return false;
StringBuffer sb=new StringBuffer(String.valueOf(x));
        String a=sb.toString();
     StringBuffer reverse=sb.reverse();
       String b=reverse.toString();
     if(a.equals(b)) {
         return true;
     }
else
    return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(100));
    }
}
