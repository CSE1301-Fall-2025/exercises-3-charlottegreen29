package module08._06polymorphism;

public class CheckingAccount extends Account{
    private double overDraftFee;

    public CheckingAccount(String name, double balance, double fee){
        super(name, balance);
        overDraftFee = fee;
    }

    // now the user can get more money than what's in the account
    // assuming (as prof nuri did) that the bank won't let themselves be in more than $50 of debt per account
    public double withdraw(double amount){
        if (amount <= getBalance() + 50){
            this.setBalance(getBalance() - amount - overDraftFee);
            return amount;
        }
        else {
            this.setBalance(0);
            return this.getBalance(); // this is what prof nuri did
        }

    }



}
