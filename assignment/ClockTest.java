import java.util.Scanner;
class Clock{
/**
This Program gets hours minutes and second as input and is passed into constructor and then checking if inputs are wrong and finally set the time according to inputs as AM or PM.
@since 2020-04-07
@author aumrudh
*/
	private int hour;
	private int min;
	private int sec;
	private String format;
	public Clock(int hour,int min,int sec){
		this.hour=hour;
		this.min=min;
		this.sec=sec;
	}
	public boolean check(){
		if(hour>24){
			System.out.println("Invalid Hour");
			return false;
		}
		else if(min>60){
			System.out.println("Invalid Minutes");
			return false;
		}
		else if(sec>60){
			System.out.println("Invalid Seconds");
			return false;
		}
		else{
			return true;
		}
	}
	public void setTime(){
		if(hour>=12){
			format="PM";
			hour=hour-12;
		}
		else{
			format="AM";
		}
		System.out.println("Time");
		System.out.println(hour+":"+min+":"+sec+" "+format);
	}
}
public class ClockTest{
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Hour : ");
		int th=ip.nextInt();
		System.out.print("Enter Minute : ");
		int tm=ip.nextInt();
		System.out.print("Enter Second : ");
		int ts=ip.nextInt();
		Clock obj=new Clock(th,tm,ts);
		if(obj.check()){
			obj.setTime();
		}
		else{
			System.out.println("Please Change Accordingly As mentioned Above");
		}
	}
}