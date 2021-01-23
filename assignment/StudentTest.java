import java.util.Scanner;
class Student{
   int rno;
   String name;   
   Student(){
	   rno=0;
	   name=" ";
   }   
   Student(int rno,String name){
     this.rno=rno;
	 this.name=name;
   }
   
   public boolean isEqual(Student a,Student b){
      if(a.rno==b.rno && a.name.equals(b.name)){
	    return true;
	  }
	  else{
	    return false;
	  }
   }
}
public class StudentTest{
  public static void main(String args[]){
     Scanner ip=new Scanner(System.in);
	 System.out.print("Enter 1st Student id : ");
	 int id1=ip.nextInt();
	 System.out.print("Enter 1st Student name : ");
	 String n1=ip.next();
	 Student a=new Student(id1,n1);
	 System.out.print("Enter 2nd Student id : ");
	 int id2=ip.nextInt();
	 System.out.print("Enter 2nd Student name : ");
	 String n2=ip.next();	 
	 Student b=new Student(id2,n2);
	 Student check=new Student();
	 if(check.isEqual(a,b)){
	    System.out.print("Both are equal");
     }
	 else{
	   System.out.print("Not equal");
	 }
  }
}