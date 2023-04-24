import sun.security.mscapi.CPublicKey;

import java.util.*;

public class FindNextPermutation
{
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        //List<Integer> list=Arrays.asList(arr);
        //Collection<Integer> set=new HashSet<>(list);
        // findnextpermutation(arr);

        List<Integer> ds = new ArrayList<>();
        //Collections.reverse(list);
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[arr.length];
        // generateAllPermutation(arr,ds,ans,freq);
        generateAllPermutationV1(0, arr, ans);

        for (List<Integer> data: ans)
        {
            for (Integer item: data)
            {
                System.out.print(item);
            }
            System.out.println();
        }
    }

    public static  void generateAllPermutation(int[] arr, List<Integer> ds, List<List<Integer>> ans, boolean[] freq)
    {
        if (ds.size()==arr.length)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i=0;i<arr.length;i++)
        {
            if (!freq[i])
            {
                ds.add(arr[i]);
                freq[i]=true;
                generateAllPermutation(arr,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }

    }

    public  static  void generateAllPermutationV1(int index, int[] arr, List<List<Integer>> ans)
    {
        if(index==arr.length)
        {
            List<Integer> ds=new ArrayList<>();
            for(int i=0;i<arr.length;i++)
            {
                ds.add(arr[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i=index;i<arr.length;i++)
        {
            swap(arr,i,index);
            generateAllPermutationV1(index+1,arr,ans);
            swap(arr,i,index);
        }

    }

    public  static  void swap(int[] arr, int i, int index)
    {
        int temp=arr[i];
        arr[i]=arr[index];
        arr[index]=temp;
    }

    public  static  void findnextpermutation(int[] arr)
    {
        int index=-1;
        int n=arr.length;

        // get the break point of the graph
        for (int i=n-2;i>=0;i--)
        {
            if (arr[i]<arr[i+1])
            {
                index=i;
                break;
            }
        }

        // if there is no permutation available then just reverse orignal array

        if (index==-1)
        {
            reverse(arr,0,arr.length-1);
            return;
        }

        // get the least max of ith element

        for (int i=n-1;i>index;i--)
        {
            if(arr[i]>arr[index])
            {
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
                break;
            }
        }

        // just reverse the remainning elemenst from index+1 to n-1
        reverse(arr,index+1,n-1);
        System.out.print(Arrays.toString(arr));
    }


    public  static void reverse(int[] arr, int start, int end)
    {
        while (start<end)
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
