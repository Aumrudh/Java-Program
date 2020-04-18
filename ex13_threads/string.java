import java.lang.*;
class MyThreadA  extends Thread implements Runnable {
	String course []={"Java", "J2EE", "Spring", "Struts"}; 
	public void run(){
 		try{
 			for(int i=0;i<course.length;i++){
 				System.out.println(course[i]);
 				sleep(10);
 			}
 			notify();
     	}
	catch (Exception e) {}
	}
}
class MyThreadB  extends Thread implements Runnable {
	String course []={"Java", "J2EE", "Spring", "Struts"}; 
	public void run(){
 		try{
 			for(int i=0;i<course.length;i++){
 				System.out.println(course[i]);
 				sleep(10);
 			}
 			notify();
     	}
	catch (Exception e) {}
	}
}
class MyThreadC  extends Thread implements Runnable {
	String course []={"Java", "J2EE", "Spring", "Struts"}; 
	public void run(){
 		try{
 			for(int i=0;i<course.length;i++){
 				System.out.println(course[i]);
 				sleep(10); 				
 			}
 			notify();
     	}
	catch (Exception e) {}
	}
}
public class string {
    public static void main(String args[]) {
 			Runnable runnablea = new MyThreadA(); 
 			Runnable runnableb = new MyThreadB();
 			Runnable runnablec = new MyThreadC();  
 			Thread  a = new Thread(runnablea);
 			a.start();
 			Thread b =  new Thread(runnableb);
	 		b.start();
			Thread c = new Thread(runnablec);
	 		c.start();    
     }
}