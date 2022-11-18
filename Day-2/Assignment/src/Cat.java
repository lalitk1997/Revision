public class Cat extends Animal{

    private String nickName;

    // No-Args Constructor
    public Cat(){
        super();
    }

    // Parameterized Constructor
    public Cat(String nickName){
        super();
        this.nickName = nickName;
    }

    // Initializing Parent Class(Animal Class data member name)
    public Cat(String name, String nickName){
        super.setName(name);
        this.nickName = nickName;
    }

    // Getter & Setter
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    void makeNoise() {
        System.out.println("Meow......! (Cat Class)");
    }

    @Override
    void eat() {
        System.out.println("Eating fish...! (Cat Class)");
    }

    void jump(){
        System.out.println("Cat jumped from the roof !..... (Cat Class)");
    }

}
