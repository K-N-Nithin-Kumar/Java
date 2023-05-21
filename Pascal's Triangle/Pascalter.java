import java.util.Scanner;

public class PascalIter {

    static int nCr(int n, int r) {
        int res = 1;
    
        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int)(res);
    }
    
    static void pascalTriangle(int n) {
        for (int row = 1; row <= n; row++) {
            for(int i=1;i<=(n-row);i++)
            {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print(nCr(row - 1, col - 1)+" ");
                
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
/*
    cols             1   2    3   4   5
    1st row--->               1
    2nd row--->             1   1
    3rd row--->           1   2   1
    4th row--->         1   3   3   1
    5th row--->       1   4   6   4   1

    *If we consider any of the element in the triangle it is indexed by its coressponding row and column
    *let us consider the element 6 in the 5th row and 3rd column it can be got by the performing the ncr on its row and column
    *Therefore 6 can be obtained by (row-1)C(col-1) ie 4C2 = (4!)/(2!)*(2!);
    *By using this concept we printed entire triangle



 */
