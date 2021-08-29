package INTER;

import INTER.Info;

public class Pers implements Info {
    public int id;
    public  Pers(int id){
        this.id=id;
    }

    @Override
    public void showInfo() {
        System.out.println("This id "+this.id);
    }
}
