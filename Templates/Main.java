package Templates;

import java.util.HashSet;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int t=sc.nextInt();
        while (t-- > 0)
        {
            int n=sc.nextInt();
            String s=sc.next();
            solve(n,s);
        }

        sc.close();
    }
    public static void solve(int n,String s) {
        // Your solve code here
    }
}
