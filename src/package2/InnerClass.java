package package2;

import java.util.Scanner;

public class InnerClass {
    public static void main(String[] args) {
            outerClass outer_obj = new outerClass();
            outerClass.innerClass inner_obj = outer_obj.new innerClass();
        System.out.println(outer_obj.x + inner_obj.y);
    }
}
class outerClass{
    public int x;
    public outerClass(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of x: ");
        this.x = input.nextInt();
    }
    class innerClass{
        public int y;
        public innerClass(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter value of y: ");
            this.y = input.nextInt();
        }
    }
}