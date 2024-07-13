public class IncrementDecrement {

    static void preIncrement(int a) {
        int res;
        res = ++a;
                System.out.println("Values after Pre-Increment a : " + a + "," + res);
    }

    static void postIncrement(int a) {
        int res;
        res = a++;
        System.out.println("Values after Post-Increment a : " + a + "," + res);
    }

    static void preDecrement(int a) {
        int res;
        res = --a;
        System.out.println("Values after Pre-Decrement a : " + a + "," + res);
    }

    static void postDecrement(int a) {
        int res;
        res = a--;
        System.out.println("Values after Post-Decrement a : " + a + "," + res);
    }

    public static void main(String[] args) {
        int a = 10;
        preIncrement(a);
        postIncrement(a);
        preDecrement(a);
        postDecrement(a);
    }
}
