public class Code13RomanToInt {
    public static int romanToInt(String s) {
        char[] temp=s.toCharArray();
        int res=0;
        for(int i=0;i<s.length();i++)
        {
            if(temp[i]=='M')
                res+=1000;
            if(temp[i]=='D')
                res+=500;
            if(temp[i]=='C')
            {
                if(i==s.length()-1)
                {
                    res+=100;
                    break;
                }
                if(temp[i+1]=='D')
                {
                    res+=400;
                    i++;
                }
             else   if(temp[i+1]=='M')
                {
                    res+=900;
                    i++;
                }
                else
                    res+=100;
            }
            if(temp[i]=='L')
                res+=50;
            if(temp[i]=='X')
            {
                if(i==s.length()-1)
                {
                    res+=10;
                    break;
                }
                if(temp[i+1]=='L')
                {
                    res+=40;
                    i++;
                }
                else   if(temp[i+1]=='C')
                {
                    res+=90;
                    i++;
                }
                else
                    res+=10;
            }
            if(temp[i]=='I')
            {
                if(i==s.length()-1)
                {
                    res+=1;
                    break;
                }
                if(temp[i+1]=='V') {
                    res += 4;
                    i++;
                }
             else   if(temp[i+1]=='X')
                {
                    res+=9;
                    i++;
                }
                else
                    res+=1;
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
