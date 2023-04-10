import java.util.*;

public class RecursionProblems
{

    public static void main(String[] args) {
        int[] arr={2,5,2,1,2};
        int target=5;
        Set<List<Integer>> ans=new HashSet<>();
        sub(0,target,arr,ans,new ArrayList<>());
        //hashset of list into list of list
        List<List<Integer>> l=new ArrayList<>(ans);

//        int k=2, sum=0;
//
//        List<Integer> list=new ArrayList<>();
//        RecursionProblems rec=new RecursionProblems();
//        List<Integer> d=new ArrayList<>();
//        d.add(10);
//        d.add(10);
//        d.add(20);
//        d.add(20);
//     Set<List<Integer>> lists=new HashSet<>();
//     lists.add(new ArrayList<>(d));
//     rec.Test(lists);
   // rec.subsequencekthSum(0,new ArrayList<>(),0,8,arr,arr.length );
//        System.out.println(rec.countSubsequence(0,sum,k,arr,arr.length));
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

    public static void subsequencekthSum(int index, List<Integer> list, int sum, int k, int[] arr, int n)
    {

        if(index==n)
        {
            if(sum==k)
            {
                List<Integer> temp=new ArrayList<>();
                temp=list;
                Collections.sort(list);
                Set<Integer> set=new HashSet<>(temp);
                temp.clear();
                temp.addAll(set);
                for(int item: temp)
                {
                    System.out.print(item);
                }
                System.out.println();
            }
            return;
        }

        list.add(arr[index]);
        sum+=arr[index];

        // This is picking condition
        subsequencekthSum(index+1,list,sum, k, arr, n);
        list.remove(list.size()-1);
        sum-=arr[index];
        subsequencekthSum(index+1, list,sum, k, arr, n);
    }

    public boolean singleSubSequencePrint(int index, List<Integer> list, int sum, int k, int[] arr, int n)
    {
        if(index==n)
        {
            if(sum==k)
            {
                for (int item:list) {
                    System.out.print(item);
                }
                return true;
            }
            else
            {
                return false;
            }
        }

        list.add(arr[index]);
        sum+=arr[index];

        if(singleSubSequencePrint(index+1,list,sum,k,arr,n)==true)
            return true;


        list.remove(list.size()-1);
        sum-=arr[index];

        if(singleSubSequencePrint(index+1,list,sum,k,arr,n)==true)
            return true;
        return false;

    }

    public int countSubsequence(int index, int sum , int k, int[] arr, int n)
    {
        if(index==n)
        {
            if(sum==k)
                return 1;
            else
                return 0;
        }
        sum+=arr[index];
        int left=countSubsequence(index+1,sum,k,arr, n);
        sum-=arr[index];
        int right=countSubsequence(index+1,sum,k,arr,n);
        return left+right;
    }

    void Test(Set<List<Integer>> inputs)
    {
        List<List<Integer>> l=new ArrayList<List<Integer>>(inputs);
        System.out.println(l.getClass().getName());
        for (List<Integer> list : inputs) {
            Set<Integer> set=new HashSet<>(list);
            list.clear();
            list.addAll(set);
        }
    }


}
