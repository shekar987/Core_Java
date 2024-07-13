public class EvenOrOddUsingSwitch {
    public static void main(String[] args) {
        int num = 10;
        switch (num % 2) {
            case 0:
                System.out.println(num + " is an even number.");
                break;
            default:
                System.out.println(num + " is an odd number.");
        }
    }
}
