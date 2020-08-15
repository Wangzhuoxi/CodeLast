package jianzhioffer;
//具体实现：
//
//        （1）首先选取数组中右上角的数字：如果该数字等于要查找的数字，查找过程结束；
//
//        （2）如果该数字大于要查找的数字，则剔除这个数字所在的列；
//
//        （3）如果该数字小于要查找的数字，则剔除这个数字所在的行。
public class Code01Find {
    public boolean Find(int target, int[][] array) {
        if(array!=null && array.length > 0 && array[0].length > 0){
            int row = array.length - 1; //初始化行的值
            int col = 0; //初始化列的值
            //循环遍历判断，寻找target
            while(row >= 0 && col <= array[0].length - 1){
                if(target == array[row][col]){
                    return true;
                }else if(target < array[row][col]){
                    row--;
                }else{
                    col++;
                }
            }
        }
        return false;
    }
}
