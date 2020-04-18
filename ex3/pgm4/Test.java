import java.util.Scanner;
class MotorVehicle{
/** This is base class class and has three data members and one method display
 *  @author aumrudh
 *  @since 2020-01-02
 */
	private int modelNumber;
	private String modelName;
	private int modelPrice;
	public MotorVehicle(int modelNumber,String modelName,int modelPrice){
		this.modelNumber=modelNumber;
		this.modelName=modelName;
		this.modelPrice=modelPrice;
	}
	public void display(){
		System.out.println("Model Number : "+modelNumber);
		System.out.println("Model Name : "+modelName);  
		System.out.println("Model Price : "+modelPrice);  
	}
	public int getModelPrice(){
		return modelPrice;
	}
}
class Car extends MotorVehicle{
/** Extends MotorVehicle class .
 * Has Discout rate and method to calculte discount
 */
	private int discountRate;
	public Car(int modelNumber,String modelName,int modelPrice,int discountRate){
		super(modelNumber,modelName,modelPrice);
		this.discountRate=discountRate;
	}
	public void display(){
		super.display();
		System.out.println("Discount Rate : "+discountRate);
	}
	public int discount(){
		int mp=getModelPrice();
		return mp-discountRate;
	}	
}
public class Test{
/** Driver class*/
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter model number : " );
		int n=ip.nextInt();
		System.out.print("Enter model name : " );
        	String na=ip.next();
		System.out.print("Enter model price : " );
	        int p=ip.nextInt();
		System.out.print("Enter discount rate : " );
		int d=ip.nextInt();
		Car obj=new Car(n,na,p,d);
		obj.display();
		int ans=obj.discount();
		System.out.println("Final Price : "+ans);
	}
}
