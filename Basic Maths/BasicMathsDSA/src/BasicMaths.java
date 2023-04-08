import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BasicMaths
{
    public static void main(String[] args) {


     // System.out.println( primeNumberOptimal(1));
        //findDivisiors(36);
        System.out.print(gcd(12,9));
    }
    public static int countDigits(int n)
    {
        int count= (int)(Math.log10(n)+1);
//        while (n>0)
//        {
//            count++;
//            n=n/10;
//        }


        return count;
    }

    // note: If we are dividing any number by 10 , then TC will be logger base. like log10,1og2 etc.
    public static int reverseNUmber(int n)
    {
        int rev=0,ld=0;
        if(n==0 || n>=Integer.MAX_VALUE || n<=Integer.MIN_VALUE)
            return 0;
        if(n<0)
        {
            n=n*-1;
        }

        while(n>0)
        {
            ld=n%10;
            n=n/10;
            rev=(rev*10)+ld;
        }
        if(n<0)
            return -rev;
        return  rev;
    }

    public static boolean isPalindromNumber(int n)
    {
        int temp=n;
        int rev=reverseNUmber(n);
        if(rev==temp)
        {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isArmStrongNumber(int n)
    {
        int temp=n;
        int sum=0, ld=0;
        while (n>0)
        {
            ld=n%10;
            sum=sum+(ld*ld*ld);
            n=n/10;
        }
        if(sum==temp)
            return true;
        else return false;
    }


    public static void findDivisiors(int n)
    {
        for(int i=0;i<=n;i++)
        {
            if(n%i==0)
                System.out.print(i+" ");
        }
        // TC: O(n)
    }
    public static void findDivisiorsOptimal(int n)
    {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                list.add(i);
                if(n/i!=i)
                    list.add(n/i);
            }
        }
        Collections.sort(list);
        for (int item: list
             ) {
            System.out.print(item+" ");
        }
        //TC: O(log(n))
    }

    public static boolean primeNumber(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }

        if(count==2)
           return  true;
        else
           return  false;
    }

    public static  boolean primeNumberOptimal(int n)
    {
        int count=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
               count++;
                if(n/i!=i)
                {
                   count++;
                }
            }
        }
        if(count==2)
            return true;
        else return false;

    }

    public static int gcd(int a, int b)
    {
        while(a>0 && b>0)
        {
            if(a>b)
                a=a%b;
            else
                b=b%a;
        }
        if(a==0) return b;
        return  a;
    }
}
