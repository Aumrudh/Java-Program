import java.util.Scanner;
class Customer{
/** Customer class . Has customer id and name.
 *  Has constructor and display method.
 *  @author aumrudh
 *  @since 2020-01-23
 */
	private int cid;
	private String cname;
	public Customer(int cid,String cname){
		this.cid=cid;
		this.cname=cname;
	}
	public void cdisplay(){
		System.out.println("Customer ID : "+cid);
		System.out.println("Customer Name : "+cname);
	}
}
class Account{
/** Account Class. Has accout id and type.
 *  Has constructor and display method.
 */
	private int aid;
	private String atype;
	public Account(int aid,String atype){
		this.aid=aid;
		this.atype=atype;
	}
	public void adisplay(){
		System.out.println("Account Id : "+aid);
		System.out.println("Account Type : "+atype);
	}
}
class RBI{
/** Reserve Bank of India Class. Has Customer and account object.
 * Has Intrest rate and withdrawal limit data members.
 * Has Constructor and Getter methods
 */
	Customer c;
	Account a;
	private double IR=0.4;
	private double wl=50000;
	public RBI(Customer c,Account a){
		this.c=c;
		this.a=a;
	}
	public double getIR(){
		return IR;
	}
	public double getWL(){
		return wl;
	}
}
class SBI extends RBI{
/** Derived class . Has intrst rate and withdrawal limit.
 */
        public SBI(Customer c,Account a){
		super(c,a);
 	 }
	 private double IR=0.5;
         private double wl=55000;
         public double getIR(){ 
		return IR;
	 } 
	 public double getWL(){ 
		return wl;
	 }
}
class ICIC extends RBI{
/** Derived class .Has intrst rate and withdrawal limit.
 */
	private double IR=0.8;
	private double wl=80000;
	public ICIC(Customer c,Account a){
	        super(c,a);
	}
	public double getIR(){                                                                                                                                               return IR;                                                                                                                                             }  
	public double getWL(){                                                                                                                                               return wl;                                                                                                                                             } 
}
public class Test{
/** Sample Test class . user choice of bank is got and details is printed*/
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter customer id : ");
		int c=ip.nextInt();
		System.out.print("Enter customer name : ");
		String cn=ip.next();
		System.out.print("Enter Account id : ");
		int a=ip.nextInt();
		System.out.print("Enter Account type : ");
		String at=ip.next();
		Customer cobj=new Customer(c,cn);
		Account aobj=new Account(a,at);
		System.out.print("1-SBI\n2-ICIC\nEnter your Choice : ");
		int ch=ip.nextInt();
		RBI ref;
		if(ch==1){
			SBI sobj=new SBI(cobj,aobj);
			ref=sobj;
			cobj.cdisplay();
			aobj.adisplay();
			System.out.println("Intrest Rate : "+ref.getIR());
			System.out.println("Withdrawal Limit : "+ref.getWL());
		}
		if(ch==2){
			ICIC iobj=new ICIC(cobj,aobj);
			ref=iobj;
			cobj.cdisplay();
			aobj.adisplay();
			System.out.println("Intrest Rate : "+ref.getIR());
			System.out.println("Withdrawal Limit : "+ref.getWL());
		}
		else{
			System.out.println("Wrong Choice ");
		}
	}
}

