import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        System.out.println("double of "+num + " is "+ (num << 1));
    }
}
