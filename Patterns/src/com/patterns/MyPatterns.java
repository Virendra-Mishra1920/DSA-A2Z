package com.patterns;

public class MyPatterns
{
    public static void main(String[] args) {
        MyPatterns.pattern12(4);
    }
    public static void pattern1(int n)
    {
        // *****
        // *****
        // *****
        // *****
        // *****
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print("*");
            }

            System.out.println();
        }

    }

    public static void pattern2(int n)
    {
        // *
        // **
        // ***
        // ****
        // *****
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void pattern3(int n)
    {
        // 1
        // 12
        // 123
        // 1234
        // 12345
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);

            }
            System.out.println();
        }

    }

    public static void pattern4(int n)
    {
        // 1
        // 22
        // 333
        // 4444
        // 55555
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);

            }
            System.out.println();
        }

    }

    public static void pattern5(int n)
    {
        // *****
        // ****
        // ***
        // **
        // *
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");

            }
            System.out.println();
        }

    }

    public static void pattern6(int n)
    {
        // 12345
        // 1234
        // 123
        // 12
        // 1
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
            }
            System.out.println();
        }


    }

    public static void pattern7(int n)
    {
//        *
// //    ***
// //   *****
// //  *******
// // *********

        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n-i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++)
            {
                System.out.print("*");
            }

            for(int k=0;k<n-i-1;k++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

        pattern8(n);
    }

    public static void pattern8(int n)
    {
        for(int i=n-1;i>=0;i--)
        {
            for(int k=0;k<n-i-1;k++)
            {
                System.out.print (" ");
            }
            for(int j=0;j<i*2+1;j++)
            {
                System.out.print("*");
            }

            for(int k=0;k<n-i-1;k++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    public static void pattern9(int n)
    {
//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n-i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++)
            {
                System.out.print("*");
            }

            for(int k=0;k<n-i-1;k++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
        pattern8(n);
    }


    public static void pattern10(int n)
    {
        for(int i=0;i<=2*n-1;i++)
        {
            int stars=i;
            if(stars>n)
            {
                stars=2*n-i;            }
            for(int j=0;j<stars;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern11(int n)
    {
        int start=1;
        for(int i=0;i<=n;i++)
        {
            if(i%2==0)
                start=1;
            else
                start=0;

            for(int j=0;j<=i;j++)
            {
                System.out.print(start);
                start=1-start;
            }
            System.out.println();

        }
    }

    public static void pattern12(int n)
    {
        int iniS=  6;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            // space
            for(int k=0;k<iniS;k++)
            {
                System.out.print(" ");

            }

            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
            iniS-=2;
        }
    }

    public static void pattern13(int n)
    {
        int num=1;
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void pattern14(int n)
    {
        for(int i=0;i<=i;i++)
        {
           for(char ch='A';ch<='A'+i;ch++)
           {
               System.out.print(ch);
           }
            System.out.println();
        }
    }

    public static void pattern15(int n)
    {
        for(int i=n-1;i>=0;i--)
        {
            for(char ch='A';ch<='A'+i;ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void pattern16(int n)
    {
        char ch='A';
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
    }


    public static void pattern17(int n)
    {

        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n-i-1;k++)
            {
                System.out.print(" ");
            }

            char ch='A';
            int breakpoint=(i*2+1)/2;

            for(int j=1;j<=i*2+1;j++)
            {
                System.out.print(ch);
               if(j<=breakpoint)
                   ch++;
               else
                   ch--;
            }

            for(int k=0;k<n-i-1;k++)
            {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern18(int n)
    {

        for(int i=0;i<n;i++)
        {
            for(int j='E'-i;j<='E';j++)
            {
                System.out.print((char) j);
            }

            System.out.println();
        }
    }

    public static void pattern19(int n)
    {
        int iniS=0;

        for(int i=0;i<n;i++)
        {

            //star
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            //space
            for(int k=0;k<iniS;k++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            iniS+=2;
            System.out.println();
        }
        iniS=8;
        for(int i=1;i<=n;i++)
        {
            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //space
            for(int k=0;k<iniS;k++)
            {
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            iniS-=2;
            System.out.println();


        }
    }

    public static void pattern20(int n)
    {
        int iniS=8;
        for(int i=1;i<=n;i++)
        {
            //starts
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //spaces
            for(int k=0;k<iniS;k++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            iniS-=2;
        }
        iniS=2;
        for(int i=1;i<n;i++)
        {
            //stars
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            //spces
            for (int k=0;k<iniS;k++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            iniS+=2;

        }
    }

    public static void pattern21(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1 || j==0 || j==n-1)
                {
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern22(int n)
    {
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<2*n-1;j++)
            {
                int top=i;
                int left=j;
                int right=(2*n-2)-j;
                int down=(2*n-2)-i;
                System.out.print(n-Math.min(Math.min(top,down), Math.min(left,right)));
            }

            System.out.println();
        }
    }



}
