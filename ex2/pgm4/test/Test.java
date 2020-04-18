package test;
import password.Password;
import java.util.Scanner;
public class Test{
/** This class test will be used for checking the password got from user.
 *  Check and tell wheather it is a valid or invalid password.
 */
	public static void main(String args[]){
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter a password : ");
		String pass=ip.next(); //getting password as input
		Password obj=new Password();  //Creating object for Password class
		int ans;
		ans=obj.checkPassword(pass);  //passing input string to method
		if(ans==1){//if valid 
			System.out.println("Valid Password");
		}
		else{
			System.out.println("Invalid Password");
		}
	}
}
