package Java;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        //byte, short,int, or char
        System.out.println("Enter score of the student: ");
        Scanner x = new Scanner(System.in);
        int score = x.nextInt();
        switch(score){
            case 90:
                System.out.println("Very good");
                break;
            case 60:
                System.out.println("Good");
                break;
            case 40:
                System.out.println("Ok");
                break;
            default :
                System.out.println("Not able to calculate grades.");
        }
        int s = 0;
        while(s <= -1){
            System.out.println(s);
            s--;
        }
        System.out.println("------------------");
        int b = 0;
        do{
            System.out.println(b);
            b++;
        }while(b <= -1);
    }
}
