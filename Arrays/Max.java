
public class Max 
{
    public static void main(String[] args) {

        int arr[] = {0,0,0,0,1,1,1,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,1,1};

        int maxCount = Integer.MIN_VALUE;
        int count = 0;

        int number = arr[0];

    
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i] != arr[i+1])
            {
                if(count > maxCount)
                {
                    maxCount = count;
                   number = arr[i-1];
                }
                count = 1;
            }else count++;
             
     
        }

        System.out.println(number);
    }
}