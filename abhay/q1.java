package abhay;

import java.util.Scanner;

class q1 {
  public static void print(String s){System.out.print(s);}
  public static Scanner sc = new Scanner(System.in);
  public static void main(String [] a) {
    System.out.print("Enter a character : ");
    char c = sc.next().charAt(0);

    if(((int)'a' <= (int)c && (int)c <= (int)'z')
      ||((int)'A' <= (int)c && (int)c <= (int)'Z'))
      System.out.println(c + " is a alphabet");
    else
      System.out.println(c + " is not alphabet.");
  }
}
