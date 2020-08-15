package testTwice;

import java.util.Arrays;

public class IsContinious {
    public boolean isContinuous(int [] numbers) {
        if( numbers==null||numbers.length<5)
            return false;
        Arrays.sort(numbers);
       int index=0;
    for(int i=0;i<5;i++) {
        if (numbers[i] == 0)
            index++;
        else
            break;

    }
    int need=0;
    for(int i=index+1;i<5;i++)
    {
        need+=numbers[i]-numbers[i-1]-1;
    }
    if(need>index)
        return false;
    else
        return true;
    }
}
