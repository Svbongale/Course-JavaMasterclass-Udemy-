public class vipCust {
    private String name;
    private double credLimit;
    private String email;

    public vipCust(){
        this("Pach",19000.99);
        System.out.println("Default constructor called");
    }

    public vipCust(String name, double credLimit){
        this("Pach@gmail.com");
        this.name = name;
        this.credLimit = credLimit;
        System.out.println("Name:" + this.name + " credLimit:" + this.credLimit);
    }

    public vipCust(String email){
        this.email = email;
        System.out.println("Email:" + this.email);
    }
// The constructor are called in reverse order due to the fact that the "this" keyword is used to
// call the constructor inside another constructor
    
}
