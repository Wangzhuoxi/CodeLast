public class Code58LasgWordLength {
    public static int lengthOfLastWord(String s) {
       if(s==null||s.length()==0)
           return 0;

       if(s.indexOf(" ")==-1)
           return s.length();
      String s2= s.trim();
       char[] temp=s2.toCharArray();
       int count=0;
        for(int i=0;i<s2.length();i++)
        {
            if(temp[i]!=' ')
                count++;
            if(temp[i]==' ')
            {
                count=0;
            }
        }
       return count;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a "));
    }
}
