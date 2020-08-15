package jianzhioffer;

public class Code09JumpFloor2 {
    public int JumpFloorII(int target) {
               if(target==1)
            return 1;
        if(target==2)
            return 2;
        int count=0;
        for(int i=1;i<=target;i++)
            count+=JumpFloorII(i);
        return count;

    }
}
