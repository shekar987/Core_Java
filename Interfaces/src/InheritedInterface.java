 interface InheritedInterface {
    void method1();
}

interface InheritedClass_02 extends InheritedInterface
{
    void method2();
}

class InheritedClass implements InheritedClass_02 {
    public void method1() {
        System.out.println("This is implemented method1");
    }

    public void method2() {
        System.out.println("This is implemented method2");
    }

    public static void main(String[] args) {
        InheritedClass obj = new InheritedClass();
        obj.method1();
        obj.method2();
    }
}
