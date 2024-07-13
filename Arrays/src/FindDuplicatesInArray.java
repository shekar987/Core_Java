public class FindDuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6, 6, 7};
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        boolean hasDuplicates = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    hasDuplicates = true;
                    System.out.println("Duplicate elements found: " + arr[i]);
                }
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate elements found in the array.");
        }
    }
}
