package Extra;
// import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) 
    {    
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        System.out.println(fn(s));



        // String s="abcabcbb";
        // HashMap<Character,Integer> mp=new HashMap<>();
        // mp.put(s.charAt(0),0);
        // int r=1,l=0;
        // int ans=1;
        
        // while(r<s.length())
        // {
        //     System.out.println(ans);
        //     if( mp.containsKey(s.charAt(r)) )
        //     {
        //         l=Math.max(mp.get(s.charAt(r))+1,l);
        //     }
        //     mp.put(s.charAt(r),r);
        //     ans=Math.max(ans,r-l+1);
        //     r++;
        // }
        // System.out.println(ans);            
    }
    public static int fn(String s)
    {
        if(s.length()<4)
        return 0;

        else if(s.charAt(0)>=48 && s.charAt(0)<=57)
        return 0;

        boolean numCheck=false,capCheck=false;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='/'||c==' ')
            {
                return 0;
            }
            if(c>=48 && c<=57)
            {
                numCheck=true;
            }
            if(c<=90 && c>=65)
            {
                capCheck=true;
            }
        }
        if(numCheck && capCheck)
        return 1;
        else
        return 0;
    }
}
