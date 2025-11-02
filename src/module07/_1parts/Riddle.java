package module07._1parts;

public class Riddle
{
   // write 2 instance variables for Riddle's question and answer: private type variableName;
   private String question;
   private String answer;
   
   
   // constructor
   public Riddle(String initQues, String initAns) ///idk they said to change the names, but this feels less straightforward to me; ig we'll learn why later
   {
      question = initQues;
      answer = initAns;
   }
   
   // Print riddle question
   public void printQuestion()
   {
     System.out.println(question);
   }
   
   // Print riddle answer
   public void printAnswer()
   {
     System.out.println(answer);
   }
   
   // main method for testing
   public static void main(String[] args)
   {
      Riddle r1 = new Riddle("What goes up but never comes down?","Your age.");
      r1.printQuestion();
      r1.printAnswer();
      Riddle r2 = new Riddle("I need air to live, but if you give me water, I die. What am I?", "Fire");
      r2.printQuestion();
      r2.printAnswer();
   }
}
