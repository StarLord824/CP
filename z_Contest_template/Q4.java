package z_Contest_template;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class Q4
{
    public static int solve(int[][] grid) 
    {
        int n=grid.length, m=grid[0].length;
        int flips=0;
        for(int i=0;i<n/2;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                int a=grid[i][j],b=grid[i][m-1-j];
                int c=grid[n-1-i][j],d=grid[n-1-i][m-1-j];
                int cnt=(a&1)+(b&1)+(c&1)+(d&1);
                if(cnt!=4 || cnt!=0)
                {
                    int kaand=Math.min(cnt,4-cnt);
                    flips+=kaand;
                    int x=cnt!=kaand?1:0;
                    grid[i][j]=x;
                    grid[i][m-1-j]=x;
                    grid[n-1-i][j]=x;
                    grid[n-1-i][m-1-j]=x;
                }
            }
        }
        if((n&1)==1 && (m&1)==1)
        {
            if(grid[n/2][m/2]==1)
            {
                flips++;
                grid[n/2][m/2]=0;
            }
        }
        int cnt=0;
        if( (n&1)==1 )
        {
            for(int i=0;i<m;i++)
            {
                if(grid[n/2][i]==1)
                {
                    cnt++;
                }
            }
        }
        if( (m&1)==1 )
        {
            for(int i=0;i<n;i++)
            {
                if(grid[i][m/2]==1)
                cnt++;
            }
        }
        int x=cnt%4;
        if(x!=0)
        {
            flips+=Math.min(4-x,x);
        }
        return flips;
    }
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
        Scanner sc= new Scanner(System.in);
       
        int grid[][]={{0,1,1,0,0,1}};

        System.out.println(solve(grid));

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]+"  ");
            }
            System.out.println("");
        }
        sc.close();
    }
}

