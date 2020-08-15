public class FindFirstChar {
    StringBuffer sb=new StringBuffer();
    Character[] chars=new Character[256];
    //char的取值范围 0-255
    public void Insert(char ch)
    {
        sb.append(ch);
        chars[ch]++;

    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char[] temp=sb.toString().toCharArray();
        for(char c:temp)
        {
            if(chars[c]==1)
                return c;
        }
        return '#';

    }
}
