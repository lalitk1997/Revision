abstract class Animal {
    private String name;

    // No-Args Constructor
    public Animal(){
    }

    // Parameterized Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract Methods
    abstract void makeNoise();
    abstract void eat();

    // Normal Method
    public void sleep(){
        System.out.println("Animal is sleeping!...(method-definition-&-body inside abstract class)");
    }

    // Getter & Setter Methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
