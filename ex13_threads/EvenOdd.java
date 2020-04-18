import java.util.*;
import java. lang. *;
class ThreadA implements  Runnable{
public ThreadA(){}
  @Override  
  public void run(){
    System.out.println("Thread A running");
  }
}

class ThreadB implements  Runnable {
	int a;
  public ThreadB(int a){
	   this.a=a;
  }
  @Override  
  public void run(){
    	System.out.println("Thread B running");
      for(int j = 0;j<=a;j++){
        if(j%2==0)
          System.out.println(j);
      }
	}
}
class ThreadC implements  Runnable{
	int a;
  public ThreadC(int a) {
	   this.a=a;
  }
  @Override  
  public void run( ) {
     	System.out.println("Thread C running");
      for(int k = 0; k <= a; k++) {
         	if(k%2!=0)
             System.out.println(k);
      }
  }
}

public class EvenOdd {
    public static void main(String args[]) {
    	 System.out.print("Enter n value : ");
    	 Scanner ip=new Scanner(System.in);
    	 int n=ip.nextInt();
    	 Runnable runnablea = new ThreadA();   
    	 Runnable runnableb= new ThreadB(n);    
    	 Runnable runnablec = new ThreadC(n);    
       Thread  a = new Thread(runnablea);
       Thread b =  new Thread(runnableb);
       Thread c = new Thread(runnablec);
       a.start();
       b.start();
       c.start();    
    }
}