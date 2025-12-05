package Iterator;

import java.util.*;


/*

Key Points About Iterator Methods
• 	 → checks if there’s another element.
• 	 → returns the next element and advances the cursor.
• 	 → removes the last element returned by .
• 	Must be called after .
• 	Safe way to remove elements during iteration (avoids ).

*/

public class removeEven {


    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();

        int n = 10;
        
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        
        System.out.println("ArrayList: " + numbers);


        Iterator<Integer> itr = numbers.iterator();

        while(itr.hasNext())
        {
            if(itr.next() % 2 == 0) // if even
            {
                itr.remove();
            }


        }

        System.out.println("After removing even no.");

        System.out.println("ArrayList: " + numbers);




    }
    
}
