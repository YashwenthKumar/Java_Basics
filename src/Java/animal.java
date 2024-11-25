package Java;

import java.util.Scanner;

public class animal {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter binary number 1: ");
        long binary1 = x.nextLong();
        Scanner y = new Scanner(System.in);
        System.out.print("Enter binary number 2: ");
        long binary2 = y.nextLong();
        int i=0;
        int remainder = 0;
        long[] sum = new long[20];
        while (binary1 != 0 || binary2 != 0){
            sum[i++] = ((binary1 % 10)+(binary2 % 10) + remainder) % 2;
            remainder = (int) ((binary1 % 10) + (binary2 % 10) + remainder) / 2;
            if(remainder != 0){
                sum[i++] = remainder;
            }
            --i;
            binary1 = binary1/10;
            binary2 = binary2/10;
        }
        System.out.print("Sum of binary: ");
        while(i>=0){
            System.out.print(sum[i--]);
        }
    }
}