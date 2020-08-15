import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.LinkedList;

public class DuplicateNum {
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null||numbers.length==0)
            return false;
        LinkedList<Integer> nums = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            if (nums.contains(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            }

            nums.add(numbers[i]);
        }
        return false;
    }

    public static void main(String[] args) {
      int []num=  {2,3,1,0,2,5,3};
      int[] du=new int[1];
        System.out.println(duplicate(num,7,du));
        System.out.println(du[0]);

    }
}
