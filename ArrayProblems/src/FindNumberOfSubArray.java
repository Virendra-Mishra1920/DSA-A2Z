import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import  java.util.Map.Entry;
public class FindNumberOfSubArray
{
    public static void main(String[] args) {

        int[] arr={1,2,3};
       System.out.println(subarray(arr,3));

    }

    // here we are finding no of subarrays of kth element
    public  static int subarrayv1(int[] arr, int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0,count=0;
        map.put(0,1);
        for (int i: arr)
        {
            sum+=i;

            int rem=sum-k;

            if(map.containsKey(rem))
            {
                count+=map.get(rem);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        return count;
    }


    // This is also optimal solution but it will not work in +v,-ve 0 toghter
    public  static int subarray(int[] arr,int k)
    {
        int left=0,right=0,count=0,sum=arr[0];
        int n=arr.length;

        while (right<n)
        {
            while (left<=right && sum>k)
            {
                sum-=arr[left];
                left++;
            }

            if (sum==k)
            {
                count++;
            }
            right++;
            if(right<n)
            {
                sum+=arr[right];
            }
        }

        return  count;

    }


    // brute force
    //Tc=O(n*n)
    //sp=O(1)
    public static int findsubarray(int[] arr, int k)
    {
        int count=0;
        int n=arr.length;

        for (int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=arr[j];
                if(sum==k)
                {
                    System.out.print("["+arr[i]+","+arr[j]+"]");
                    System.out.println();
                    count++;
                }
            }
        }

        return count;
    }

    //
    public static int findsubarrayv2(int[] arr, int k)
    {
        int sum=0,Maxcount=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);

        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if (sum==k)
            {
                Maxcount++;
            }

            int rem=sum-k;

            if(map.containsKey(rem))
            {
               Maxcount+=map.get(rem);
            }

            map.put(sum,i);

        }
        return Maxcount;

    }
}
