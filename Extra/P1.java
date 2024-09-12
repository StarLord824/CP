package Extra;
import java.util.Scanner;

public class P1{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int t= scanner.nextInt();
        while(t>0)
        {
            solve();
            t--;
        }
    }
    public static void solve()
    {
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        String s=scanner.next();

        int x[]=new int[7];
        for(int i=0;i<n;i++)
        {
            x[s.charAt(i)-'A']+=1;
        }
        int ans=0;
        for(int i=0;i<7;i++)
        {
            if(x[i]<m)
            ans+=m-x[i];
        }
        System.out.println(ans);
    }
}
