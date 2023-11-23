// Program to find the Quadrants in which coordinates lie
package abhay;

import java.util.Scanner;
public class q5 {

    public static void main(String[] args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X coordinate : ");
        x = sc.nextInt();
        System.out.print("Enter Y coordinate : ");
        y = sc.nextInt();

        System.out.print(String.format("coordinates (%s,%s) lies in ", x,y));
        if(x==0 && y==0) System.out.println("Origin");
        if(x > 0 && y > 0) System.out.println("first quadrant");
        if(x < 0 && y > 0) System.out.println("second quadrant");
        if(x < 0 && y < 0) System.out.println("third quadrant");
        if(x > 0 && y < 0) System.out.println("fourth quadrant");
    }
}