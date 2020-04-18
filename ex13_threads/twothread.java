//import java.io.*;
//import java.util.*;
class first_thread extends Thread{
	public void run(){
		System.out.println("First thread");
	}
}
class second_thread extends Thread{
	second_thread(){
		first_thread t1=new first_thread();
		t1.start();
	}
	public void run(){
		System.out.println("Second thread");
	}
	public static void main(String[] args){
		second_thread t2=new second_thread();
		t2.start();
	}
}

