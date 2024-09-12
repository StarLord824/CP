import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        
        try {
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner sc= new Scanner(System.in);

        int t=sc.nextInt();
        while (t-- > 0)
        {
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            solve(n,a,b);
        }
        sc.close();
    }
    public static void solve(int n, int a, int b) {
        // Your solve code here
        if(n==1)
        { 
            System.out.println("yes");
            return;
        }
        if(a+b+2<=n)
        System.out.println("yes");
        else
        System.out.println("no");
    }
}
