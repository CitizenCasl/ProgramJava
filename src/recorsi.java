import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class recorsi {
     public static int rec(int i, int j, int M, int N, int[][] a, int color) {

        if (a[i][j] != 0) {
            return color;
        }
        else {
        a[i][j] = color;
        if (i+1 < M) {
            if (a[i + 1][j] == 0) {
                rec(i + 1, j, M, N, a, color);
            }
        }
        if (i-1 >= 0) {
            if (a[i - 1][j] == 0) {
                rec(i - 1, j, M, N, a, color);
            }
        }
        if (j+1 < N) {
            if (a[i][j + 1] == 0) {
                rec(i, j + 1,M,N, a, color);
            }
        }
        if (j-1 >= 0){
            if (a[i][j - 1] == 0) {
                rec(i, j - 1,M,N, a, color);
            }
        }
            return color;
        }
    }

    public static void main(String [] args) throws FileNotFoundException {
        File filein = new File("input.txt");
        Scanner scanner = new Scanner(filein);
        int M = scanner.nextInt();
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int [] [] a = new int[M][N];
        int k = 0;
        while (k < K) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            a [x-1][y-1] = -1;
            k++;
        }
        scanner.close();

        File fileout = new File("output.txt");
        PrintWriter writer =new PrintWriter(fileout);

        int color = 0;
        for (int i = 0; i < M; i++){
            for (int j = 0; j < N; j++) {
                if (a[i][j] == 0){
                    color++;
                    rec(i,j,M,N,a,color);
                }
            }
        }

        writer.println(color);
        writer.close();
    }
}
