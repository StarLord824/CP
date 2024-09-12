import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class CP {
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
            solve();
        }

        sc.close();
    }
    public static void solve() {
        // Your solve code here
    }
}
