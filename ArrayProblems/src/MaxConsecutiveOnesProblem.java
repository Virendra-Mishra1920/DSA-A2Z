public class MaxConsecutiveOnesProblem
{
    public static void main(String[] args) {

        int[] arr={1,1,0,1,1,1};
       System.out.print(findMaxConsecutiveOnes(arr));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {

        int count=0,max=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
                max=Math.max(count,max);
            }
            else
            {
                count=0;
            }
        }
        return max;

    }
}
