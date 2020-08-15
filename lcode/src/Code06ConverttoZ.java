import java.util.ArrayList;
import java.util.List;

public class Code06ConverttoZ {
    public static  String convert(String s, int numRows) {
        if (s == null || s.length() == 0 || numRows <= 1)
            return s;
        List<ArrayList<Character>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++)
            list.add(new ArrayList<Character>());
        int index = 0;
        int i = 0;
        int n = s.length();
        while (i < n) {
            while (index < numRows && i < n) {
                list.get(index).add(s.charAt(i++));
                index++;
            }
            if (i >= n)
                break;
            if (index == numRows)
                index = index - 2;
            while (index > 0&&i<n) {
                list.get(index).add(s.charAt(i++));
                index--;
            }
        }

        StringBuffer str = new StringBuffer();
        for (int m = 0; m < list.size(); m++) {
            for (int j = 0; j < list.get(m).size(); j++) {
                str.append(list.get(m).get(j));
            }

        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        System.out.println(convert("ABCDE",4));

    }
}
