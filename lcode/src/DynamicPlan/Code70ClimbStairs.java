package DynamicPlan;

public class Code70ClimbStairs {

        public int climbStairs(int n) {
            int result1 = 0;
            int result2 = 0;
            if (n == 1) {
                return 1;
            }
            for (int i = 1; i <= n; i++) {
                if (i == 1) {
                    result1 = 1;
                }
                else if (i == 2) {
                    result2 = 2;
                }
                else {
                    int tmp = result2;
                    result2 += result1;
                    result1 = tmp;
                }

            }
            return result2;
        }



}
