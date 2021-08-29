import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

    public class source {

        private static boolean isPrime(int x) {
        for (int i = 2; i <= (int)Math.sqrt(x); i++) {
        if (x % i == 0) {
        return false;
        }
        }
        return true;
        }

    public static void main(String[] args)  {

        int[] primes = new int[100];
        primes[0] = 1;
        int  a = 2;
        int found = 1;
        while (found < 100) {
            if ( isPrime(a)) {
                primes[found++] = a;
            }
            a++;
        }
        for (int i = 0; i < 100; i++){
            System.out.println(primes[i]);
        }
    }
}