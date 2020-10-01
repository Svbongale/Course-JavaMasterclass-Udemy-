public class bank {
    private int accNo;
    private double balance;
    private String custName;;
    private String email;
    private int phNo;
    
    // Constructor
    public bank(){
        // Calling a parameterized constructor within a constructor using this keyword
        this("Pach","pach@gmail.com",99008877,8998876,88990.76); //!!!!!!!!MUST ALWAYS BE IN THE FIRSTLINE
        System.out.println("Default constructor called!");
    }

    // Parameterized constructor
    public bank(String custName,String email,int phNo,int accNo,double balance){
        System.out.println("Parametrized constructor called");
        this.custName = custName;
        this.email = email;
        this.accNo = accNo;
        this.balance = balance;
        this.phNo = phNo;
    }




    public int getAccNo() {
        return this.accNo;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustName() {
        return this.custName;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhNo(){
        return this.phNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;
        System.out.println("New balance: " + this.balance);
    }

    public void withdraw(double amount) {
        if((this.balance>0.0)&&((this.balance- amount)>0.0))
        {
            this.balance = this.balance - amount;
            System.out.println("Remaining balance: " + this.balance);
        }        
        else 
        System.out.println("Insufficient Balance");
    }

    public void getDetails() {
        System.out.println("Name: " + this.custName + "AccNo: " + this.accNo + "Balance:" + this.balance + "Email: " + this.email + "PhNo: " + this.phNo);
    }
}
