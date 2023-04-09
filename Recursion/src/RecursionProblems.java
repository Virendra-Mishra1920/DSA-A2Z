import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecursionProblems
{

    public static void main(String[] args) {
        int[] arr={3,1,2};
        List<Integer> list=new ArrayList<>();
        RecursionProblems rec=new RecursionProblems();
        rec.subSequence(0,list,arr, arr.length);
//      int res= rec.fibonic(5);
//        System.out.println(res);
    }

    public  void reverse(int l, int r, int[] arr)
    {
        if(l>=r)
            return;
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        reverse(l+1,r-1, arr);
    }

    public  void reversv2(int i, int[] arr)
    {
        int n=arr.length;
        if(i>=n/2)
        {
            return;
        }
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        reversv2(i+1, arr);
    }

    public boolean isPalindrom(int i, String str)
    {
        int len=str.length();
        char[] arr=str.toCharArray();
        if(i>=len/2)
            return true;

        if(arr[i]!=arr[len-i-1])
        {
            return false;
        }

        return isPalindrom(i+1,str);
    }

    public int fibonic(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int last=fibonic(n-1);
        int slast=fibonic(n-2);
        return last+slast;
    }

    public  void subSequence(int index, List<Integer> list, int[] arr, int n)
    {
        if(index==n)
        {
            if (list.size()==0)
            {
                System.out.print("{}");
            }
            for (int item: list)
            {
                System.out.print(item);
            }
            System.out.println();
            return ;
        }
        list.add(arr[index]);

        // pick the elements
        subSequence(index+1,list,arr,n);
        list.remove(list.size()-1);
        // not pick elements, i.e not including inside list
        subSequence(index+1,list,arr,n);

    }

}
