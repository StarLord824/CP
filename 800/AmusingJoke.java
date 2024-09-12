import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class AmusingJoke{
    public static void solve(String a, String b, String c) {
        // Your solve code here
        if(a.length()+b.length()!=c.length())
        {
            System.out.println("NO");
            return;
        }
        StringBuilder str=new StringBuilder(a+""+b);
        int p[]=new int[26];
        int q[]=new int[26];
        for(int i=0;i<c.length();i++)
        {
            p[str.charAt(i)-'A']++;
            q[c.charAt(i)-'A']++;
        }
        for(int i=0;i<26;i++)
        {
            if(p[i]!=q[i])
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static void main(String[] args) {
        
        try {
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Scanner sc= new Scanner(System.in);

        String a=sc.next().toUpperCase();
            String b=sc.next().toUpperCase();
            String c=sc.next().toUpperCase();
            solve(a,b,c);
        // int t=sc.nextInt();
        // while (t-- > 0)
        // {
            
        // }
        sc.close();
    }
}
