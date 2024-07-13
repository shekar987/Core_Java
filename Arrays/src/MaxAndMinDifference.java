public class MaxAndMinDifference {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int maxDifference = findMaxDifference(arr);
        System.out.println("Maximum difference between adjacent elements: " + maxDifference);
    }

    public static int findMaxDifference(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int largest = arr[0];
        int smallest = arr[0];

        for (int num : arr) {
            if (num > largest)  largest = num;
            if (num < smallest) smallest = num;
        }

        return largest - smallest;
    }
    }

