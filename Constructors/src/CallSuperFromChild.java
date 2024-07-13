class ParentClass{

    ParentClass(){
        System.out.println("this is parent default constructor");
    }
    ParentClass(int rollNo){
        System.out.println("this is parent 1 argument constructor");
    }
    ParentClass(String name, String branch){
        System.out.println("this is parent 2 arguments constructor");
    }




}
class ChildClass extends ParentClass {

    String clg;
    String city;

    //calling Parent class constructor using super() keyword
    ChildClass() {
        super();
        System.out.println("this is child default constructor");
    }
    //calling Parent class argument constructor using super() keyword
    ChildClass(int rollNo) {
        super(rollNo);
        System.out.println("Roll No : " + rollNo);
    }
    //calling Parent class argument constructor using super() keyword
    ChildClass(String name, String branch, String clg, String city) {
        super(name, branch);
        this.clg = clg;
        this.city = city;
        System.out.println("College : " + this.clg + "\nCity : " + this.city);
    }
}

public class CallSuperFromChild {
    public static void main(String... args) {
        //creating objects and passing values
        new ChildClass();
        new ChildClass(317);
        new ChildClass("Shekar", "CSE", "KMIT","Hyderabad");
    }
}