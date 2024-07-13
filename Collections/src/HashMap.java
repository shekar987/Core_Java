public class HashMap {
    public static void main(String[] args) {
        //storing key in Integer and value in String
        java.util.HashMap<Integer, String> hm = new java.util.HashMap<>();

        /* If you try to insert the duplicate key, it will
            replace the element of the corresponding key.  */
        //a. Inserting Student ID as Key & Name as value using put() method
        hm.put(1, "Sharan");
        hm.put(2, "Rohit");
        hm.put(3, "Leo");
        hm.put(4, "Keerthana");
        hm.put(5, "Aditya");
        hm.put(6, "Manoj");
        hm.put(7, "Mahideep");
        hm.put(8, "Prapul");
        hm.put(9, "Dheeraj");
        hm.put(10, "Rahul");
        System.out.println("\nkey-value pairs of the Student ID and Name : ");
        System.out.println("hm = " + hm);

        //b. Fetching the value of a Key using get() method
        System.out.println("\nName of the Student with ID no = 6 :");
        System.out.println(hm.get(6));

        //c. Creating a clone/copy of HashMap using clone() method
        System.out.println("\nclone/copy of HashMap hm : ");
        System.out.println(hm.clone());

        //d. Checking if the given Key is in the Map using containsKey() method
        System.out.println("\nID No = 3 is in the Map : ");
        System.out.println(hm.containsKey(3));

        //e. Checking if the value is in the Map using containsValue() method
        System.out.println("\nStudent Name = 'Sharan' is in the map :");
        System.out.println(hm.containsValue("Sharan"));

        //f. Checking if the map is empty using isEmpty() method
        System.out.println("\nChecking if the map is empty :");
        System.out.println(hm.isEmpty());

        //g. Printing the size of the Map to the console using size() method
        System.out.println("\nThe size of the Map is :");
        System.out.println(hm.size());

        //h. Printing all the Keys of the map to the console using keySet() method
        System.out.println("\nAll ID No of the students :");
        System.out.println(hm.keySet());

        //j. Removing a specific Key-value pair using remove() method
        System.out.println("\nRemoved ID no = 2 ,Student name = 'Rohit' : ");
        hm.remove(2, "Rohit");
        System.out.println(hm);

        //k. Copying all the elements of the Map to another Map using puttAll() method
        System.out.println("\nCopied all the elements of the hm to icfai :");

        java.util.HashMap<Integer, String> icfai = new java.util.HashMap<>();

        icfai.putAll(hm);
        System.out.println("icfai = " + icfai);
    }
}