package Java;

import java.util.Scanner;

public class PrintPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of steps in the pattern: ");
        int n = input.nextInt();
        //Diamond Pattern
        for(int i=1;i<=n;i++){
            for(int j=1;j<= n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<= 2*i - 1; j++){
                System.out.print("x");
            }
            System.out.println();
        }
        for (int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<= 2*i -1; j++){
                System.out.print("x");
            }
            System.out.println();
        }
        //Square Hollow
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1|| i==j || i==n-j-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        //
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(i+1+ " ");
            }
            System.out.println();
        }
        //number increasing pyramid
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        //0 1 pattern program
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
        
    }
}
