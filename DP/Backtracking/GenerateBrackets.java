package DP.Backtracking;

public class GenerateBrackets {
    public static void main(String[] args) {
        int n=3;
        generate(n, new StringBuilder("("), 1,0);
    }
    public static void generate(int n, StringBuilder s, int open, int close)
    {
        if(open==n && open==close)
        {
            System.out.println(s.toString());
            return;
        }
        if(open<n)
        {
            generate(n, s.append("("), open+1, close);
            s.deleteCharAt(s.length()-1);
        }
        if(close<open)
        {
            generate(n, s.append(")"), open, close+1);
            s.deleteCharAt(s.length()-1);
        }
    }
    
}
