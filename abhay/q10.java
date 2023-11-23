//Program for Binary to decimal conversion
package abhay;

import java.util.Scanner;

public class q10 {
    
    public static void main(String[] args) {
        System.out.print("Enter a binary number : ");
        String num = (new Scanner(System.in)).next();
        int decimal  =0;
        int pow = 0;
        for(int i=num.length()-1; i>=0; i--){
            decimal += Math.pow(2, pow++) * Integer.parseInt(num.substring(i, i+1));
        }
        System.out.println("decimal representation of '"+num+"' is '"+decimal+"'");
    }
}