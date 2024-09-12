import java.util.HashSet;
import java.util.Scanner;

public class SpellCheck{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int t=sc.nextInt();
        while (t-- > 0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            solve(n,s);
        }

        sc.close();
    }
    public static void solve(int n, String s) {
        // Your solve code here
        String str="Timur";
        if(n!=5)
        {
            System.out.println("NO");
            return;
        }
        HashSet<Integer> mp=new HashSet<>();
        for(int i=0;i<5;i++)
        {
            int x=str.indexOf(s.charAt(i));
            if(x==-1 || mp.contains(x))
            {
                System.out.println("NO");
                return;
            }
            mp.add(x);
        }        
        System.out.println("YES");
    }
}
