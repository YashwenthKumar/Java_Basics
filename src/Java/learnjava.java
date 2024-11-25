package Java;

import java.util.Scanner;
public class learnjava {
    public static int Addition(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int x = input.nextInt();
        System.out.print("Enter second number: ");
        int y = input.nextInt();
        System.out.print("Sum: ");
        return x+y;
    }
}
