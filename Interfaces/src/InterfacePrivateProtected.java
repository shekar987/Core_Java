interface interfacesPP {

    public int num1 = 11;
    static final int num2 = 22;
    final int num3 = 33;
    // int num4 = 44;  // error
    // protected int num5 = 55; - error
}

class InterfacePrivateProtected implements interfacesPP {

    public static void main(String[] args) {
        InterfacePrivateProtected obj = new InterfacePrivateProtected();
        System.out.println(obj.num1 + " "+ obj.num2+ " "+ obj.num3);
    }
}