public interface TwoInterfaceSameMethod {

    void method();
}
interface TwoInterfaceSameMethod_02
{
    void method();
}

class ImplementedMethod1 implements TwoInterfaceSameMethod, TwoInterfaceSameMethod_02
{   @Override
public void method()
{
    System.out.println("This is implementation of same method");
}

    public static void main(String[] args) {
        ImplementedMethod1 obj = new ImplementedMethod1();
        obj.method();
    }
}
