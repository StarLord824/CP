import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class InsomniaCure{
    public static void solve(int a[], int n) {
        if(a[0]==1 || a[1]==1 || a[2]==1 || a[3]==1)
        {
            System.out.println(n);
            return;
        }
        int dragons[]=new int[n+1];
        for(int i=0;i<a.length;i++)
        {
            for(int j=a[i];j<dragons.length;j+=a[i])
            {
                dragons[j]=1;
            }
        }
        int ans=0;
        for(int i=0;i<dragons.length;i++)
        if(dragons[i]==1)
        ans++;
        System.out.println(ans);
        // Your solve code here
        
    }
    public static void main(String[] args) {
        
        try {
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner sc= new Scanner(System.in);

        // int t=sc.nextInt();
        // while (t-- > 0)
        // {
            
        // }
        solve(new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()},sc.nextInt());
        sc.close();
    }
}
