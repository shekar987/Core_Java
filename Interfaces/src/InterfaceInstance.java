public interface InterfaceInstance {

    void method();
}
class InterfaceImplements implements InterfaceInstance
{
    public void method()
    {
        System.out.println("This is implemented method");
    }

    public static void main(String[] args) {
        InterfaceInstance obj = new InterfaceImplements();
        obj.method();
    }
}


