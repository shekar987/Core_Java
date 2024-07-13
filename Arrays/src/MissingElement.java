public class MissingElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};
        int missingElement = findMissingElement(arr);
        System.out.println("Missing element: " + missingElement);
    }

    public static int findMissingElement(int[] arr) {
        int n = arr.length + 1;
        int sum = (n * (n + 1)) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return sum - actualSum;
    }
}
