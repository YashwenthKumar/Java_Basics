package Java;

import java.util.Scanner;
public class ifandelse {
    public static void main(String[] args) {
        Scanner user_1 = new Scanner(System.in);
        int x = user_1.nextInt();
        Scanner user_2 = new Scanner(System.in);
        int y = user_2.nextInt();
        if(x>=30 && y<30){
            System.out.println("x is greater than or equal to 30 and y is less than 30");
        }else{
            System.out.println("x is less than 30 or y is greater than 30");
        }
    }
}
