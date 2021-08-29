import java.util.Scanner;

public class Hell {
    public static void main(String[] args) {
        String string1 = new String("Hello");
        String string2 = new String("Hello");;
        System.out.println(string1.equals(string2));
        System.out.println(string1 == string2);
    }
}
 class Animal{
        private  int id;
        public Animal(int id){
            this.id = id;
        }
        public boolean equals(Object obj){
            Animal otherAnimal = (Animal) obj;
            return this.id ==otherAnimal.id;
        }
}

