package pack;
import java.util.Scanner;
import india.Team;
public class Test{
/** Here the pack package is used to demonstrate the working of
 *  team class in package india. Here object is created and constructor
 *  is invoked.
 *  @author aumrudh
 *  @since 2019-12-19
 */
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Player Name : ");
		String a=input.next();
		System.out.print("Enter Player Position : "); 
		int r=input.nextInt();
		System.out.print("Enter Player NickName :  ");
		String b=input.next();
		Team obj = new Team(a,r,b);
		obj.display();
	}
}

