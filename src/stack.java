import java.io.*;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) throws FileNotFoundException {
        File filein = new File("input.txt");
        Scanner scan = new Scanner(filein);
        File fileout = new File("output.txt");
        PrintWriter write = new PrintWriter(fileout);
        int exeption = 0;
        int size = 0;
        if (filein.length() == 0) {
			write.println("Да");
        } else {
            String s = scan.nextLine();
            scan.close();
            Stack stack = new Stack();
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                    stack.push(s.charAt(i));
                    size++;

                } else {
                    if (!stack.empty()) {
                        String s1 = String.valueOf(s.charAt(i));
                        String s2 = String.valueOf(stack.peek());
                        if (s2.equals("(") && s1.equals(")")) {
                            stack.pop();
                            exeption++;
                        }
                        if (s2.equals("[") && s1.equals("]")) {
                            stack.pop();
                            exeption++;
                        }
                        if (s2.equals("{") && s1.equals("}")) {
                            stack.pop();
                            exeption++;
                        }

                    }
                }
            }
          if (size == exeption) {
                write.println("Да");
            } else {
                write.println("Нет");
            }
        }
        write.close();
    }
}
