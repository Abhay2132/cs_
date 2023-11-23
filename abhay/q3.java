package abhay;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people : ");
        int numPeople = scanner.nextInt();

        int result = calculateHandshakes(numPeople);
        System.out.println("The maximum number of handshakes is " + result + ".");
    }

    static int calculateHandshakes(int n) {
        return n * (n - 1) / 2;
    }
}
