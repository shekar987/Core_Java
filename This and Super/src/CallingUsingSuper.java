class Parent{
    String name="shekar";
    Parent(){
        System.out.println("This is Parent Constructor");
    }
}
class Child extends Parent{
    Child(){
        super(); //Optional
        System.out.println("This is Child Constructor");
    }
    void method() {
        //Printing fields of the parent class using super
        System.out.println("My name is " + super.name);
    }
}
public class CallingUsingSuper {
    public static void main(String[] args) {
        Child c = new Child();
        c.method();
    }
}