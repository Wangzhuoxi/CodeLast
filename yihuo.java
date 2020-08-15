import java.util.Scanner;

public class yihuo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[]a=new int[n];
        int[] b=new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            b[i]=sc.nextInt();
        System.out.println(yihuo(a,b));
        return;
    }
    public static int yihuo(int[] a,int [] b)
    {
        boolean first=true;
        int res=0;
        int n=a.length;
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
            {
                int temp=a[i]+b[j];
                if(first) {
                    res = temp;
                    first=!first;
                }
                else
                {
                    res=res^temp;
                }
            }
        return res;
    }
}
