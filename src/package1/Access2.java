package package1;
/*
        Access Levels:
    Modifier    Class   package     Subclass    world
    public       Y          Y           Y            Y
    protected    Y          Y           Y            N
    no modifier  Y          Y           N            N
    private      Y          N           N            N
 */
public class Access2 {
    public static void main(String[] args) {
//        Access1 a = new Access1();
//        System.out.println(a.hours+":"+a.minutes);
        Access1 ac1 = new Access1();
        ac1.saypancake();
        System.out.println( Access1.sum(4,9));
    }

}
