import java.util.Scanner;
import java.lang.Character;
interface Reverse{
/** Interface to implement string reversal. 
@author aumrudh
@since 2020-01-09
*/
	void reversal(String s);
}
class StringReversal implements Reverse{
	//method to reverse the string
	public void reversal(String s){
		String reverse="";
		for(int i=s.length()-1;i>=0;i--){
			reverse=reverse+s.charAt(i);
		}
		System.out.println(reverse);
	}
}
public class Test{
/** This class will get input from string */
	public static void main(String args[]){
		System.out.print("Enter a string : ");
		Scanner ip=new Scanner(System.in);
		String st=ip.next();
		StringReversal sr=new StringReversal();
		sr.reversal(st);
	}
}
