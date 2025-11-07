package module08._02constructors;

public class Employee extends Person
{
  
   private static int nextId = 1;
   private int id; 
	
   public Employee(String theName)
   {
      super(theName);
      id = nextId;
      nextId++; //ok i get it every time a new employee is made, their id number is one more than the previous employee made
   }
  
   public int getId() 
   {
      return id;
   }
   
   public static void main(String[] args)
   {
      Employee emp = new Employee("Dani");
      System.out.println(emp.getName());
      System.out.println(emp.getId());
      Employee me = new Employee("Charlotte");
      System.out.println(me.getName());
      System.out.println(me.getId());
   }
}
