package Inheritance;

public class AnimalMain {
    
    public static void main(String[] args){
        Animal obj1 = new Animal();
        Animal obj2 = new Animal("Mammal",1,1,10,300);
        obj1.getName();
        obj2.getDetails();
        Dog obj3 = new Dog(2,4,1,32,"GermanShepard");
        obj3.getDogDetails();
        obj3.getDetails();
        obj3.weight=400;
        obj3.getDetails();
    }
}
