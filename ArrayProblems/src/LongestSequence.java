import java.util.Collections;
import java.util.HashSet;

public class LongestSequence
{
    public static void main(String[] args) {

        int[] arr={100,4,200,1,3,2};
        //System.out.println(longestConsecutive(arr));
        int[][] arr1=new int[4][3];

        int[] row=new int[arr1.length];
        int len1=row.length;

        int[] col=new int[arr1[len1/2].length];
        int len2=col.length;


    }

    public  static int longestSequence(int[] arr)
    {
        int count=0;
        for (int i=0;i<arr.length;i++)
        {
            int x=arr[i];
            count=1;

            for (int j=0;j<arr.length;j++)
            {
                if (arr[j]==x+1)
                {
                    x=x+1;
                    count+=1;
                    j=0;;
                }
            }
        }
        return count;
    }


    public static int longestConsecutive(int[] nums)
    {
        HashSet<Integer> set=new HashSet<>();
        int count=0,x=0,largest=0;
        if(nums.length==0)
            return 0;

        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }

        for(int item: set)
        {
            if(!set.contains(item-1))
            {
                x=item;
                count=1;

                while(set.contains(x+1))
                {
                    x=x+1;
                    count++;
                }

                largest=Math.max(largest,count);
            }
        }

        return count;

    }

}
