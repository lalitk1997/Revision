package Que1;

public class Main implements Inter{

    @Override
    public void displayName() {
        System.out.println("Lalit Kumar");
    }

    @Override
    public void displayAddress() {
        System.out.println("Gurgaon");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.displayName();
        obj.displayAddress();
        obj.displayInstitute();
        Inter.batchStrength();
    }
}
