public interface InterfaceTwoMethods {

    void method1();

    void method2();
}
class InterfaceTwoMethods_02 implements InterfaceTwoMethods
{
    public void method1()
    {
        System.out.println("This is implemented method1");
    }

    public void method2()
    {
        System.out.println("This is implemented method2");
    }

    public static void main(String[] args) {
        InterfaceTwoMethods_02 obj = new InterfaceTwoMethods_02();
        obj.method1();
        obj.method2();
    }
}
