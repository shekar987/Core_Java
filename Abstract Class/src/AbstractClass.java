
public abstract class AbstractClass {
    abstract void method1();
    void method2(){
        System.out.println("This is non abstract method of parent class");
    }
}
class Child extends AbstractClass
{
    @Override
    void method1()
    {
        System.out.println("This overriden abstract method of parent class");
    }

    void method2(String s)
    {
        System.out.println("This is non abstract method of "+ s);
    }

    public static void main(String[] args) {

        AbstractClass obj = new Child();
        obj.method1();
        obj.method2();
        Child c=new Child();
        c.method1();
        c.method2();
        c.method2("child class");
    }
}
