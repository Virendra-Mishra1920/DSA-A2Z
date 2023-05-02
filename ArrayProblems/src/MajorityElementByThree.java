import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class MajorityElementByThree
{
    public static void main(String[] args)
    {
        int[] arr={3,2,3};
        System.out.print(majorityElementOPtimal(arr));
    }

    // better solution
    // we know that in the array at max we will have 2 mejorty element which >N/3
    // TC=O(N)
    // Sp=O(N)

    public  static  List<Integer> majorityElementOPtimal(int[] nums)
    {
        List<Integer> ans=new ArrayList<>();
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;
        int n=nums.length;
        int min=nums.length/3+1;

        for (int i=0;i<n;i++)
        {
            if(count1==0 && nums[i]!=ele2)
            {
                count1=1;
                ele1=nums[i];
            }

            else if(count2==0 && nums[i]!=ele1)
            {
                count2=1;
                ele2=nums[i];
            }

            else if(ele1==nums[i])
                count1++;
            else if(ele2==nums[i])
                count2++;
            else
            {
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;

        for (int i=0;i<n;i++)
        {
            if (ele1==nums[i])
                count1++;
            if (ele2==nums[i])
                count2++;
        }

        if (count1>=min)
            ans.add(ele1);

        if (count2>=min)
            ans.add(ele2);

        return  ans;
    }
    public static List<Integer> majorityElement(int[] nums)
    {
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int min=nums.length/3+1;
        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            Integer val=map.get(nums[i]);

            if(map.get(nums[i])==null)
            {
                map.put(nums[i],1);
            }

            else
            {
                map.put(nums[i],++val);
            }
            if(map.get(nums[i])==min)
            {
                list.add(nums[i]);
            }

            if(list.size()==2)
                break;
        }

        return list;

    }


    public static int majority(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {
                    count++;
                }
            }

            if (count>arr.length/3)
            {
                return arr[i];
            }
        }
        return -1;
    }
}
