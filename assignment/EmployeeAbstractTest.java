import java.util.Scanner;
abstract class Employee{
/**
This Program wil calculate the gross pay and then tax amount is found out.Netpay is found by finding the difference between gpay and tax.Here abstract methods are used.
@since 2020-04-08
@author aumrudh
*/
	private int eno;
  	private String name;
  	private float hra;
  	private float da;
  	private float allo;
  	private float bpay; 
  	private float gpay;  	
  	private float tax;
  	private float npay;
  	public Employee(int eno,String name,float hra,float da,float allo,float bpay){
    	this.eno=eno;
    	this.name=name;
    	this.hra=hra;
    	this.da=da;
    	this.allo=allo;
    	this.bpay=bpay;
    }
    public int getEno() {
        return eno;
    }

    public String getName() {
        return name;
    }

    public float getHra() {
        return hra;
    }

    public float getDa() {
        return da;
    }

    public float getAllo() {
        return allo;
    }

    public float getBpay() {
        return bpay;
    }

    public float getGpay() {
        return gpay;
    }

    public float getTax() {
        return tax;
    }

    public float getNpay() {
        return npay;
    }
    
    public void setGpay(float gpay) {
        this.gpay = gpay;
    }

    public void setTax(float tax) {
        this.tax = tax;
    }

    public void setNpay(float npay) {
        this.npay = npay;
    }
    public abstract void calculate();
 	public abstract void display();

}
class DriveManager extends Employee{
	public DriveManager(int eno,String name,float hra,float da,float allo,float bpay){
		super(eno,name,hra,da,allo,bpay);
	}
	public void calculate(){
		float tgpay=getBpay()+(getBpay()*getHra())+(getBpay()*getDa())+(getBpay()*getAllo());
		setGpay(tgpay);
    	float ttax=0.0f;
    	if(getGpay()<=50000.00f){
    		 ttax=0.0f;
    	}
    	if(getGpay()>50000.00f && getGpay()<=60000.00f){
    		 ttax=0.1f*((getBpay()*getHra())+(getBpay()*getDa())+(getBpay()*getAllo()));
    	}
    	if(getGpay()>60000.00f && getGpay()<= 150000.00f){
    		 ttax=0.2f*((getBpay()*getHra())+(getBpay()*getDa())+(getBpay()*getAllo()));
    	}
    	if(getGpay()>150000.00f){
    		 ttax=0.3f*((getBpay()*getHra())+(getBpay()*getDa())+(getBpay()*getAllo()));
    	}
    	setTax(ttax);
    	float tnpay=tgpay-ttax;
    	setNpay(tnpay);
	}
	public void display(){
		System.out.println("---------------------------------------------------------------\n");
		System.out.println("Eid  Name\t BASICPAY    GROSSPAY     NETPAY\n");
		System.out.println("---------------------------------------------------------------\n");
		System.out.println(+getEno()+"  "+getName()+"\t"+getBpay()+"\t"+getGpay()+"\t"+getNpay());
	}
}
class Clerk extends Employee{
	public Clerk(int eno,String name,float hra,float da,float allo,float bpay){
		super(eno,name,hra,da,allo,bpay);
	}
	public void calculate(){
		float tgpay=getBpay()+(getBpay()*getHra())+(getBpay()*getDa())+(getBpay()*getAllo());
		setGpay(tgpay);
    	float ttax=0.0f;
    	if(getGpay()<=50000.00f){
    		 ttax=0.0f;
    	}
    	if(getGpay()>50000.00f && getGpay()<=60000.00f){
    		 ttax=0.1f*((getBpay()*getHra())+(getBpay()*getDa())+(getBpay()*getAllo()));
    	}
    	if(getGpay()>60000.00f && getGpay()<= 150000.00f){
    		 ttax=0.2f*((getBpay()*getHra())+(getBpay()*getDa())+(getBpay()*getAllo()));
    	}
    	if(getGpay()>150000.00f){
    		 ttax=0.3f*((getBpay()*getHra())+(getBpay()*getDa())+(getBpay()*getAllo()));
    	}
    	setTax(ttax);
    	float tnpay=tgpay-ttax;
    	setNpay(tnpay);
	}
	public void display(){
		System.out.println("---------------------------------------------------------------\n");
		System.out.println("Eid  Name\t BASICPAY    GROSSPAY     NETPAY\n");
		System.out.println("---------------------------------------------------------------\n");
		System.out.println(+getEno()+"  "+getName()+"\t"+getBpay()+"    "+getGpay()+"     "+getNpay());
	}
}
public class EmployeeAbstractTest{
	public static void main(String args[]){
		    Scanner ip=new Scanner(System.in);				
			System.out.print("Enter id : ");
			int ti=ip.nextInt();
			System.out.print("Enter name : ");
			String tn=ip.next();
			System.out.print("Enter hra : ");
			float th=ip.nextFloat();
			System.out.print("Enter da : ");
			float td=ip.nextFloat();
			System.out.print("Enter allowance : ");
			float ta=ip.nextFloat();
			System.out.print("Enter BasicPay : ");
			float tb=ip.nextFloat();
			DriveManager obj=new DriveManager(ti,tn,th,td,ta,tb);
			obj.calculate();
			obj.display();
			System.out.print("\nEnter id : ");
			int tii=ip.nextInt();
			System.out.print("Enter name : ");
			String tni=ip.next();
			System.out.print("Enter hra : ");
			float thi=ip.nextFloat();
			System.out.print("Enter da : ");
			float tdi=ip.nextFloat();
			System.out.print("Enter allowance : ");
			float tai=ip.nextFloat();
			System.out.print("Enter BasicPay : ");
			float tbi=ip.nextFloat();
			Clerk obj1=new Clerk(tii,tni,thi,tdi,tai,tbi);
			obj1.calculate();
			obj1.display();

	}
}