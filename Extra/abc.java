package Extra;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class abc {
    public static void main(String[] args) {
        try{
            System.setIn(new FileInputStream("input.txt"));
            System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        } 
        catch (Exception e){
            e.printStackTrace();
            return;
        }
        Scanner scanner=new Scanner(System.in);
        String t= scanner.next();
        System.out.println(t);
    }
    
}
