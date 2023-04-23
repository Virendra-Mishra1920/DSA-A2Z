import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TwoSumProblem
{
    public static void main(String[] args) {

        int[] arr={2,2,5,8,11};
        System.out.println(IsTwoSumPossible(arr,14));

    }

    public  static List<Integer> twoSum(int[] arr, int target)
    {
        HashMap<Integer,Integer> map=new HashMap();
        List<Integer> list=new ArrayList<>();

        for (int i=0;i<arr.length;i++)
        {
            int extra=target-arr[i];

            if(map.containsKey(extra))
            {
                int index=map.get(extra);
                list.add(index);
                list.add(i);
            }

            map.put(arr[i],i);
        }
        return list;
    }

    public static String IsTwoSumPossible(int[] arr, int target)
    {
        int left=0, right=arr.length-1;
        int sum=0;

        while (left<right)
        {
            sum=arr[left]+arr[right];
            if(sum==target)
            {
                return "Yes";
            }

            else if(sum<target)
                left++;
            else

                right--;

        }

        return "No";
    }
}
