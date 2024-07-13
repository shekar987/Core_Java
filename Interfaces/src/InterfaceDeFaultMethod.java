
interface InterfaceDeFaultMethod {
    default void method() {
        System.out.println("This is a default method");
    }
}

class ImplementingClass implements InterfaceDeFaultMethod {
    // No implementation for method()

    public static void main(String[] args) {
        InterfaceDeFaultMethod obj = new ImplementingClass();
        obj.method(); // Output: This is a default method
    }
}
