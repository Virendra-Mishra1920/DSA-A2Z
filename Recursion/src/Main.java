public class Main {
    static int count=0;

    public static void main(String[] args)
    {
        //f();
        factorial1(3,1);
        //System.out.println(factorial(5));
    }

    public  static void f(){
        //base condition
        if(count==3)
            return ;
        System.out.println(count);
        count++;
        f();
    }
    // print name 1 to n times
    public static void printName(int i,int n)
    {
        if(i>n)
            return ;
        System.out.println("viren");
        printName(i+1,n);
    }
    public static void linearPrintOneToN(int i,int n)
    {
        // base condition
        if(i>n)
        {
            return;
        }
        System.out.println(i);
        linearPrintOneToN(i+1,n);
    }

    public static void linearPrintFromNToOne(int i,int n)
    {
        // base condition
        if(n<i)
        {
            return;
        }
        System.out.println(n); // 3
        linearPrintFromNToOne(i,n-1);
    }

    public static void backTracking(int i, int n)
    {
        if(i>n)
            return;
        backTracking(i+1,n);
        System.out.println(i);
    }

    public static void backTracking2(int i, int n)
    {
        if(i<1)
            return ;
        backTracking2(i-1,n);
        System.out.println(i);
    }

    // There are two ways to solve recursion problems
    //  1. parameterize
    // 2.recursive call

    public static  void sum(int i,int sum)
    {
        if(i<1)
        {
            System.out.println(sum);
            return;
        }

        sum(i-1,sum+i);
    }

    public static  int recsum(int n)
    {
        if(n==0)
        {
            return 0;
        }

        return n+ recsum(n-1);
    }

    public static int factorial(int n)
    {
        if(n==0)
            return 1;

        return n*factorial(n-1);
    }

    public static void factorial1(int i, int fact)
    {
        if(i==0)
        {
            System.out.println(fact);
            return ;
        }

         factorial1(i-1,fact*i);
    }



}