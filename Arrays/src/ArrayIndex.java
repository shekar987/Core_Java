public class ArrayIndex {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int element = 3;
        int index = findIndex(numbers, element);
        System.out.println("Index of " + element + ": " + index);
    }

    public static int findIndex(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
