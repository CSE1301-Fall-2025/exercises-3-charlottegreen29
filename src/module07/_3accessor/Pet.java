package module07._3accessor;

public class Pet {

    private String name;
    private int age;
    private double weight;
    private String type;
    private String breed;

    public Pet(){
        name="";
        age = 0;
        weight = 0.0;
        type = "";
        breed = "";
    }

    public Pet(String initName, int initAge, double initWeight, String initType, String initBreed){
        name = initName;
        age = initAge;
        weight = initWeight;
        type = initType;
        breed = initBreed;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getWeight(){
        return weight;
    }

    public String getType(){
        return type;
    }

    public String getBreed(){
        return breed;
    }

    public String toString(){
        return "Name: " + name + "\nAge: " + age + " years old\nWeight: " + weight + " lbs\nType: " + type + "\nBreed: " + breed;
    }

    public static void main(String[] args){
        Pet pete = new Pet("Pete", 8, 23.6, "dog", "corgi");
        Pet goldie = new Pet("Goldie", 2, 0.4, "fish", "goldfish");
        Pet tabitha = new Pet("Tabitha", 5, 9.2, "cat", "tabby");
        System.out.println(pete);
        System.out.println();
        System.out.println(goldie);
        System.out.println();
        System.out.println(tabitha);
    }
}   
