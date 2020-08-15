import java.util.Scanner;

/**
 * n个点，m条边。只能走两条边，在1，到公司n点。看是否能回公司
 */
public class ReturnToCompsny {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int group=sc.nextInt();
        while(group>0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][] tmp=new int[n+1][n+1];
            while(m>0){
                int a=sc.nextInt();
                int b=sc.nextInt();
                tmp[a][b]=1;
                tmp[b][a]=1;
                m--;
            }
            getCompany(tmp);
            group--;
        }
        return;

    }
    public static void getCompany(int[][] v){
        int n=v.length;
        for(int i=2;i<n;i++){
            if(v[1][i]==1){
                if(i==n-1){
                    System.out.println("POSSIBLE");
                return;
            }
                    if(v[i][n-1]==1) {
                        System.out.println("POSSIBLE");
                        return;
                    }
                }
            }
        System.out.println("IMPOSSIBLE");
        return;
        }
    }

