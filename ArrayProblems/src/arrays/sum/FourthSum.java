package arrays.sum;

import javafx.print.Collation;
import sun.text.resources.sk.CollationData_sk;

import java.util.*;

public class FourthSum
{
    public static void main(String[] args)
    {
        int[] arr={1000000000,1000000000,1000000000,1000000000};
        int target=-294967296;
        System.out.print(fourthSumV3(arr,target));
    }

    public static  List<List<Integer>> fourthSumV3(int[] arr, int target)
    {
        List<List<Integer>> ans=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++)
        {
            if(i>0 && arr[i]==arr[i-1])
            {
                continue;
            }

            for (int j=i+1;j<n;j++)
            {
                if(j!=i+1 && arr[j]==arr[j-1])
                {
                    continue;
                }

                int low=j+1,high=n-1;
                long sum=0;
                while (low<high)
                {
                    sum=arr[i]+arr[j]+arr[low]+arr[high];
                    if(sum==target)
                    {
                        List<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[low]);
                        temp.add(arr[high]);
                        ans.add(temp);

                        while (low<high && arr[low]==arr[low+1])low++;
                        while (low<high && arr[high]==arr[high-1]) high--;
                        low++;
                        high--;
                    }

                    else if(sum<target)
                        low++;
                    else
                        high--;

                }

            }
        }
        return  ans;
    }

    // this is extreme level brute force approch to solve fourth sum.
    // here time complixity is O(n*n*n*n) which is too large
    // space complixity is we are using temp list to add O(n) set to return O(logn)

    public static Set<List<Integer>> fourthSum(int[] arr, int target)
    {
        Set<List<Integer>> set=new HashSet<>();
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    List<Integer> temp=new ArrayList<>();
                    int sum=0;
                    for (int l=k+1;l<n;l++)
                    {
                        sum=arr[i]+ arr[j]+arr[k]+arr[l];
                        if(sum==target)
                        {
                            temp.add(arr[i]);
                            temp.add(arr[j]);
                            temp.add(arr[k]);
                            temp.add(arr[l]);

                            Collections.sort(temp);
                            set.add(temp);
                        }

                    }
                }
            }
        }
        return set;
    }

    public  static  Set<List<Integer>> fourthSumV2(int[] arr, int target)
    {
        Set<List<Integer>> set=new HashSet<>();
        int n=arr.length;
        for (int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                Set<Integer> hashset=new HashSet<>();
                int sum=0;
                for(int k=j+1;k<n;k++)
                {
                    sum=target-(arr[i]+arr[j]+arr[k]);
                    if (hashset.contains(sum))
                    {
                        List<Integer> temp=new ArrayList<>();
                        temp.add(arr[i]);
                        temp.add(arr[j]);
                        temp.add(arr[k]);
                        temp.add(sum);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                    hashset.add(arr[k]);

                }
            }
        }
        return  set;
    }
}
