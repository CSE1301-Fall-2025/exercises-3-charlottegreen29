package module08._03overriding;

public class SpanishGreeter extends Greeter {

    @Override //first time writing one of these bad boys
    public String greet(){
        return "¡Hola!";
    }
    
}
