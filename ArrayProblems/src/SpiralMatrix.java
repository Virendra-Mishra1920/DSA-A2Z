import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix
{
    public static void main(String[] args) {

        int[][] arr={
                    {1,2},
                    {4,5,6},
                    {7,8}
        };
      System.out.print(spiralOrder(arr));

    }

    public static List<Integer> spiralOrder(int[][] arr) {

        List<Integer> ans=new ArrayList<>();

        int m=arr.length;
        int n=arr[m/2].length;

        int left=0, right=m-1;
        int top=0, bottom=n-1;

        while(top<=bottom && left<=right)
        {
            // move left to right

            for(int i=left;i<=right;i++)
            {
                ans.add(arr[left][i]);
            }
            top++;

            // move top to bottom
            for(int i=top;i<=bottom;i++)
            {
                ans.add(arr[i][right]);
            }
            right--;

            if(top<=bottom)
            {
                // move right to left
                for(int i=right;i>=left;i--)
                {
                    ans.add(arr[bottom][i]);
                }
                bottom--;

            }


            if(left<=right)
            {
                // move bottom to top
                for(int i=bottom;i>=top;i--)
                {
                    ans.add(arr[i][left]);
                }
                left++;

            }

        }

        return ans;
    }
}
