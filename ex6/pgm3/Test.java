import java.lang.*;
import java.util.Scanner;
class InsufficientFundException extends Exception{
	public void display(){
		System.out.println("Insufficient balance");
	}
}
class CheckingAccount{
	public static void withdraw(int a,int bal){
		try{
			int diff=bal-a;
			if(bal<1000||diff<1000){
				throw new InsufficientFundException();
			}
			else{
				bal=diff;
				System.out.println("Can withdraw\nNew Balance : "+bal);
			}
		}
		catch(InsufficientFundException e){
			e.display();
		}
	}
}
class BankDemo{
	private int balance;
	public BankDemo(int balance){
		this.balance=balance;
	}
	public void WD(int a){
		CheckingAccount.withdraw(a,balance);
	}
	public void deposit(int amnt){
		balance+=amnt;
		System.out.println("Balance : "+balance);
	}
}
public class Test{
	public static void main(String args[]){
		BankDemo obj=new BankDemo(1000);
		while(true){
		System.out.print("1-Deposit\n2-Withdraw\nEnter choice : ");
		Scanner ip=new Scanner(System.in);
		int ch=ip.nextInt();
		if(ch==1){
			System.out.print("Enter deposit amount : ");
			int a=ip.nextInt();
			obj.deposit(a);
		}
		if(ch==2){
			System.out.print("Enter withdrawal amount : ");
			int a=ip.nextInt();
			obj.WD(a);
		}
		else{
			//System.out.println("Wrong Choice");
		}
		}
	}
}
