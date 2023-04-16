import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        int[] arr={10,7,3,2,9,8,1};
       //
        // int[] arr={1,2,3,4,5};
       // merge_sort(arr,0,arr.length-1);
        merge_sort(arr,0,arr.length-1);
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

    public static void insert_sort_recurcive(int[] arr, int index,int j, int n)
    {
        if(index>=n)
            return ;
        int k=j;
        while (k>0 && arr[k-1]>arr[k])
        {
            int  temp=arr[k];
            arr[k]=arr[k-1];
            arr[k-1]=temp;
            k--;
        }

        insert_sort_recurcive(arr,index+1,j+1,n);

    }

    public static void merge_sort(int[] arr, int low, int high)
    {
        if(low>=high)
            return ;
        int mid=(low+high)/2;
        merge_sort(arr,low,mid);
        merge_sort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high)
    {
        int left=low;
        int right=mid+1;
        List<Integer> list=new ArrayList<>();

        while (left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                list.add(arr[left]);
                left++;
            }
            else
            {
                list.add(arr[right]);
                right++;
            }
        }

        while (left<=mid)
        {
            list.add(arr[left]);
            left++;
        }

        while (right<=high)
        {
            list.add(arr[right]);
            right++;
        }

        for (int i=low;i<=high;i++)
        {
            arr[i]=list.get(i-low);
        }
    }

    public static void quick_sort(int[] arr , int low , int high)
    {
        if(low<high)
        {
            int pindex=partition(arr,low,high);
            quick_sort(arr,low,pindex-1);
            merge_sort(arr,pindex+1,high);
        }
    }

    public static  int partition(int[] arr, int low, int high)
    {
        int i=low;
        int j=high;
        int pivot=arr[low];
        int temp=0;

        // check first element is grater than pivot
        while (i<j)
        {
            while (arr[i]<=arr[pivot] && i<=high-1)
            {
                i++;
            }

            // check first element is less than pivot

            while (arr[j]>=arr[pivot] && j>=low+1)
            {
                j++;
            }
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        return j;
    }
}