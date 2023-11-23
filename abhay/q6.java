// Program to find Number of days in a given month of a given year
package abhay;

import java.time.Year;
import java.util.Scanner;

class q6{
    public static void main(String [] args){
        int year= Year.now().getValue();
        boolean isLeap = ((year%4==0) && ((year%400==0) || (year%100 != 0)));
        System.out.print("Month Number : ");
        int month = (new Scanner(System.in)).nextInt();
        boolean isEven = month % 2 == 0;
        System.out.print("Number of days in Month " + month + " of year "+year+" = ");
        if(month == 2) System.out.println(isLeap ? "29" : "28");
        if(month > 7) System.out.println(isEven ? "31":"30"); 
        if(month < 7 && month != 2) System.out.println(isEven ? "30":"31"); 
    }
}