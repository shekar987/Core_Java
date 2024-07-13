
public class LocalGlobalVariables {
    int gv = 11;
    void localVariable() {
        int lv = 22;
        System.out.println("Local variable lv : " + lv);
    }

    public static void main(String[] args) {
        LocalGlobalVariables lgv= new LocalGlobalVariables();
        System.out.println("Global variable gv : " + lgv.gv);
        lgv.localVariable();
    }
}