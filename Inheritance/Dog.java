package Inheritance;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    
    public Dog(String name,int size,int weight,int eyes, int legs, int tail, int teeth, String coat){
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void chew(){
        System.out.println("DOg.chew() method");
    }

    @Override
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() called");
    }

    public void run(){
        System.out.println("Dog.run() called");
    }
    
    public void getDogDetails(){
        System.out.println("Eyes:" + this.eyes + "legs" + this.legs + "breed" + this.coat + "teeth" + this.teeth + "tail" + this.tail);
    }
}
