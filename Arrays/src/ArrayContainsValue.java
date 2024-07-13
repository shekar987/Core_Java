public class ArrayContainsValue {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int valueToFind = 3;
        boolean containsValue = containsValue(numbers, valueToFind);

        if (containsValue) {
            System.out.println("The array contains the value: " + valueToFind);
        } else {
            System.out.println("The array does not contain the value: " + valueToFind);
        }
    }

    public static boolean containsValue(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }
}
