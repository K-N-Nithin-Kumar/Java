import java.util.Scanner;
import java.util.HashMap;

public class PascalMem {

    static HashMap<String, Integer> memoMap = new HashMap<>();

    static int nCr(int n, int r) {
        String key = n + "," + r;
        if (memoMap.containsKey(key)) {
            return memoMap.get(key);
        }
        if (r == 0 || n == r) {
            memoMap.put(key, 1);
            return 1;
        } else {
            int value = nCr(n - 1, r - 1) + nCr(n - 1, r);
            memoMap.put(key, value);
            return value;
        }
    }

    static void pascalTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for (int i = 1; i <= (n - row); i++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(nCr(row - 1, col - 1) + " ");
            }
            System.out.println();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of n: ");
            n = sc.nextInt();
        }
        pascalTriangle(n);
    }
}
