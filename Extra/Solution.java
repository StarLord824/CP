package Extra;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) 
    {        
        int a[]={3,3,3,1,2,1,1,2,3,3,4};
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(a[0], 0);
        int l=0,r=1;
        int ans=1;
        int cnt=1;
        while(r<a.length)
        {
            if(mp.containsKey(a[r]))
            {
                mp.put(a[r],r);
                ans=Math.max(ans,r-l+1);
            }
            else
            {
                if(cnt==1)
                {
                    mp.put(a[r],r);
                    ans=Math.max(ans,r-l+1);
                    cnt++;
                }
                else
                {
                    l=
                }
            }
        }
    }    
}
