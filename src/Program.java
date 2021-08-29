import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int start = -1;
        int end = -1;
        for (int i = 1; i < s.length() -1; i++) {
            if (!Character.isWhitespace(s.charAt(i))) {
                start = i;
                break;
            }
        }
        for (int i = s.length() - 2; i > 0; i--) {
            if (!Character.isWhitespace(s.charAt(i))) {
                end = i;
                break;
            }
        }
        String s1 = "[" + s.substring(start);
        String s2 =  s.substring(0, end+1) + "]";
        String s3 = "["+s.substring(1, s.length()-1).trim()+ "]";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}