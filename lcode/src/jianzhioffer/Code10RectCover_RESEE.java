package jianzhioffer;

public class Code10RectCover_RESEE {
    public int RectCover(int target) {
    if(target==1)
        return 1;
    if(target==2)
        return 2;
    return RectCover(target-1)+RectCover(target-2);
}
}
