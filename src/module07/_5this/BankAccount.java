package module07._5this;

public class BankAccount {

    private String name;
    private int accNumber;
    private double balance;

    public BankAccount(){
        this.name = "";
        this.accNumber = 0;
        this.balance = 0.0;
    }
    
    public BankAccount(String name, int accNumber, double balance){
        this.name = name;
        this.accNumber = accNumber;
        this.balance = balance;
    }

    public String toString(){
        return "Name: " + this.name + ", Account Number: " + this.accNumber + ", Balance: " + this.balance;
    }

    public void returnAmount(double amount){
        this.balance+=amount;
    }

    public void withdrawAmount(double amount){
        if (amount<=this.balance){
            this.balance-=amount;
        }
    }

    public static void main(String[] args){
        BankAccount myAccount = new BankAccount("Charlotte",601305,246.01);
        System.out.println(myAccount);
        myAccount.withdrawAmount(10.01);
        System.out.println(myAccount);
        myAccount.returnAmount(10.0);
        System.out.println(myAccount);
        myAccount.withdrawAmount(300.0);
        System.out.println(myAccount);
    }
}
