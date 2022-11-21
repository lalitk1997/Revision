package Que4;

public class BlueCar extends Car{
    // 4
    {
        System.out.print("4");
    }
    //5
    public BlueCar() {
        super("blue");
        System.out.print("5");
    }

    public static void main(String[] gears) {
        new BlueCar();
    }
}
