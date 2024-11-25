package package1;
/*
        Access Levels:
    Modifier    Class   package     Subclass    world
    public       Y          Y           Y            Y
    protected    Y          Y           Y            N
    no modifier  Y          Y           N            N
    private      Y          N           N            N
 */

public class Access1 {
//    protected int hours= 3;
//    protected int minutes = 47;
//    protected int getHours(){
//        return hours;
//    }
     static int sum(int a, int b){
        return a+b;
    }
    void saypancake(){
        System.out.println("pancake!");
    }
}
