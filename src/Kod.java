import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kod {

    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner scanner= new Scanner(System.in);
        int n = scanner.nextInt();
        List <Vuvod> objects = new ArrayList<>();
        for (int i = 1;i<=n;i++){
            Vuvod test = new Vuvod(i);
            objects.add(test);
        }

    }
}
class Vuvod{
      public  Vuvod(int n) throws UnsupportedEncodingException {
            PrintStream ps = new PrintStream(System.out, true, "Windows-1251");
            ps.println("создание "+ n+"-го объекта");
        }
    }
