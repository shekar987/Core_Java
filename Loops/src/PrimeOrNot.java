public class PrimeOrNot {
    public static void main(String[] args) {
        int num = 17;
        int i = 2;
        boolean isPrime = true;
        while (i <= num / 2) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
