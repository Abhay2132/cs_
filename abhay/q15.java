//Program to Remove vowels from a string
package abhay;
public class q15 {
    public static void main(String[] args) {
        q1.print("Enter a String : ");
        String str = q1.sc.next();
        q1.print("String without VOWEL : "+str.replaceAll("[aeiouAEIOU]", "")+"\n");
    }
}