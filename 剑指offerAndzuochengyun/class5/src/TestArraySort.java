import java.util.Arrays;

public class TestArraySort {
    public static void main(String[] args) {
        String s="bca";
        char[] a=s.toCharArray();
        Arrays.sort(a);
        System.out.println(new String(a));
    }
}
