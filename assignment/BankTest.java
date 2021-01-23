import java.util.Scanner;
class Bank{
/**
This Program is simulation of bank account.Withdrawal, Deposit is done.
@since 2020-04-07
@author aumrudh
*/
	private int aid;
	private String name;
	private float balance;
	public Bank(int aid,String name,float balance){
		this.aid=aid;
		this.name=name;
		this.balance = balance;
	}
	public void deposit(float amount){
		balance = balance + amount;
		System.out.println("Deposit finshed");
	}
	public void withdraw(float amount){
		if(balance-amount>1000){
			balance = balance - amount;
			System.out.println("Withdraw done");
		}
		else{
			System.out.println("Insufficent Balance !");
		}
	}
	public float getBalance()	{
		return balance;
	}
}
public class BankTest{
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Id : ");
		int ti=ip.nextInt();
		System.out.print("Enter name : ");
		String tn=ip.next();
		System.out.print("Enter Initial Amount : ");
		float ta=ip.nextFloat();
		Bank obj=new Bank(ti,tn,ta);
		while(true){
			System.out.print("1-Deposit\n2-Withdraw\n3-Available balance\nEnter Your choice : ");
			int ch=ip.nextInt();
			if(ch==1){
				System.out.print("Enter Deposit Amount : ");
				float td=ip.nextFloat();
				obj.deposit(td);
			}
			if(ch==2){
				System.out.print("Enter Withdraw Amount : ");
				float tw=ip.nextFloat();
				obj.withdraw(tw);
			}
			if(ch==3){
				System.out.println("The balance Amount is : "+obj.getBalance());
			}

		}
	}
}