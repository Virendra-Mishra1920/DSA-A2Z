import java.util.HashMap;
import java.util.HashSet;

public class SingleAppearanceElement
{
    public static void main(String[] args) {

        int[] arr={1,1,2,3,3,4,4,5,5};
       System.out.print(findsingle_apperance_element_optimal(arr));

    }

    // Tc=O(n*n)
    // Sp=(1);
    public static  int findsingle_appearance_brute(int[] arr)
    {
        int count=0;

        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;i<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }

            if(count==1)
            {
                return arr[i];
            }
        }

        return -1;
    }

    // Tc=O(n)+ O(x)+O(x);
    //sp=O(x)
    public  static  int findsingle_appreance_element_better(int[] arr)
    {
        int max=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }

        int[] hash=new int[max+1];

        for (int i=0;i<hash.length;i++)
        {
            hash[arr[i]]+=1;
        }

        for (int i=0;i<hash.length;i++)
        {
            if(hash[arr[i]]==1)
            {
                return i;
            }
        }

        return -1;
    }

    public  static  int findsingle_apperance_element_best(int[] arr)
    {
        HashMap<Integer ,Integer> map=new HashMap<>();

        for (int i=0;i<arr.length;i++)
        {
            int val=map.get(arr[i]);

            if (map.get(arr[i])==null)
            {
                map.put(arr[i],1);
            }
            else
            {
                map.put(arr[i],++val);
            }
        }

        for (Integer item: map.values())
        {
            if (item==1)
            {
                return item;
            }

        }

        return -1;
    }

    public  static  int findsingle_apperance_element_optimal(int[] arr)
    {
        int xor=0;
        for (int i=0;i<arr.length;i++)
        {
            xor=xor ^ arr[i];
        }
        return xor;
    }
}
