package Extra;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P3{
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) 
    {
        int t=sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            int m = sc.nextInt();
            int[] d = new int[m];

            for (int i = 0; i < m; i++) {
                d[i] = sc.nextInt();
            }

            System.out.println(canTransform(a, b, d) ? "YES" : "NO");
        }
    }
    
    private static boolean canTransform(int[] a, int[] b, int[] d) {
        Map<Integer, Integer> neededChanges = new HashMap<>();
        Map<Integer, Integer> availableChanges = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                neededChanges.put(b[i], neededChanges.getOrDefault(b[i], 0) + 1);
            }
        }

        for (int value : d) {
            availableChanges.put(value, availableChanges.getOrDefault(value, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : neededChanges.entrySet()) {
            int requiredValue = entry.getKey();
            int requiredCount = entry.getValue();

            if (availableChanges.getOrDefault(requiredValue, 0) < requiredCount) {
                return false;
            }
        }

        return true;
    }
}
