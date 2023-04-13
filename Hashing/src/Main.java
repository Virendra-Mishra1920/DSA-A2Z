import javafx.scene.transform.Scale;

import java.util.*;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args)
    {
       // int[] arr=new int[10];
       // numberHashing();
       // characterHashing();
       // hashingCharsWithMap();
       // Test();
        leetcode1();

    }

    public static void leetcode()
    {
        int[] arr={2 ,3, 2, 3, 5};
        int p=5;
        //int[] hash=new int[16];

      HashMap<Integer,Integer> map=new HashMap<>();

      for(int i=0;i<arr.length;i++)
      {
          Integer val=map.get(arr[i]);

          if(map.get(arr[i])==null)
          {
              map.put(arr[i],1);
          }

          else
          {
              map.put(arr[i],++val);
          }
      }

        HashSet<Integer> set=new HashSet<>();

      for (int i=1;i<=p;i++)
      {
          set.add(i);
      }

      for (Integer itr:set)
      {
          if(map.containsKey(itr)==false)
          {
              System.out.print(0);
          }

          else {
              System.out.print(" "+map.get(itr)+" ");
          }

      }
    }

    public static void Test()
    {
            Integer[] arr={8, 1, 1, 2, 2, 3, 3, 3, 4};

        Arrays.sort(arr,Collections.reverseOrder());
        int k=3,j=0;
        int[] hash=new int[arr.length];
        boolean visited[]=new boolean[arr.length];
        int[] res=new int[3];

        for(int i=0;i<arr.length;i++)
        {
            hash[arr[i]]+=1;
        }
        int temp=0;
        while (k!=0)
        {
            int max=Integer.MAX_VALUE;
            int index=0;

            for(int i=0;i<hash.length;i++)
            {
                if(visited[arr[i]]==true)
                    continue;
                int val=hash[arr[i]];
                if(val>max)
                {
                    max=val;
                    res[j]=arr[i];
                    index=arr[i];
                }
            }
            visited[index]=true;
            j++;
            k--;

        }

        System.out.println(Arrays.toString(res));


    }

    public static void leetcode1()
    {
        Integer[] arr={1,1,2,2,3,3,3,4};
        int k=2;
        Map<Integer,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            Integer val=map.get(arr[i]);

            if(map.get(arr[i])==null)
            {
                map.put(arr[i],1);
            }

            else
            {
                map.put(arr[i],++val);
            }
        }
        System.out.println(map);
       HashSet<Integer> set=new HashSet<>();
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++)
        {
            set.add(arr[i]);
        }
        int[]  result=new int[k];
        int i=0;
        boolean[] bb=new boolean[arr.length];
        int j=0;
        int temp=0;
        while (k!=0)
        {
            for (Integer itr:set)
            {
                if(bb[itr]==true)
                    continue;
                Integer val=map.get(itr);
                if(val>=max)
                {
                    max=val;
                    bb[itr]=true;
                    temp=itr;

                }
            }

            bb[temp]=true;
            for (Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getValue()==max) {
                    result[j++]=entry.getValue();
                }
            }

            k--;
            max=0;
        }

        System.out.println(Arrays.toString(result));
    }

    public static void numberHashing()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array elements!");
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        // hashing
        int[] hash=new int[13];

        for (int i=0;i<size;i++)
        {
            hash[arr[i]]+=1;

        }

        System.out.println("Enter query size!");
        int query=sc.nextInt();
        while (query!=0)
        {
            int number=sc.nextInt();
            System.out.print(hash[number]+" ");
            query--;

        }
    }

    public static void characterHashing()
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int query=sc.nextInt();
        char[] ch=str.toCharArray();
        // pre computation
        int[] hash=new int[256];
        for (int i=0;i<str.length();i++)
        {
            hash[ch[i]-'a']+=1;
        }
        while (query!=0)
        {
            char character=sc.next().charAt(0);
            System.out.println(hash[character-'a']);
        }
    }

    public static void hashingNumbersWithMap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("enter array elements!");
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        // pre-computation
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<size;i++)
        {
            Integer c=map.get(arr[i]);
            if(map.get(arr[i])==null)
            {
                map.put(arr[i],1);
            }

            else
            {
                map.put(arr[i],++c);
            }
        }

        int query=sc.nextInt();
        while(query!=0)
        {
            int number=sc.nextInt();
            // fetch
            System.out.println(map.get(number));
            query--;
        }
        System.out.print(map);
    }


    public static void hashingCharsWithMap()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        // pre-computation
        HashMap<Character,Integer> map=new HashMap<>();

        for (int i=0;i<str.length();i++)
        {
            Integer c=map.get(arr[i]);
            if(map.get(arr[i])==null)
            {
                map.put(arr[i],1);
            }
            else
            {
                map.put(arr[i],++c);
            }
        }

        int query=sc.nextInt();
        while(query!=0)
        {
            char character=sc.next().charAt(0);
            // fetch
            System.out.println(map.get(character));
            query--;
        }

        System.out.print(map);


    }
}