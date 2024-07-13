public interface InterfaceOneMethod {

    void method();
}
class InterfaceOneMethod_1 implements InterfaceOneMethod
{
    public void method()
    {
        System.out.println("This is implemented method");
    }

    public static void main(String[] args) {
        InterfaceOneMethod_1 obj = new InterfaceOneMethod_1();
        obj.method();
    }
}


