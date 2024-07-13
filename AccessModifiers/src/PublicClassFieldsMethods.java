class PublicClass {
    //public fields
    public String pName = "Public";

    //public method
    public void publicMethod() {
        System.out.println("This is " + pName);
    }
}
//Accessing the public methods and fields from other class in the same package
public class PublicClassFieldsMethods {
    public static void main(String[] args) {
        //Creating object of PublicClass_04.
        PublicClass pub = new PublicClass();
        //Accessing public fields
        pub.pName = "Public Method";
        //Accessing public method
        pub.publicMethod();
    }
}