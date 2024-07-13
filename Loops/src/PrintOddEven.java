public class PrintOddEven {
    public static void main(String[] args) {
        int range = 10;

        System.out.println("Even Numbers:");
        for (int i = 1; i <= range; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Odd Numbers:");
        for (int i = 1; i <= range; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
