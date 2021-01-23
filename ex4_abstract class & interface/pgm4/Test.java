import java.util.Scanner;
interface SalaryCompute{ 
/** method to compute salary*/	
	public double computeSalary();
}
class HourlyWorker implements SalaryCompute{
/** Hourly worker class will compute salary based on hours worked.
@author aumrudh
@since  2020-01-09
*/
	private double hr;
	public HourlyWorker(double h){ //constructor
		hr=h;
	}
	//getter method for cpsalary
	public double computeSalary(){
		return hr*60;
	}
	//getter method for salary
	public double gethoursalary(){
		return computeSalary();
	}
}
class DailyWorkers implements SalaryCompute{
/** This class will compute on daily wages.*/
		private double da;
		public DailyWorkers(double d){
			da=d;
		}
		//getter methods for computing salary
		public double computeSalary(){
			return da*150;
		}
		public double getdaysalary(){
			return computeSalary();
		}
}
public class Test{
/** Test class to check the emplyee class working.*/
	public static void main(String args[]){
   		Scanner ip=new Scanner(System.in);
   		System.out.print("Enter hour Worked:");
   		double hw=ip.nextDouble();
   		HourlyWorker h=new HourlyWorker(hw);
   		System.out.println("Hour Salary:"+h.gethoursalary());
   		System.out.print("Enter day Worked:");
   		double dw=ip.nextDouble();
   		DailyWorkers d=new DailyWorkers(dw);
   		System.out.println("Day Salary:"+d.getdaysalary());
   }
}

