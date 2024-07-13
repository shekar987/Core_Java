public class Static {

    // Static variables
    static int sv1 = 11;
    static int sv2 = 22;

    // Instance variables
    int iv1 = 33;
    int iv2 = 44;

    static void staticMethod1() {
        Static obj = new Static();
        System.out.println("Instance variables: " + obj.iv1 + ", " + obj.iv2);
    }

    void instanceMethod1() {
        System.out.println("Static variables: " + sv1 + ", " + sv2);
    }

    static void staticMethod2() {
        Static obj = new Static();
        obj.instanceMethod1();
    }

    void instanceMethod2() {
        staticMethod1();
    }

    public static void main(String[] args) {
        Static stc = new Static();

        System.out.println("Static variables: " + sv1 + ", " + sv2);
        System.out.println("Instance variables: " + stc.iv1 + ", " + stc.iv2);

        staticMethod1();
        staticMethod2();
        stc.instanceMethod1();
        stc.instanceMethod2();
    }
}