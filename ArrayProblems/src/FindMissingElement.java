public class FindMissingElement
{
    public static void main(String[] args)
    {
        int[] arr={3,0,1};
        System.out.print(findmissing_element_optimalV2(arr,3));
        //System.out.print(1^2);
    }

    // Tc=O(n*n)
    public static int missing_element_brute(int[] arr,int N)
    {
        for (int i=1;i<=N;i++)
        {
            int flag=0;
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[i]==arr[j])
                {
                    flag=1;
                    break;
                }
            }

            if (flag==0)
            {
                return i;
            }
        }
        return -1;
    }

    // Tc=
    public static int findmissing_element_best(int[] arr, int n)
    {
        int[] hash=new int[n+1];

        for (int i=0;i<arr.length;i++)
        {
            hash[arr[i]]=1;
        }

        for(int i=1;i<hash.length;i++)
        {
            if(hash[i]==0)
            {
                return i;
            }
        }
        return  -1;
    }

    public  static int findmissing_element_optimal(int[] arr, int n)
    {
        int sum=n*(n+1)/2;
        int arraySum=0;
        for (int i=0;i<arr.length;i++)
        {
            arraySum+=arr[i];
        }

        return (sum-arraySum);
    }

    public  static int findmissing_element_optimalV2(int[] arr, int n)
    {
        int xor1=0,xor2=0;

//        for (int i=1;i<=n;i++)
//        {
//            xor1=xor1 ^ i;
//        }

        for (int i=0;i<arr.length;i++)
        {
            xor2=xor2 ^ arr[i];
            xor1=xor1 ^ (i);
        }

        xor1=xor1 ^ n;


        return (xor1 ^ xor2);
    }
}
