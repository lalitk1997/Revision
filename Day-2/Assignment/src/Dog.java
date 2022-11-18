public class Dog extends Animal{
    private String breed;

    // No-Args Constructor
    public Dog(){
        super();
    }

    // Parameterized Constructor
    public Dog(String breed) {
        this.breed = breed;
    }

    // Initializing super-class (String name) and String breed (Dog Class)
    public Dog(String name, String breed){
        super.setName(name);
        this.breed = breed;
    }

    // Getter & Setter
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    void makeNoise() {
        System.out.println("Dodg is barking...! (Dog Class)");
    }

    @Override
    void eat() {
        System.out.println("Sipping Milk!... (Dog Class)");
    }

    void play(){
        System.out.println("Fetch the ball....! (Dog Class)");
    }
}
