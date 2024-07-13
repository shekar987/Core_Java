class Parent_ {
    void method1() {
        System.out.println("This is method 1");
    }

    void method2() {
        //using this() to call method1
        this.method1();
        System.out.println("This is method 2");
    }
}
//SubClass
class Child_ extends Parent_ {
    void method3() {
        //using super() to call parent method
        super.method2();
        System.out.println("This is method 3");
    }
}

public class ThisSuperMethods {
    public static void main(String[] args) {
        Child_ c = new Child_();
        //Calling method3
        c.method3();
    }
}
