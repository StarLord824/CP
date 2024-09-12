package DP.Backtracking;

public class N_queens {
    public static void main(String[] args) {
        int n=5;
        int board[][]=new int[n][n];

        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                board[i][j]=0;

        System.out.println(fn(board,n ,0));
        
    }   
    static void printBoard(int n, int b[][])
    {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(b[i][j]+" ");
            System.out.println("");
        }
        System.out.println("");
    } 
    static boolean check(int b[][], int x, int y,int n)
    {
        for(int i=0;i<x;i++)
        {
            if(b[i][y]==1)
            return false;
        }
        int i=x-1,j=y-1;
        while(i>=0 && j>=0)
        {
            if(b[i][j]==1)
            return false;
            i--;j--;
        }
        i=x;j=y;
        while(i>=0 && j<n)
        {
            if(b[i][j]==1)
            return false;
            i--;j++;
        }
        return true;
    }
    static int fn(int b[][], int n, int idx)
    {
        if(idx==n)
        {
            printBoard(n, b);
            return 1;
        }
        int ways=0;
        for(int i=0;i<n;i++)
        {
            if(check(b,idx,i,n))
            {
                b[idx][i]=1;
                ways+=fn(b, n, idx+1);
                b[idx][i]=0;
            }
        }
        return ways;        
    }
}
