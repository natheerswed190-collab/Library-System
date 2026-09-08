public class Customer {
   String name;
    double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Customer() {
        this.name = "Invalid";
        this.balance = 0;
    }
    public void CheckBalance()
    {
        System.out.println("\n Name : " + name + "\n Balance : " + balance);
    }
    public  void addBonus(double amount){
        this.balance += amount;
    }
}
