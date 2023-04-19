import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeroToEnd
{
    public static void main(String[] args) {

        int[]arr={1,0,2,3,0,0,0,4,5,0,9};
        moveZeors(arr);

    }

    // time complixity O(n)
    // space complixity O(n)

    public static void moveZeors(int[] arr)
    {
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i] != 0)
            {
                list.add(arr[i]);
            }
        }
            int len=list.size();
            for(int i=0;i<len;i++)
            {
                arr[i]=list.get(i);
            }

            for (int i=len;i<arr.length;i++)
            {
                arr[i]=0;
            }

            System.out.print(Arrays.toString(arr));
    }

    public  static  void moveZeors_optimal(int[] arr)
    {
        int j=-1;

        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }

        for(int i=j+1;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

        System.out.print(Arrays.toString(arr));
    }

}
