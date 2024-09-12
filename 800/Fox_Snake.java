// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.PrintStream;
import java.util.Scanner;

public class Fox_Snake{
    public static void solve(int n,int m) {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i%2==0)
                System.out.print("#");
                else if(i%4==1 && j==m-1)
                System.out.print("#");
                else if(i%4==3 && j==0)
                System.out.print("#");
                else
                System.out.print(".");
            }
            System.out.println("");
        }
        // Your solve code here
        
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
        solve(sc.nextInt(),sc.nextInt());
        sc.close();
    }
}
