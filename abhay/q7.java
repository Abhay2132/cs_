// Program to find Number of digits in an integer
package abhay;

import java.util.Scanner;

class q7{
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int num = (new Scanner(System.in)).nextInt();
        int size = 0;
        System.out.print("Size of "+num+" is ");
        while(num>0){
            size += 1;
            num /= 10;
        }
        System.out.println(size);
    }
}