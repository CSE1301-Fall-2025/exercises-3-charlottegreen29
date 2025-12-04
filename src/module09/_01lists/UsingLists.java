package module09._01lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UsingLists {

	public static void main(String[] args) { //from lecture

		//creating an ArrayList and filling it with values (look how you don't need to set a size at the beginning!)
		ArrayList <String> rainbow1 = new ArrayList<>();

		rainbow1.add("Red");
		rainbow1.add("Orange");
		rainbow1.add("Yellow");
		rainbow1.add("Green");
		rainbow1.add("Blue");
		rainbow1.add("Indigo");
		rainbow1.add("Violet");

		// some examples of ArrayList methods in action
		System.out.println(rainbow1.size());
		System.out.println(rainbow1.get(2));
		System.out.println();

		System.out.println(rainbow1); //it looks really nice! we don't have to iterate to see the contents like with a simple array!
		
		rainbow1.set(5,"Purple");
		rainbow1.set(6,"Pink");
		System.out.println(rainbow1);

	}
}
