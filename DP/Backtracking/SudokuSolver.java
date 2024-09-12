package DP.Backtracking;

public class SudokuSolver {
    public static void main(String[] args) {
        int b[][]={{5,3,0,0,7,0,0,0,0},{6,0,0,1,9,5,0,0,0},{0,9,8,0,0,0,0,6,0},
                    {8,0,0,0,6,0,0,0,3},{4,0,0,8,0,3,0,0,1},{7,0,0,0,2,0,0,0,6},
                    {0,6,0,0,0,0,2,8,0},{0,0,0,4,1,9,0,0,5},{0,0,0,0,8,0,0,0,7,9}};
        solver(b,0,0);
    }
    static boolean solver(int b[][], int x, int y)
    {
        if(x==9)
        {
            return true;
        }
        for(int i=y;i<9;i++)
        {
            if(b[i][y]==0)
            {

            }
        }
        return false;
    }    
}
