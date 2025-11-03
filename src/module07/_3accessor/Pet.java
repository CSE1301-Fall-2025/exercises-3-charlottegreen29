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

    public void setName(String newName){
        name = newName;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int newAge){
        age = newAge;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double newWeight){
        weight = newWeight;
    }

    public String getType(){
        return type;
    }

    public void setType(String newType){
        type = newType;
    }

    public String getBreed(){
        return breed;
    }

    public void setBreed(String newBreed){
        breed = newBreed;
    }

    public String toString(){
        return "Name: " + name + "\nAge: " + age + " years old\nWeight: " + weight + " lbs\nType: " + type + "\nBreed: " + breed;
    }

    public static void main(String[] args){
        Pet pete = new Pet();
        Pet goldie = new Pet("Goldie", 2, 0.4, "fish", "goldfish");
        Pet tabitha = new Pet("Tabitha", 5, 9.2, "cat", "tabby");
        System.out.println(pete);
        System.out.println();
        System.out.println(goldie);
        System.out.println();
        System.out.println(tabitha);
        System.out.println();
        pete.setName("Pete");
        pete.setAge(8);
        pete.setWeight(23.6);
        pete.setType("dog");
        pete.setBreed("corgi");
        System.out.println(pete);
    }
}   
