package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * n个补给站，位置不同，一共要走完D公里，初始给W升水，每一公里消耗1L.最少补给几次
 * 贪心算法
 */
public class GetEnoughWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D = Integer.parseInt(sc.nextLine());//总共D公里
        int W =  Integer.parseInt(sc.nextLine());
        String s=sc.nextLine();
        String[] pos=s.split(" ");
        int[]  position = Arrays.stream(pos).mapToInt(Integer::parseInt).toArray();
        String s2=sc.nextLine();
        String[] sup=s2.split(" ");
         int[]  supply = Arrays.stream(sup).mapToInt(Integer::parseInt).toArray();
        System.out.println(getMinTime(D,W,position,supply));
        return;

    }
    public static int getMinTime(int D, int W, int[] position, int[] supply) {
        int curPos = 0;
        int res = 0;
        boolean[] use = new boolean[position.length];
        while (curPos < D) {
            curPos += W;
            W = 0;
            if (curPos >= D)
                return res;
            //记录上次打水的位置
            int index = -1;
            for (int i = 0; i < position.length; i++) {
                //到不了，则不能在该加油站加油
                if (position[i] > curPos)
                    continue;
                //找打水的位置：没打过并且比W大
                if (!use[i] && supply[i] > W) {
                    W = supply[i];
                    index = i;
                }
            }
            if (index == -1)
                return -1;
            use[index] = true;
            res++;
        }
        return res;
    }

}
