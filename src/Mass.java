import java.util.Scanner;

public class Mass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размерность массива: ");
        int Size = scan.nextInt();
        int [] mas = new int [Size];

        System.out.println("Введите значения элементов массива: ");
        for (int i= 0; i<Size;i++){
            mas[i]=scan.nextInt();
        }
        System.out.println("Выберите сортировку:" + "\n1-по возрастанию" + "\n2-по убыванию");
        int Sort = scan.nextInt();
        int Flag = 0;
        switch (Sort){
            case 1:
                for (int i = 0;i<Size-1;i++)
                {
                    for (int j = i+1; j<Size; j++ )
                    {
                        if (mas[i]>mas[j])
                        {
                            int c = mas[i];
                            mas[i] = mas[j];
                            mas [j] = c;
                        }
                    }
                }
                 Flag = 0;
                break;

            case 2:
                for (int i = 0;i<Size-1;i++)
                {
                    for (int j = i+1; j<Size; j++ )
                    {
                        if (mas[i]<mas[j])
                        {
                            int c = mas[i];
                            mas[i] = mas[j];
                            mas [j] = c;
                        }
                    }
                }
                Flag = 1;
                break;
        }
        if (Flag==0){
            System.out.println("Массив по возрастанию:");
        }else {
            if (Flag == 1){
                System.out.println("Массив по убыванию:");
            }
        }
        for (int i = 0 ;i<Size ; i++)
        {
            System.out.println(mas[i]);
        }

    }
}
