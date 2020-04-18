import java.util.*;
class Customer{
	int amount;  
	public Customer(int amount){
		this.amount=amount;
	}
	synchronized void withdraw(int amount){ 
		System.out.println("going to withdraw...");  
		if(this.amount<amount){  
			System.out.println("Less balance; waiting for deposit...");  
			System.out.print("Enter amount to deposit : ");
			try{
				wait();
			}
			catch(Exception e){}
	    }  
		this.amount-=amount;  
		System.out.println("withdraw completed...");  
	}    
	synchronized void deposit(int amount){  
		System.out.println("going to deposit...");  
		this.amount+=amount;  
		System.out.println("deposit completed... ");  
		notify();  
	}  
}  
  
public class Bank{  
	public static void main(String args[]){   
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter initial amount : ");
		int n=ip.nextInt();
		final Customer c=new Customer(n);
		new Thread(){  
			public void run(){
				Scanner ip=new Scanner(System.in);
				System.out.print("Enter amount to withdraw");
				int w=ip.nextInt();
        		c.withdraw(w);
			}  
		}.start();  
		new Thread(){  
			public void run(){
				try{
					wait();
				}
				catch(Exception e){} 
				Scanner ip=new Scanner(System.in);
				int de=ip.nextInt();
     			c.deposit(de);
			}  
		}.start();  
  }
}

 