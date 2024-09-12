// import java.io.FileInputStream;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.PrintStream;
import java.util.Scanner;

public class Hulk{
    public static void solve(int n) {
        String a="I hate";        
        String b="I love"; 
        StringBuilder ans=new StringBuilder(a);  
        for(int i=1;i<n;i++)
        {
            ans.append(" that ");
            if(i%2==1)
            {
                ans.append(b);
            }
            else{
                ans.append(a);
            }
        }     
        System.out.println(ans.append(" it"));
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
        solve(sc.nextInt());
        sc.close();
    }
}
