package Example02;
import java.util.Scanner;
public class StringReverser {
	 public static void main(String[] args) {
	        

}
	 public String reverser(String string) {
		 

	       // System.out.print("Bir metin girin: ");
	        String s = string;

	        String ters = "";
	        for (int i = s.length() - 1; i >= 0; i--) {
	            ters += s.charAt(i);
	        }

	  

	        return ters;
		 
	 }
}