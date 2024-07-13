public class CallingDiffConstructors {
   // int age;
    //char gender;
   // String name;
    CallingDiffConstructors(){
        this(10);
        System.out.println("This is Default Constructor");

    }
    CallingDiffConstructors(int age){
        this('M',"Shekar");
      //  this.age=age;
        System.out.println("This is 1 Parameterized Constructor");
        System.out.println("Age:"+age);
    }

    CallingDiffConstructors(char gender, String s){
        //this.gender=gender;
        //this.name=s;
        System.out.println("This is 2 Parameterized Constructor");
        System.out.println("Gender:"+gender);
        System.out.println("Name:"+s);
    }


    public static void main(String[] args) {
        CallingDiffConstructors obj = new CallingDiffConstructors();
       // CallingDiffConstructors obj1 = new CallingDiffConstructors(10);
        //CallingDiffConstructors obj2 = new CallingDiffConstructors('M',"Shekar");
    }

}
