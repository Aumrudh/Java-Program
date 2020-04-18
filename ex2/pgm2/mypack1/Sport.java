package mypack1;
import mypack.*;
import java.util.Scanner;
public class Sport{
/**  
    This package is used to check the user defined package mypack. Here sport class is defined 
    which has total and sport name. It has getter for sport name and display method.
*/
	private int total;
	public static void main(String args[]){
	  Scanner input=new Scanner(System.in);
	  Test obj=new Test();
	  //Getting roll number as input
	  System.out.print("Enter Roll number : ");
	  int r=input.nextInt();
	  //Getting all 5 marks as input
	  System.out.print("Enter 5 Marks : ");
	  int ma[]=new int[5];
	  for(int i=0;i<5;i++){
	    ma[i]=input.nextInt();
	  }
	  //Putting the rollnumber , mark in object created
	  obj.putNumber(r);
	  obj.putMark(ma);
	  Sport s=new Sport();
	  for(int i=0;i<5;i++){
	   s.total=s.total+obj.getMark(i);
	  }
	  System.out.println("Roll Number : "+obj.getNumber());
	  System.out.println("Marks are : ");
	  for(int i=0;i<5;i++){
 	     System.out.println(obj.getMark(i));	   
	  }
	  s.display();
          }
	  public void display(){
           System.out.println("Total : "+total);
        }

}

