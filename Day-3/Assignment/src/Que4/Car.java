package Que4;

public abstract class Car {
    // 1
    static {
        System.out.print("1");
    }

    // 3
    public Car(String name) {
        super();
        System.out.print("2");
    }

    // S2
    {
        System.out.print("3");
    }
}
