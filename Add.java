public class Add {
    protected int a,b;
    protected double result;
    
    public Add(int a,int b){
        this.a = a;
        this.b = b;
    }

    public void add(){
        result = a+b;
        System.out.println("result" + result);
    }
}
