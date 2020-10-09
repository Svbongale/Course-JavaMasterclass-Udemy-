package Inheritance;

public class AnimalMain {
    
    public static void main(String[] args){
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Foxy", 1, 100,2,4,1,20,"Silky");
        dog.eat();
        dog.move();
    }
}
