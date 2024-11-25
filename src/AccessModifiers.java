/*
        Access Levels:
    Modifier    Class   package     Subclass    world
    public       Y          Y           Y            Y
    protected    Y          Y           Y            N
    no modifier  Y          Y           N            N
    private      Y          N           N            N
 */
public class AccessModifiers {
    private String name;
    private int age;

    public void SetName(String name){
        this.name = name;
    }
    public String GetName(){
        return name;
    }
    public void SetAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

}
