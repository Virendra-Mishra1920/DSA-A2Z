import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class FindMajorityElement
{
    public static void main(String[] args) {

        int[] arr={3,2,3};
        int n=3;
        System.out.println(FindElement(arr,n));

    }

    public static int FindElement(int[] arr, int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int res=0;
        int ans=arr.length/2;

        for(int i=0;i<arr.length;i++)
        {

             Integer  val=map.get(arr[i]);

            if(map.get(arr[i])==null)
            {
                map.put(arr[i],1);
            }

            else
            {
                map.put(arr[i],++val);
            }
        }

        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            int vv=entry.getValue();
            if(entry.getValue()>ans)
            {
                res=entry.getKey();
            }

        }

        return res;
    }
}
