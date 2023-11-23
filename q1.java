import java.util.Scanner;

class q1 {
  public static void main(String [] a) {
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);
//    int _c = (int) c;
    if(((int)'a' <= (int)c && (int)c <= (int)'z')
      ||((int)'A' <= (int)c && (int)c <= (int)'Z'))
      System.out.println(c + " is a alphabet");
    else
      System.out.println(c + " is not alphabet.");
  }
}
