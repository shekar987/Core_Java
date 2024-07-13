interface TwoInterfaceOneMethod {
    void method1();
}
 interface TwoInterfaceOneMethod_02
{
    void method2();
}

class ImplementedMethod implements TwoInterfaceOneMethod, TwoInterfaceOneMethod_02
{   @Override
    public void method1()
    {
        System.out.println("This is implemented method1");
    }
    @Override
    public void method2()
    {
        System.out.println("This is implemented method2");
    }

    public static void main(String[] args) {
        ImplementedMethod obj = new ImplementedMethod();
        obj.method1();
        obj.method2();
    }
}

