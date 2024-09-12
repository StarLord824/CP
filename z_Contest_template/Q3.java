import java.util.Arrays;
import java.util.Scanner;
public class Q3 {
    public static void solve(Scanner sc)
    {
        int n=sc.nextInt();
        int a[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            a[i][0]=sc.nextInt();
            a[i][1]=sc.nextInt();
        }
        
    }
    public static long gcd(int a, int b)
    {
        return b==0? a : gcd(b, a%b);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            solve(sc);
        }
    }
}