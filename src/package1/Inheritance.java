package package1;

public class Inheritance {
    public static void main(String[] args) {
        rectangle rec = new rectangle();
        rec.set_values(10,20);
        Triangle tri = new Triangle();
        tri.set_values(10,20);
        System.out.println("Area of rectangle: "+ rec.area());
        System.out.println("Area of triangle: "+ tri.area());
    }
}
