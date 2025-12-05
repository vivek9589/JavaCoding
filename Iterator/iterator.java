package Iterator;

import java.util.*;




/*

Notes
• 	 prevents  by checking before calling .
• 	 moves the cursor forward and returns the element.
• 	 deletes the last element returned by .
• 	⚠️ You must call  before , otherwise  occurs.
• 	Iterators are fail-fast in Java: if the collection is modified directly (e.g., ) while iterating, you’ll get a . Always use  inside iteration.



*/

public class iterator {


    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Vivek");
        list.add("ram");
        list.add("shyam");
        list.add("rahul");
        list.add("raj");
        list.add("One");

        System.out.println(" ");

        System.out.println("Traverse using For each ");

        // traverse using for each loop
        for(String str : list)
        {
            System.out.println(str);
        }


        // if we use for each loop and try to remove an element from the list , it will throw an error ;
        // but in the case of itertor , it provide in-built method remove() to remove an element . 

        // using iterator we can also traverse class// custom data structures. By implementing Iterable interface, and provides its implementation



        System.out.println("Traverse using Iterator ");


        // 


        Iterator<String> itr = list.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
    
}
