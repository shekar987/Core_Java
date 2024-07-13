import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6, 6, 7};
        int[] uniqueArr = removeDuplicates(arr);
        System.out.println("Array with duplicates removed: " + Arrays.toString(uniqueArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] uniqueArr = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArr[index++] = arr[i];
            }
        }

        return Arrays.copyOf(uniqueArr, index);
    }
}