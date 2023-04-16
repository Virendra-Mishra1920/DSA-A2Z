import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] arr={10,7,3,2,9,8,1};
       //
        // int[] arr={1,2,3,4,5};
        insertion_sort(arr,arr.length);
        System.out.print(Arrays.toString(arr));

    }
    private static void selection_sort(int[] arr, int n)
    {
        int temp=0;
        for(int i=0;i<=n-2;i++)
        {
            int min=i;
            for(int j=i;j<=n-1;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }


    }

        // Time complexity of bubble sort in worst and avg case is O(n2)
        // but in best case its ordre O(n)
        // if we have already sorted array then no need to check after one iteration
    public static void bubble_sort(int[] arr, int n )
    {
        int temp=0;
        boolean didSwap=false;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=true;
                }
            }
            if (!didSwap)
                break;

            System.out.println("execution");
        }
    }

    // Time complexity of insertion sort in worst and avg case is O(n2)
    // but in best case its ordre O(n)
    // if we have already sorted array then no need to check after one iteration
    public  static void insertion_sort(int[] arr, int n)
    {
        int temp=0;
        boolean didswap=false;
        for(int i=0;i<n;i++)
        {
            int j=i;
            while (j>0 && arr[j-1]>arr[j])
            {
                temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
                didswap=true;
            }
            if (!didswap)
                break;
            System.out.println("execute");
        }
    }
}