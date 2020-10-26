package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery startLoad = new Battery(15);
        Battery addLoad = new Battery(56);
        startLoad.exchange(addLoad);
        System.out.println(addLoad.load);
    }
}
