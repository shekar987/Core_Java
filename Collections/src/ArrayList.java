
import java.util.Arrays;
import java.util.Iterator;

/* Java ArrayList class uses a dynamic array for storing the elements.
   It is like an array, but there is no size limit. We can add or remove elements anytime. */
public class ArrayList {

    public static void main(String[] args) {

        //passing an Array converted to List using the asList() method
        java.util.ArrayList<String> al = new java.util.ArrayList<>(
                Arrays.asList("zero", "one", "two", "three", "four", "five"));
        System.out.println("\nal = " + al);

        //a. adding elements to the ArrayList using add method using add() method
        al.add("six");
        al.add("seven");
        al.add("eight");
        al.add("nine");
        System.out.println("\nAfter adding elements :");
        System.out.println("al = " + al);


        //b. Iterating through the ArrayList by using Iterator object
        Iterator<String> itr = al.iterator();
        System.out.println("\nIterating through the ArrayList : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        //c. Adding an element at a specific index using add() method
        al.add(1, "AtIndex1");
        System.out.println("\nAfter adding an element at index 1 :");
        System.out.println("al = " + al);

        //d. Removing an element at a specific index using remove() method
        al.remove(1);
        System.out.println("\nAfter removing an element at index 1 :");
        System.out.println("al = " + al);

        //e. Updating the element at a specific index using set() method
        al.set(1, "ONE");
        System.out.println("\nAfter updating the element at index 1 :");
        System.out.println("al = " + al);

        //f. Checking the element is present at a particular index using indexOf() method
        System.out.println("\nThe element is present at index :");
        System.out.println(al.indexOf("three"));

        //g. Getting an element at a particular index using get() method
        System.out.println("\nThe element at index 3 :");
        System.out.println(al.get(3));

        //h. Finding the size of the ArrayList using size() method
        System.out.println("\nSize of the ArrayList : ");
        System.out.println(al.size());

        //i. Checking the element is present in the ArrayList using contains() method
        System.out.println("\n'two' is present in the ArrayList : ");
        System.out.println(al.contains("two")); //returns boolean value

        //j. Removing all elements of the ArrayList using clear() method
        System.out.println("\nAfter removing all elements of the ArrayList :");
        al.clear();
        System.out.println("al = " + al);
    }
}