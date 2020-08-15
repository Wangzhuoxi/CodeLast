package testTwice;

public class FirstOnce {
    //Insert one char from stringstream
    StringBuffer sb= new StringBuffer();
    int []str=new int[256];
    public void Insert(char ch)
    {
        sb.append(ch);
        str[ch]++;

    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(char c:sb.toString().toCharArray())
        {
            if(str[c]==1)
                return c;
        }
return '#';
    }
}
