public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    protected int weight;

    public Animal(){
        System.out.println("Default constructor called");
    }
    public Animal(String name, int brain, int body, int size, int weight){
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }
    
    public int getBrain(){
        return this.brain;
    }

    public int getBody(){
        return this.body;
    }

    public int getSize(){
        return this.size;
    }

    public int getWeight(){
        return this.weight;
    }

    public void getDetails(){
        System.out.println(this.name + " " + this.weight + " " + this.brain + " " + this.body + " " + this.size);
    }
    
}
