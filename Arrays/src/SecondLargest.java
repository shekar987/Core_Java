public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 3, 7};
        int secondLargest = findSecondLargest(arr);
        System.out.println("Second largest number in the array: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return max2;
    }
}
