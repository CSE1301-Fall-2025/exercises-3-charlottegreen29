package module09._03maps;

import java.util.HashMap;
import java.util.Map;
import java.util.*; 

public class Movies {

    public static void main(String[] args){
    
        Map<String, Integer> movieRatings = new HashMap<>();

        Scanner scan = new Scanner(System.in);
    
        String input = "";

        while (!input.equals("stop")){
            System.out.println("What do you want to do?");
            System.out.println("Type A for add movie \nType B for lookup movie\nType stop to stop");
            input = scan.nextLine();
            if (input.equals("A")){
                String movieName = "";
                int movieRating;
                System.out.println("Movie name: ");
                movieName = scan.nextLine();
                System.out.println("Movie rating (a number between 1 and 5): ");
                movieRating = scan.nextInt();
                movieRatings.put(movieName,movieRating);
            }
            else if (input.equals("B")){
                String movieName = "";
                System.out.println("What movie would you like to see a rating for?");
                movieName = scan.nextLine();
                Integer rating = movieRatings.get(movieName);
                if (rating == null){
                    System.out.println("This movie title isn't in the database.");
                }
                else {
                    System.out.println("The rating for this movie is " + movieRatings.get(movieName));
                }
            }
            else {
                System.out.print("");
            }
            

        } 

        scan.close();

    }

}
