import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Q2{
    public static void main(String[] args) 
    {
        boolean def=true;
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
        Scanner scanner= new Scanner(System.in);
        String t= scanner.next();
        System.out.println(t);
        scanner.close();
    }
}
