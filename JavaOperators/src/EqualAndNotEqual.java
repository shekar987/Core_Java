import java.util.Scanner;

public class EqualAndNotEqual {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = num.nextInt();
        System.out.print("Enter second number : ");
        int b = num.nextInt();
        if (a == b) {
            System.out.println("Both are equal");
        }
        else if (a != b) {
            System.out.println("Both are different");
        }
    }
}