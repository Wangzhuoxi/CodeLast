public class Code05LongestPalindrome {
    public static String longestPalindrome(String s) {
        char[] arr = manacherString(s);

        int r = -1;
        int c = -1;
        int res=0;
        int[] pArr = new int[arr.length];//半径数组
        for (int i = 0; i < arr.length; i++) {
            pArr[i] = i < r ? Math.min(r - i, pArr[2 * c - i]) : 1;
            while (i + pArr[i] < arr.length && i - pArr[i] > -1) {
                if (arr[pArr[i] + i] == arr[i - pArr[i]])
                    pArr[i]++;
                else
                    break;
            }
                if (pArr[i] + i > r) {
                    r = pArr[i] + i;
                    c = i;
                }

                if (r == arr.length)
                   {

                     break;
                   }
            }

int max=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++)
       {
          if(pArr[i]>max)
          {
              max=pArr[i];
              res=i;
          }
       }

String maxStr=String.valueOf(arr).substring(res-pArr[res]+1,res-pArr[res]+1+2*(pArr[res]-1)+1);
        System.out.println(maxStr);

              String last=  maxStr.replaceAll("#","");
              return last;

    }

    public static  char[] manacherString(String s)
    {
        char[] temp=new char[2*s.length()+1];
      int index=0;
        for(int i=0;i<temp.length;i++)
        {
            temp[i]=(i&1)==0?'#':s.charAt(index++);

        }
     return temp;
    }

    public static void main(String[] args) {
        String s="cbba";
       String res=longestPalindrome(s);
        System.out.println(res);
    }
}
