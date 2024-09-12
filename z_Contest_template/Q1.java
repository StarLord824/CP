import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Q1
{
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
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- >0)
		{
		    int d=sc.nextInt(), x=sc.nextInt(), y=sc.nextInt();
		    int ans=0;
            if(x<=y)
            {
                System.out.println(ans);
                continue;
            }
		    while(true)
		    {
                if( x - (x * (d*ans) / 100) <= y )
                {
                    System.out.println(ans);
                    break;
                }
                else if(y<0)
                {
                    System.out.println(-1);
                    break;
                }
                else
                {
                    ans++;
                    y--;
                }
		    }
            // System.out.println(y<0?-1:ans);
		}
    }
}
