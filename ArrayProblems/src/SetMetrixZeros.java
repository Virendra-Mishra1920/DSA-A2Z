public class SetMetrixZeros
{
    public static void main(String[] args)
    {
        int[][] arr={{1,1,1},{1,0,1},{1,1,1}};
       // setmetrix(arr);
        setmatrixV2(arr);

        for (int[] a: arr)
        {
            for (int item: a)
            {
                System.out.print(item+" ");
            }
            System.out.println();
        }

    }

        // this is the optimal sol and here time complixity is O(n*n)
        // space complixity=O(1), we are not using any extra space but we are using existing array auxilary space
    public  static  void setmatrixV2(int[][] arr)
    {
        // take two arrays
//        int[] row=new int[arr.length];//  arr[--][0]
//        int[] col=new int[arr[row.length/2].length]; //arr[0][--]
        int col0=1;

        // mark 0 in the oth row and 0th col if we have 0 in the matrix
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                if (arr[i][j]==0)
                {
                    // check for row
                    arr[i][0]=0;
                    if (j!=0)
                    {
                        arr[0][j]=0;
                    }

                    else
                    {
                        col0=0;
                    }
                }
            }
        }

        // convert all 1's to 0's
        for (int i=1;i<arr.length;i++)
        {
            for (int j=1;j<arr[i].length;j++)
            {
                // check for row & col where we have 0's
                if (arr[i][0]==0 || arr[0][j]==0)
                {
                    arr[i][j]=0;
                }
            }
        }

        // if arr[0][0] is 0 then entire row will be zero and we are solving row first because row value is depending
        // on the col value so, if we change col value before then it will impact row value

        if (arr[0][0]==0)
        {
            for (int j=0;j<arr[0].length;j++)
            {
                arr[0][j]=0;
            }
        }

        // as we take 0th col value in a variable , oth col is depending on the oth value of oth col
        // if oth value is 0 , then entire col value is also 0.

        if (col0==0)
        {
            for (int i=0;i<arr.length;i++)
            {
                arr[i][0]=0;
            }
        }
    }


    // this is the better solution and we tried to optimize TC.
    // Tc=O(m*n)+O(m*n)
    //Sp=O(m)+ O(n)
    //To traverse matrix O(n*n) is a minimum TC so we can't optimize the time coplixity here we can optimize SP
    public  static  void setmatrixV1(int[][] arr)
    {
        // take two arrays
        int[] row=new int[arr.length];
        int[] col=new int[arr[row.length/2].length];

        // mark 1 inside row & col array when we found 0
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }

        // just convert 1's into zeros based on the mark in row & col array
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                if(row[i]==1 || col[j]==1)
                {
                    arr[i][j]=0;
                }
            }
        }
    }

    // brute force approch
    //Tc=O(m*n) + O(m+n) + O(M=m*n)
    //Sp=O(1)

    public  static  void setmetrix(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                if (arr[i][j]==0)
                {
                    // mark row
                    markrow(arr,i);
                    // markcol
                    markcol(arr,j);
                }
            }
        }

        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
                if (arr[i][j]==-1)
                {
                    arr[i][j]=0;
                }
            }
        }
    }

    private static void markcol(int[][] arr, int j)
    {
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i][j]!=0)
            {
                arr[i][j]=-1;
            }
        }
    }

    private static void markrow(int[][] arr, int i)
    {
        for (int j=0;j<arr[i].length;j++)
        {
            if(arr[i][j]!=0)
            {
                arr[i][j]=-1;
            }

        }
    }
}
