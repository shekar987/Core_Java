public class MinAndMaxInArray {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 3, 5};
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)  min = arr[i];
            if (arr[i] > max)  max = arr[i];
        }
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }

}
