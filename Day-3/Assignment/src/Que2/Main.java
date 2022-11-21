package Que2;

import Que3.Circle;

public class Main implements Inter1, Inter2{
    @Override
    public void displayName1() {
        System.out.println("Lalit Kumar");
    }

    // Due to same default methods in Inter1 & Inter2 Interface
    @Override
    public void displayData() {
        Inter1.super.displayData();
    }

    public void displayData2(){
        Inter2.super.displayData();
    }

    @Override
    public void displayName2() {
        System.out.println("Rupesh Patil");
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.displayData();
        obj.displayData2();

    }
}
