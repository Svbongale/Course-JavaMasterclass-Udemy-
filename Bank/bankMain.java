public class bankMain {
    public static void main(String[] args){
        bank person = new bank();
        // without constructor
        person.withdraw(100.00);
        person.deposit(1000.00);
        person.deposit(76.99);
        person.withdraw(456.88);
        person.setAccNo(123456789);
        person.setCustName("SavyaSachi Bongale");
        person.setEmail("SavyaSachiBongale@gmail.com");
        person.setPhNo(998855447);
        person.setBalance(4455059.88);
        person.withdraw(19888.99);
        person.getDetails();

        // With constructor
        bank person1 = new bank("Joe ","joe@gmail.com ",8833477,4433550,88990.00);
        person1.getDetails();
        // calling constructor within another constructor
        bank person2 = new bank();
        person2.getDetails();
    }
}
