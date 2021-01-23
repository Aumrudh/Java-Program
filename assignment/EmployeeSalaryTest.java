import java.util.Scanner;
class Employee{
/**This program will  calculate the gross pay (pf)and then total allowance is found out.Object is stored in temparary variable and then returned and displayed.
@since 2020-04-09
@author aumrudh
*/
	private int eno;
  	private String name;
  	private float hra;
  	private float da;
  	private float allo;
  	private float bpay; 
  	private float gpay;   //profitable fund
  	private float totall; //total allowance
  	public Employee(){
  		eno=0;
  		name="";
  		hra=0.0f;
  		da=0.0f;
  		allo=0.0f;
  		bpay=0.0f;
  	}
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

    public float getTotall() {
        return totall;
    }

    public void setGpay(float gpay) {
        this.gpay = gpay;
    }

    public void setTotall(float totall) {
        this.totall = totall;
    }

    public Employee calculate(){
		float tgpay=getBpay()+(getBpay()*getHra())+(getBpay()*getDa())+(getBpay()*getAllo());
		setGpay(tgpay);
    	float tall= tgpay-getBpay();    		
    	setTotall(tall);
    	Employee tobj=new Employee(getEno(),getName(),getHra(),getDa(),getAllo(),getBpay());
    	tobj.setGpay(tgpay);
    	tobj.setTotall(tall);
    	return tobj;
	}
	public void display(){
		System.out.println("---------------------------------------------------------------\n");
		System.out.println("Eid  Name\t BASICPAY    GROSSPAY     Allowance\n");
		System.out.println("---------------------------------------------------------------\n");
		System.out.println(+getEno()+"  "+getName()+"\t"+getBpay()+"\t\t"+getGpay()+"\t\t"+getTotall());
	}
}
public class EmployeeSalaryTest{
	public static void main(String args[]){
		 	Scanner ip=new Scanner(System.in);
		 	System.out.print("Enter n value : ");	
		 	int n=ip.nextInt();
		 	Employee obj[]=new Employee[n];
		 	for(int i=0;i<n;i++){
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
			    obj[i]=new Employee(ti,tn,th,td,ta,tb);
			    Employee to= new Employee();
			    to=obj[i].calculate();
			    to.display();

			}
	}
}