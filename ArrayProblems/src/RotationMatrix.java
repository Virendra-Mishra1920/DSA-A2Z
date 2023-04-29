public class RotationMatrix
{
    public static void main(String[] args) {

        int[][] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16},
        };
        rotateV1(arr);
    }

    public static void rotateV1(int[][]arr)
    {
        // transport the matrix

        for (int i=0;i<arr.length-1;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
               swap(arr,i,j);
            }
        }
        // Transportation matrix
        for (int[] a:arr)
        {
            for (int item: a)
            {
                System.out.print(item+" ");
            }
            System.out.println();
        }

        System.out.println();



        // reverse row
       reverse(arr);


        for (int[] a:arr)
        {
            for (int item: a)
            {
                System.out.print(item+" ");
            }
            System.out.println();
        }

    }

    private  static  void reverse(int[][] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length/2;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[i][arr.length-1-j];
                arr[i][arr.length-1-j]=temp;
            }
        }
    }

    private static  void swap(int[][] arr, int i,int j)
    {
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }

    // Time complixity=o(m*n) ~= n*n
    //sp=O(m*n)
    public  static  void rotation(int[][] arr)
    {
        int[][] ans=new int[arr.length][arr.length];

        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length;j++)
            {
                ans[j][arr.length-1-i]=arr[i][j];
            }
        }

        System.out.println("Orignal matrix");
        for (int[] a:arr)
        {
            for (int item: a)
            {
                System.out.print(item+" ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] a:ans)
        {
            for (int item: a)
            {
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }
}
