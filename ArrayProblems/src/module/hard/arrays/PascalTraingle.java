package module.hard.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTraingle
{
    public static void main(String[] args)
    {
       // System.out.println(ncr(5,2));
       // printrow(6);
       // System.out.println(printrowv1(6));
        List<List<Integer>> res=new ArrayList<>();

        res=generate(5);

        for (List<Integer> list: res)
        {
            for (int item:list)
            {
                System.out.print(item);
            }
            System.out.println();
        }
    }

    // print nth row
    // TC=O(x*r)
    //sp=O(1)
    public  static  void printrow(int rownumber)
    {
        for (int col=1;col<=rownumber;col++)
        {
            System.out.println(ncr(rownumber,col-1));
        }
    }

    // optmize version of print row
    //TC=O(n)
    //sp=O(1)

    public  static  List<Integer> printrowv1(int rownumber)
    {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        int ans=1;
        for (int col=1;col<rownumber;col++)
        {
            ans=ans*(rownumber-col);
            ans=ans/col;
            list.add(ans);
        }
        return list;
    }



    public static  int ncr(int n , int row)
    {
        int ans=1;
        for (int col=0;col<row;col++)
        {
            ans=ans*(n-col);
            ans=ans/(col+1);
        }

        return  ans;
    }

    // here we are adding generated rows into List
    // TC= O(n*n)
    //SP=O(1)
    public  static  List<List<Integer>> generate(int rownumber)
    {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();

        for (int row=1;row<=rownumber;row++)
        {
            temp= generaterow(row);
            ans.add(temp);
        }
        return  ans;
    }

    // here we are generating nth row
    public  static  List<Integer> generaterow(int row)
    {
        List<Integer> res=new ArrayList<>();
        int ans=1;
        res.add(ans);
        if (row==1)
        {
            return  res;
        }

        for (int col=1;col<row;col++)
        {
            ans=ans*(row-col);
            ans=ans/col;
            res.add(ans);
        }
        return res;
    }


}
