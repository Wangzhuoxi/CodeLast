import java.util.Stack;

public class Code20Valid {
    public boolean isValid(String s) {
        char[] str=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:str)
        {
            if(stack.size()==0)
                stack.push(c);
            else
                if(sym(stack.peek(),c))
                    stack.pop();
                else
                    stack.push(c);
        }
        return stack.size()==0;
    }
    public boolean sym(char l, char r)
    {
        if(l=='('&&r==')'||l=='['&&r==']'||l=='{'&&r=='}')
            return true;
        else
            return false;
    }
}
