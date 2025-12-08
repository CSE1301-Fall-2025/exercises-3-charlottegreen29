package module09._01lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class ExamQuestionThree {
    public static void main(String args[]){
        List < Integer > values = new LinkedList <>();
        int[] array = {12, 6, 7, 4, 1};

        for (int i = 0; i<5; i++){
            values.add(array[i]);
        }

        int index = values.indexOf(7);
        System.out.println(index);
        values.set(index,5);

        for (int i = 0; i<5; i++){
            int x = values.get(i);
            if (x<=6){
                System.out.println(x+i); //oh I see what I did I put the answer if it was printing just x and not x+i
            }
        }

    }
}
