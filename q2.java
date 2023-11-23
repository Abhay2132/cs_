import java.util.Scanner;

class q2 {
  public static void main(String [] a) {
  	String vowels = "aeiou";
    Scanner sc = new Scanner(System.in);
    char c = sc.next().charAt(0);
	
	boolean flag = false;
	for(int i=0; i<5; i++){
		if(c == vowels.charAt(i) ||
		 c == Character.toUpperCase(vowels.charAt(i)))
		{
			flag = true;
			break;
		}
	}
	
	System.out.println(c + " is a " + (flag ? "vowel" : "consonant"));
	
  }
}
