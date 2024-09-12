import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class SeeingDeeinnggg{
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
            String s=sc.next();
            solve(s);
        }

        sc.close();
    }
    public static void solve(String s) {
        // Your solve code here
        int n=s.length();
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<n;i++)
        {
            str.append(s.charAt(n-1-i));
        }
        System.out.println(str);
    }
}
