package module08._06polymorphism;

public class Account 
{
    private String name;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(String name, double balance)
    {
       this.name = name;
       this.balance = balance;
    }

    public double withdraw(double amount){
        if (amount<=this.balance){ // don't forget to account for someone trying to withdraw more than they have!
            this.balance-=amount;
            return amount;
        }
        else {
            return 0.0;
        }
    }

    public void deposit(double amount){
        this.balance+=amount;
    }

    public String toString(){
        return "Name: " + this.name + ", Balance: $" + this.balance;
    }

    public static void main(String[] args)
    {
        Account myAccount = new Account("Charlotte",16239.59);
        System.out.println(myAccount);
        myAccount.withdraw(1000);
        System.out.println(myAccount);
        myAccount.deposit(1000);
        System.out.println(myAccount);
        
        
    }
}
