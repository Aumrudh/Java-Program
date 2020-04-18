import java.util.Scanner;
class Employee{
/** Base class .  Has name,address,age,gender as attributes.
 * Has constructors and display method
 * @author aumrudh
 * @since 2020-01-02
 */
	private String name;
	private String address;
	private int age;
	private String gender;
	public Employee(String name,String address,int age,String gender){
		this.name=name;
		this.address=address;
		this.age=age;
		this.gender=gender;
	}
	public void display(){
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Address : "+address);
		System.out.println("Gender : "+gender);
	}
}
class FullTimeEmployee extends Employee{
/** Derived class. Has salary and designation as attributes.
 * Has constructor and display method.
 */
	private int salary;
	private String designation;
	public FullTimeEmployee(String name,String address,int age,String gender,int salary,String designation){
		super(name,address,age,gender);
		this.salary=salary;
		this.designation=designation;
	}
	public void display(){
		super.display();
		System.out.println("Salary : "+salary);
		System.out.println("Designation : "+designation);
	}
}
class PartTimeEmployee extends Employee{
/** Derived class . Has Workinghour and rate per hour as fields.
 * Has constructor and calculate and display method
 */
	private int workingHour;
	private int ratePerHour;
	public PartTimeEmployee(String name,String address,int age,String gender,int workingHour,int ratePerHour){
		super(name,address,age,gender);
		this.workingHour=workingHour;
		this.ratePerHour=ratePerHour;
	}
	public void display(){
		super.display();
		System.out.println("WorkingHour : "+workingHour);
		System.out.println("RatePerHour : "+ratePerHour);
	}
	public int calculate(){
		return workingHour*ratePerHour;
	}
}
public class Test{
	public  static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Name : ");
		String n=ip.next();
		System.out.print("Enter address : ");
		String a=ip.next();
		System.out.print("Enter age : ");
		int ag=ip.nextInt();
		System.out.print("Enter Gender : ");
		String g=ip.next();
		System.out.print("Enter Salary : ");
		int s=ip.nextInt();
		System.out.print("Enter Designation : ");
		String d=ip.next();
		FullTimeEmployee Fobj=new FullTimeEmployee(n,a,ag,g,s,d);
		Fobj.display();
		System.out.print("Enter WorkingHour : ");
		int w=ip.nextInt();
		System.out.print("Enter rate : ");
		int r=ip.nextInt();
		PartTimeEmployee Pobj=new PartTimeEmployee(n,a,ag,g,w,r);
		Pobj.display();
		int ans=Pobj.calculate();
		System.out.println("Pay Rs : "+ans);
	}
}
