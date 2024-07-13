public class CallingUsingThis {
    int age;
    String name;
    CallingUsingThis(){
        this(10,"sam");
    }
    CallingUsingThis(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println(age+" "+name);
    }

    public static void main(String[] args) {
        CallingUsingThis obj = new CallingUsingThis();
        CallingUsingThis obj1 = new CallingUsingThis(20,"sara");
    }
}
