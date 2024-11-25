import java.util.Scanner;
class student {
     static int count;
    int id;
    int age;
    String name;
    student(){//constructors
        System.out.println("Enter ID of the student: ");
        Scanner input = new Scanner(System.in);
        int id = input.nextInt();
        setId(id);
        System.out.println("Enter age of student: ");
        int age = input.nextInt();
        setAge(age);
        System.out.println("Enter name of the student: ");
        String name = input.next();
        setName(name);
        System.out.println("Name of the Student: "+ getName());
        System.out.println("Age of student: "+ getAge());
        System.out.println("ID of student: "+ getId());
        System.out.println("Default constructor called.");
        System.out.println("---------------");
        count++;
    }
    public static int getCount(){
        return count;
    }
    student(int id,int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;
        count++;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    void display(){
        System.out.println("ID: "+ id);
        System.out.println("Age: "+ age);
        System.out.println("Name: "+ name);
    }
}
public class StudentInfo {

public static void main(String[] args) {
    student s1 = new student();
    student s2 = new student(531,18,"Sudarshan");
    s2.display();
    System.out.println("Count: "+ student.getCount());
    }
}
