import java.util.Scanner;

public class SalesCoupon {
    /**
     * 二分查找，找到得是应该插入得位置，然后返回之前。
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] coupons = new int[n];
        int[] items = new int[m];
        for (int i = 0; i < n; i++) {
            coupons[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            items[i] = sc.nextInt();
        }
        System.out.println(MinMoney(coupons, items));
    }

    public static int MinMoney(int[] a, int[] b) {
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            //对商品的每个数二分查找

            System.out.println(b[i] + "优惠券是" + findCoupon(a, b[i]));
            sum += b[i] - findCoupon(a, b[i]);
        }
        return sum;

    }

    public static int findCoupon(int[] a, int b) {
        int n = a.length;
        if (b > a[n - 1])
            return a[n - 1];
        int l = 0;
        int r = n;
        while (l < r) {
            int mid = (l + r) / 2;
            if (a[mid] < b) {
                l = mid + 1;
            } else if (a[mid] > b) {
                r = mid;
            } else
                return a[mid];
        }
        if (l < 0)
            return 0;
        return a[l-1];
    }
}