package module07._5this;

public class Cat {

    // here's all the "has-a"s. Shook put more in like gender, color, breed, etc.
    private String name;
    private String voice;
    private int age;

    //behaviors-->methods (meowing, running, eating, sleeping, dying, shedding, etc.)

    public Cat(String name, String voice){
        this.name = name; //"this"! (see notes on "this" in notes doc)
        this.voice = voice;
        age = 0; // we can have default values here if we want; there's lots of flexibility
    }

}
