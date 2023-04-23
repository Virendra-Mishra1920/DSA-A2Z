import java.util.Arrays;

public class SortZeorsOnesTwos
{
    public static void main(String[] args) {
        int[] arr={1,0,0,1,1,1,2,2,0,1};
       // sort(arr);
        sort_using_dutch_algo(arr);
        System.out.print(Arrays.toString(arr));

    }

    // we can sort by merge sort that takes time complixity O(nlogn)
    // we can improve it O(2n)

    public  static void sort(int[] arr)
    {
        int count0=0,count1=0,count2=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
                count0++;

            else if(arr[i]==1)
                count1++;
            else
                count2++;
        }

        for (int i=0;i<count0;i++)
        {
            arr[i]=0;
        }

        for (int i=count0;i<count0+count1;i++)
        {
            arr[i]=1;
        }

        for (int i=count0+count1;i<arr.length;i++)
        {
            arr[i]=2;
        }

        System.out.print(Arrays.toString(arr));
    }

    // we can optimize it via dutch national flag algorithm
    // 0.....low-1=0
    //low....mid-1=1
    //mid....high=unsorted(0/1/2)
    //high+1...n-1=2

    public  static void sort_using_dutch_algo(int[] arr)
    {
        //{,0,1,1,1,2,2,0,1};
        int low=0,mid=0,high=arr.length-1;
        while (mid<=high)
        {
            if(arr[mid]==0)
            {
                swap(arr,low,mid);
                low++;
                mid++;
            }

            else if(arr[mid]==1)
            {
                mid++;
            }

            else
            {
                swap(arr,mid,high);
                high--;
            }
        }
    }

    public static  void swap(int[] arr, int start,int end)
    {
        while (start<=end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
