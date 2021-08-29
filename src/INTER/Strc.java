package INTER;

import INTER.Info;

public class Strc implements Info {
    public String name;

        public Strc(String name){
            this.name=name;
        }

    @Override
    public void showInfo() {
        System.out.println("This name "+this.name);
    }
}
