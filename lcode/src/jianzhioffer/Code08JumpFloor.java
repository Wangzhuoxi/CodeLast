package jianzhioffer;

public class Code08JumpFloor {
    public int JumpFloor(int target) {
        if(target==1||target==2)
            return 1;
        return JumpFloor(target-1)+JumpFloor(target-2);

    }
}
