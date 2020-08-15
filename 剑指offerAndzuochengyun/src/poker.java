import java.util.Arrays;

public class poker {
    public boolean isContinuous(int [] numbers) {
        Arrays.sort(numbers);
        int count=0;
        int len=0;
        for(int i=0;i<numbers.length-1;i++)
        {
            if(numbers[i]==0)
            {
                count++;
                continue;
            }
            else
                if(numbers[i]==numbers[i+1])
                    return false;
                else
                    len+=numbers[i+1]-numbers[i]-1;
        }
        if(len>count)
            return false;
        return true;


        }

}
