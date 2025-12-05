package Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;



/*

🔎 What is ?
•- Specialized iterator for lists (ArrayList, LinkedList).
- Extends Iterator with extra methods:
- hasNext(), next(), remove() (inherited from Iterator)
- hasPrevious(), previous() → bidirectional traversal
- nextIndex(), previousIndex() → index positions
- set(E e) → replace last returned element
- add(E e) → insert new element at current cursor position



Key Takeaways
- Forward + Backward traversal → hasNext()/next() and hasPrevious()/previous().
- Index tracking → nextIndex() and previousIndex().
- Modification:
- set(E e) → replaces last returned element.
- add(E e) → inserts element at cursor position.
- remove() → deletes last returned element.






*/

public class ListIteratorDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Vivek");
        names.add("Vanshi");
        names.add("Virat");
        names.add("Anjali");

        System.out.println("Original List: " + names);

        // Get ListIterator starting at index 0
        ListIterator<String> listItr = names.listIterator();

        // Forward traversal using hasNext() and next()
        System.out.println("\nForward Traversal:");
        while (listItr.hasNext()) {
            int index = listItr.nextIndex(); // index of next element
            String name = listItr.next();    // move forward
            System.out.println("Index " + index + " -> " + name);

            // Replace element using set()
            if (name.equals("Virat")) {
                listItr.set("King Kohli"); // replaces "Virat"
            }

            // Add element after "Vanshi"
            if (name.equals("Vanshi")) {
                listItr.add("AddedAfterVanshi"); // inserts new element
            }
        }

        // Backward traversal using hasPrevious() and previous()
        System.out.println("\nBackward Traversal:");
        while (listItr.hasPrevious()) {
            int index = listItr.previousIndex(); // index of previous element
            String name = listItr.previous();    // move backward
            System.out.println("Index " + index + " <- " + name);

            // Remove element safely
            if (name.equals("Anjali")) {
                listItr.remove(); // removes "Anjali"
            }
        }

        System.out.println("\nFinal List: " + names);
    }
}