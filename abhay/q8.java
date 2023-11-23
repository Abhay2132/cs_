package abhay;

import java.util.Scanner;

class q8{
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int num = (new Scanner(System.in)).nextInt();
        int r=0, _num=num;
        while(_num>0){
            r = r*10 + _num%10;
            _num /= 10;
        }
        System.out.println("The given number '"+num+"' is "+(r==num?"":"not") + " Palindrome");
    }
}