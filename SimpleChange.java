import java.util.Scanner;

public class SimpleChange {
    /**
     * 数组a变换成数组b:在一个区间内对所有的数字加上k
     * 差分数组
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int len=sc.nextInt();
        int[] a=new int[len];
        int[] b=new int[len];
        for(int i=0;i<len;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<len;i++){
            b[i]=sc.nextInt();
        }
        simpleChange(a,b);
        return;

    }
    public static void simpleChange(int[] a,int[] b){
        int n=a.length;
        int l=-1;
        int r=-1;
        int[] dif=new int[n];
        for(int i=0;i<n;i++){
            dif[i]=a[i]-b[i];
            if(dif[i]>0)
            {
                System.out.println("NO");
                return;
            }
            if(dif[i]!=0){
                if(l==-1)
                    l=i;
                else
                    if(dif[i]!=dif[l])
                    {
                        System.out.println("NO");
                        return;
                    }
                    else
                        r=i;
            }
        }
        System.out.println("YES");
    }

}
