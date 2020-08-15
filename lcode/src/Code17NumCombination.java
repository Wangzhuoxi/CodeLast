import java.util.ArrayList;
import java.util.List;

public class Code17NumCombination {
    public static List<String> letterCombinations(String digits) {
        if(digits==null||  digits.isEmpty())

            return null;
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<>();
        res.add("");
        for(char c:digits.toCharArray())
        {
            res=combine(map[c-'0'],res);
        }

        return res;
    }
    public static List<String> combine(String c, List<String>res)
    {
        List<String> list=new ArrayList<>();
        for(char temp:c.toCharArray()) {

            for (String s : res) {
                list.add( s+temp);
            }
        }
            return list;


    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

}
