import java.util.*;

public class ArrayListExample {
    public static void main(String args[]) {

        // Creation of ArrayList
        ArrayList<String> obj1 = new ArrayList<String>();

        // Adding elements
        obj1.add("Ajeet");
        obj1.add("Harry");
        obj1.add("Chaitanya");
        obj1.add("Steve");
        obj1.add("Anuj");

        // Displaying ArrayList
        System.out.println("\nCurrently the array list obj1 has following elements: " + obj1);

        // Append elements at the end
        obj1.add("Babu");
        obj1.add("Kamal");

        // Creating second ArrayList
        ArrayList<String> obj2 = new ArrayList<String>();
        obj2.add("Alice");
        obj2.add("Bob");
        obj2.add("Raj");

        // Adding obj2 into obj1
        obj1.addAll(obj2);

        System.out.println("\nArrayList obj1 after addAll: " + obj1);

        // Add elements at the given index
        obj1.add(0, "Rahul");
        obj1.add(1, "Justin");

        System.out.println("\nArrayList obj1 after adding elements at the given index: " + obj1);

        // Search an element
        System.out.println("\nEnter the search element:");
        Scanner input = new Scanner(System.in);
        String search = input.nextLine();

        System.out.println("\nArrayList obj1 contains the string " + search
                + ": " + obj1.contains(search));

        // Remove elements
        obj1.remove("Chaitanya");
        obj1.remove("Harry");

        System.out.println("\nCurrent ArrayList obj1 after removing elements: " + obj1);

        // Remove element from given index
        obj1.remove(1);

        System.out.println("\nCurrent ArrayList obj1 after removing element through index: " + obj1);

        // Search names starting with a given letter
        System.out.println("\nEnter the letter to display all strings starting with the given letter:");
        search = input.nextLine();

        ArrayList<String> obj3 = new ArrayList<String>();

        for (int i = 0; i < obj1.size(); i++) {
            if (obj1.get(i).startsWith(search.toUpperCase())) {
                obj3.add(obj1.get(i));
            }
        }

        if (obj3.size() > 0) {
            System.out.println("\nArrayList obj1 contains all strings starting with given "
                    + search + ": " + obj3);
        } else {
            System.out.println("\nNo name starts with " + search
                    + " letter in ArrayList obj1");
        }

        input.close();
    }
}