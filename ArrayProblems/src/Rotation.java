import java.util.Arrays;

public class Rotation
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7};
        right_rotate_optimal(arr,3);
    }
    public static void left_rotate(int[] arr)
    {
        int ele=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=ele;
        System.out.println(Arrays.toString(arr));
    }

    public  static void left_rotate_d_elements(int[] arr, int d)
    {
        int n=arr.length;
        d=d%arr.length;

        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        System.out.print(Arrays.toString(arr));
    }

    public  static  void reverse(int[] arr, int start, int end)
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

    public  static void left_rotate_d_elementsV1(int[] arr, int d)
    {
        d=d%arr.length;

        int[] temp=new int[d];
        int j=0;

        for(int i=0;i<d;i++)
        {
            temp[j++]=arr[i];
        }

        // shifting
        for(int i=d;i<arr.length;i++)
        {
            arr[i-d]=arr[i];
        }

        // get values from temp
        for(int i=arr.length-d;i<arr.length;i++)
        {
            arr[i]=temp[i-(arr.length-d)];
        }

        System.out.print(Arrays.toString(arr)+ " ");
    }

    public static  void right_rotate(int[] arr)
    {
        int ele=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=ele;
        System.out.print(Arrays.toString(arr));
    }

    public static  void right_rotateV1(int[] arr, int d)
    {
        int[] temp=new int[d];
        int j=0, ele=arr[d];
        for (int i=arr.length-1;i>d;i--)
        {
            temp[j++]=arr[i];
        }
        for(int i=0;i<d;i++)
        {
           arr[d+i]=arr[i];
        }
        arr[arr.length-1]=ele;

        for (int i=0;i<d;i++)
        {
                arr[i]=temp[i];
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void right_rotate_optimal(int[] arr, int d)
    {
        reverse(arr,0,arr.length-1);
        reverse(arr,d,arr.length-1);
        System.out.print(Arrays.toString(arr)+ " ");
    }


}
