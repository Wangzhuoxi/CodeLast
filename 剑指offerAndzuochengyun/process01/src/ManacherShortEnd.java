public class ManacherShortEnd {
    /**
     * 添加字符串，让整个数组为回文字符串
     * @param str
     * @return
     */
public  static char[] manacherString(String str)
{
    char[] arr=new char[str.length()*2+1];
    int index=0;
    for(int i=0;i<arr.length;i++)
    {
       arr[i]= ((i&1)==0?'#':str.charAt(index++));
    }
    return arr;
}

        public static String shortestEnd(String str) {
    int maxContainsEnd=0;
            char[] arr=manacherString(str);
            int[] pArr=new int[arr.length];//半径数组
            int index=-1;//回文中心
            int pR=-1;//最有边界
            for (int i = 0; i != arr.length; i++) {

                   pArr[i]=(i<pR)?Math.min(pR-i,pArr[2*index-i]):1;
                   while(i+pArr[i]<arr.length&&i-pArr[i]>-1)
                   {
                       if(arr[pArr[i]+i]==arr[i-pArr[i]])
                           pArr[i]++;
                       else
                           break;
                   }
                //每次扩完重新确定index和右边界
                if(pR<pArr[i]+i)
                {
                    pR = i + pArr[i];
                    index = i;
                }
                if (pR == arr.length) {//到了最后，停止。
                    maxContainsEnd = pArr[i];//最长回文半径，也就是原数组的最长回文直径
                    break;
                }
            }
char[] res=new char[str.length()-maxContainsEnd+1];
            for(int i=0;i<res.length;i++)
            {
                res[res.length-i-1]=arr[2*i+1];
            }
return  String.valueOf(res);
        }

        public static void main(String[] args) {
            String str2 = "abcd123321";
            System.out.println(shortestEnd(str2));

        }


}
