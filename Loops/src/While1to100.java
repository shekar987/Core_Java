public class While1to100 {
    public static void main(String[] args) {
        int num = 10;

        while (num <= 100) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
