public class Main {
    static int count=0;

    public static void main(String[] args)
    {
        //f();
        backTracking2(3,3);
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


}