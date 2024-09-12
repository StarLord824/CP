import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Scanner;
public class Q2
{
    public static void solve(int n, String s)
    {
        int zeroes=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='0')
            zeroes++;
        }
        int ones=n-zeroes, ans=0;
        for(int i=1;i<=n;i++)
        {
            if( (i>=zeroes && (i-zeroes)%2==0) || (i>=ones && (i-ones)%2==0) )
            ans++;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) 
    {
        boolean def=true;
        // def=false;
        if(def)
        {
            try{
                System.setIn(new FileInputStream("input.txt"));
                System.setOut(new PrintStream(new FileOutputStream("output.txt")));
            } 
            catch (FileNotFoundException e){
                e.printStackTrace();
                return;
            }
        }
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t-- >0)
        {
            solve(sc.nextInt(),sc.next());
        }
        sc.close();
    }
}