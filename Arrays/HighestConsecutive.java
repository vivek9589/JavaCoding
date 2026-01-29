package Arrays;

import java.util.HashMap;
import java.util.Map;

public class HighestConsecutive 
{
    public static void main(String[] args) {

        System.out.println("");
        

        int arr[] = {0,0,0,0,1,1,1,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,1,1};

        int maxCount = Integer.MIN_VALUE;
        int count = 0;

        Map<Integer, Integer> map = new HashMap<>();

    
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] != arr[i+1])
            {
                if(count > maxCount)
                {
                    maxCount = count;
                    map.clear();
                    map.put(arr[i-1], maxCount);
                }

                count = 1;
            }else count++;
             
             
        }
        System.out.println("max --> "+ maxCount);
        System.out.println(map);
        

    }
}