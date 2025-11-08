package module08._04super;

public class OnlineCustomer extends Customer{

    private String email;

    public OnlineCustomer(String n, String a, String e){
        super(n,a);
        email = e;
    }

    public String toString(){
        String output = super.toString();
        output += "\nEmail: " + email;
        return output;
    }

}
