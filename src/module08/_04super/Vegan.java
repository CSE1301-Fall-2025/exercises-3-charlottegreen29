package module08._04super;

public class Vegan extends Student{

    public Vegan(String theName){
        super(theName);
    } 

    public String getFood(){
        String output = "No ";
        output += super.getFood();
        return output;
    }
    
}
