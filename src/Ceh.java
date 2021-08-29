import java.util.Scanner;

public class Ceh {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        Person pers = new Person();

        String nam = scan.nextLine();
        String dol = scan.nextLine();
        int oKl = scan.nextInt();
        int nat = scan.nextInt();
        pers.setNAME(nam);
        pers.setOKLAD(oKl);
        pers.setNATBAVKA(nat);
        pers.setDOLZNOST(dol);
        System.out.println(pers.toString());
        System.out.println("ФИО");
        System.out.println(pers.getNAME());
        System.out.println("Должность");
        System.out.println(pers.getDOLZNOST());
        System.out.println("Оклад");
        System.out.println(pers.getOKLAD());
        System.out.println("Натбавка");
        System.out.println(pers.getNATBAVKA());
        System.out.println("Количество рабочих дней");
        System.out.println(Person.WORK_DAY);
    }
}

class Person {
   private String NAME;
   private String DOLZNOST;
   private int OKLAD;
   private int  NATBAVKA;
   public  static final int WORK_DAY = 7 ;



    public void setNAME(String name)
    {
            if (name.isEmpty())
        {
            System.out.println("Некорректное имя");
        }
        else {
            NAME = name;
        }
    }
    public void setDOLZNOST(String DOLZ)
    {
        if (DOLZ.isEmpty())
        {
            System.out.println("Некорректная должность");
        }
        else {
            DOLZNOST = DOLZ;
        }
    }
    public void setOKLAD(int okl)
    {
        if (okl<0)
        {
            System.out.println("Некорректный оклад");
        }
        else {
            OKLAD = okl;
        }
    }
    public void setNATBAVKA(int natbavka)
    {
        if (natbavka<0)
        {
            System.out.println("Некорректный оклад");
        }
        else {
             NATBAVKA= natbavka;
        }
    }

    public String getNAME()
    {
        return NAME;
    }
    public String getDOLZNOST()
    {
        return DOLZNOST;
    }
    public int getOKLAD()
    {
        return OKLAD;
    }
    public int getNATBAVKA()
    {
        return NATBAVKA;
    }
}