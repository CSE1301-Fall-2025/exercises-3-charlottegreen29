package module08._06polymorphism;

public class CheckingAccount extends Account{
    private double overDraftFee = 20.0;

    public CheckingAccount(String name, double balance, double fee){
        super(name, balance);
        overDraftFee = fee;
        balance = balance - overDraftFee; //is this how over draft fees work?
    }



}
