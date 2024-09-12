package Extra;
import java.util.Arrays;
import java.util.Scanner;

public class P2{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        int t=scanner.nextInt();
        while(t>0)
        {
            solve();
            t--;
        }
    }
    public static void solve()
    {
        int n=scanner.nextInt();
        int f=scanner.nextInt();
        int k=scanner.nextInt();

        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=scanner.nextInt();
        
        f=a[f-1];
        Arrays.sort(a);

        if(a[n-k]>f)
        {
            System.out.println("NO");
        }
        else if(n>1 && a[n-k]==f && a[n-k-1]==f)
        {
            System.out.println("MAYBE");
        }
        else
        {
            System.out.println("YES");
        }
    }
}
