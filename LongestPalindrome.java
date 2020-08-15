public class LongestPalindrome {
    /**
     * 复杂度 n2
     * @param s
     * @return
     */
    public static String longestPalindrome(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            String s1=isPalindrome(s,i,i);
            //回文可能是偶数个
            String s2=isPalindrome(s,i,i+1);
          if(res.length()<s1.length())
              res=s1;
            if(res.length()<s2.length())
                res=s2;
        }
        return res;
    }
   public  static String  isPalindrome(String s,int l ,int r){
        char[] arr=s.toCharArray();
        while(l>=0&&r<=s.length()-1&&l<=r&&arr[l]==arr[r]){
            l--;
            r++;
        }
        if(l==r)
            return String.valueOf(arr[l]);
      else
          return s.substring(l+1,r);
   }

    public static void main(String[] args) {
        String temp="cabae";
        System.out.println(longestPalindrome(temp));
    }
}
