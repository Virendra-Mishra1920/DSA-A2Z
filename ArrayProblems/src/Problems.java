import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Problems
{
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        //left_rotate_d_elements(arr,3);
    }

    // brute force approch will be is sort an array and get the last element will be maximum
    public static int largest(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        return max;
    }

    public static int secondLargest(int[] arr, int n)
    {
        int largest=arr[0];
        int slargest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest)
            {
                slargest=largest;
                largest=arr[i];
            }

            else if(arr[i]<largest && arr[i]>slargest)
            {
                slargest=arr[i];
            }
        }
        return slargest;
    }

    public static int secondSmallest(int[] arr, int n)
    {
        int smallest=arr[0];
        int ssmallest=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            if(arr[i]<smallest)
            {
                ssmallest=smallest;
                smallest=arr[i];
            }

            else if(arr[i]!=smallest && arr[i]<ssmallest)
            {
                ssmallest=arr[i];
            }
        }
        return ssmallest;
    }


    // Best solution
    public static int sLargest(int[] arr)
    {
        int largest=arr[0];
        int sLargest=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }

        }

        // find second largest
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>sLargest && arr[i]!=largest)
            {
                sLargest=arr[i];
            }
        }
        return sLargest;
    }

    // remove duplicate  from sorted array
    // brute force approch
    //Tc=O(nlogn)+n
    //sp=O(n)

    public static void remove_duplicates(int[] arr, int n)
    {
        HashSet<Integer> set=new HashSet<>();
        int index=0;

        for (int i=0;i<n;i++)
        {
            set.add(arr[i]);
        }

        for (Integer item: set)
        {
            arr[index++]=item;
        }

        // print array

        for (int i=0;i<index;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    // optimal solution
    public static  void  remove_duplicates_Optimal_solution(int[] arr, int n)
    {
        int index=0;
        for (int j=1;j<n;j++)
        {
            if(arr[index]!=arr[j])
            {
                arr[index+1]=arr[j];
                index++;
            }
        }
        System.out.println(index+1);
        for (int i=0;i<=index;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


}
