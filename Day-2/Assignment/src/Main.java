public class Main {
    public static void main(String args[]){
        Animal animalObj1 = new Cat("ramika", "rami");
        animalObj1.sleep();
        animalObj1.eat();
        animalObj1.makeNoise();

        // Down-casting (Parent Class Object -> Child Class Object)
        Cat catObj = (Cat)animalObj1;
        catObj.jump();

        Animal animalObj2 = new Dog("bruno", "german shepard");
        animalObj2.sleep();
        animalObj2.eat();
        animalObj2.makeNoise();

        // Dow-casting (Parent -> Child class Obj)
        Dog dogObj = (Dog)animalObj2;
        dogObj.play();

    }
}
