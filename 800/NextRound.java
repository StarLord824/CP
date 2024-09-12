// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.PrintStream;
import java.util.Scanner;

public class NextRound{
    public static void solve(int n,int k,int a[]) {
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>0 && a[i]>=a[k-1])
            ans++;
        }         
        System.out.println(ans);       
    }
    public static void main(String[] args) {
        
        // try {
        //     System.setIn(new FileInputStream("input.txt"));
        //     System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        // } catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }

        Scanner sc= new Scanner(System.in);

        // int t=sc.nextInt();
        // while (t-- > 0)
        // {
            // }
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        solve(n,k,a);
        sc.close();
    }
}
