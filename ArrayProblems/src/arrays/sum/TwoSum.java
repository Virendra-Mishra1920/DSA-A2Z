package arrays.sum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum
{
    public static void main(String[] args) {

        int[] arr={2,7,11,15};
        System.out.print(Arrays.toString(twoSumProblem(arr,9)));
    }


    public  static  int[] twoSumProblem(int[] arr, int target)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++)
        {
            int extra=target-arr[i];
            if(map.containsKey(extra))
            {
                int index=map.get(extra);
                return  new int[]{index,i};
            }

            map.put(arr[i],i);
        }

        return  new int[] {-1,-1};
    }
}
