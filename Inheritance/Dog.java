package Inheritance;

public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String breed;
    
    public Dog(int eyes, int legs, int tail, int teeth, String breed){
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.breed = breed;
    }

    public void getDogDetails(){
        System.out.println("Eyes:" + this.eyes + "legs" + this.legs + "breed" + this.breed + "teeth" + this.teeth + "tail" + this.tail);
    }
}
