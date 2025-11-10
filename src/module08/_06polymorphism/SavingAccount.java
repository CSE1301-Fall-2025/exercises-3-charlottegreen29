package module08._06polymorphism;

public class SavingAccount extends Account{
    private double interestRate;

    SavingAccount(String name, double balance, double interestRate){
        super(name,balance);
        this.interestRate = interestRate;
    }

    //I needed to make getters and setters for balance to get this to work
    public void compoundInterest(){
        this.setBalance(this.getBalance()*(1+interestRate));
    }
    
}
