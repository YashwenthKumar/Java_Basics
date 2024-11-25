package package2;

import java.util.Scanner;

public class Static {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        Static p = new Static();
        System.out.println(fun(6,7));
        int result  = fun(a,b);
        p.sum(a,b);
    }
    public static int fun(int a,int b){
        return a+b;
    }
    void sum(int a,int b){
        System.out.println("Sum: "+ a+b);
    }
}
