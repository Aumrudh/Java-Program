import java.util.Scanner;
class Employee{
/**
This Program calculate the gross pay and then tax amount is found out.Netpay is found by finding the difference between gpay and tax.
@since 2020-04-07
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
  	private float annualinc;
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

    public float getAnnualinc() {
        return annualinc;
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

    public void setAnnualinc(float annualinc) {
        this.annualinc = annualinc;
    }
    public void calculate(){
    	float tgpay=getBpay()+(getBpay()*getHra())+(getBpay()*getDa())+(getBpay()*getAllo());
    	//System.out.println("Gross Pay : "+tgpay);
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
    	System.out.println("The Income Tax is : "+ttax);
    	float tnpay=tgpay-ttax;
    	setNpay(tnpay);
    	float tai=tnpay*12;
    	setAnnualinc(tai);

    }
    
}
public class EmployeeTest{
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
			Employee obj=new Employee(ti,tn,th,td,ta,tb);
			obj.calculate();
		}
}
  