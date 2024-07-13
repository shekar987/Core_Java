import java.util.Iterator;

//Java HashSet class is used to create a collection that uses a hash table for storage.
public class HashSet {
    public static void main(String[] args) {

        java.util.HashSet<String> hs = new java.util.HashSet<>();

        //a. adding elements to the HashSet using add() method
        hs.add("zero");
        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add("four");
        hs.add("five");
        hs.add("six");
        hs.add("seven");
        hs.add("eight");
        hs.add("nine");
        hs.add("ten");
        //does not allow duplicate elements, Set contains unique elements only.
        hs.add("nine");
        System.out.println("\nAfter adding elements to HashSet :");
        //HashSet doesn't maintain the insertion order
        System.out.println("hs = " + hs);


        //b. Iterating through the HashSet by using Iterator object
        Iterator<String> itr = hs.iterator();
        System.out.println("\nIterating through the HashSet : ");
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println(" ");

        //c. Create a clone/copy of HashSet using clone() method
        System.out.println("\nclone/copy of HashSet : ");
        System.out.println(hs.clone());

        //c. Removing a specific element using remove() method
        hs.remove("zero");
        System.out.println("\nAfter removing element 'zero' :");
        System.out.println("hs = " + hs);

        //f. Checking if the set is empty using isEmpty() method
        System.out.println("\nChecking if the set is empty :");
        System.out.println(hs.isEmpty());


        //h. Finding the size of the HashSet using size() method
        System.out.println("\nSize of the HashSet : ");
        System.out.println(hs.size());

        //d. Checking if element is present in the HashSet using contains() method
        System.out.println("\nElement 'one' is present in the HashSet : ");
        System.out.println(hs.contains("one")); //returns boolean value

        //j. Removing all elements of the HashSet using clear() method
        System.out.println("\nAfter removing all elements of the HashSet :");
        hs.clear();
        System.out.println("hs = " + hs);
    }
}