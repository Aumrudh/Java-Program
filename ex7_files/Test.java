import java.util.Scanner;
import java.io.*;
class Employee implements Serializable
{
 int empId;
 String empName;
 int empAge;
 String empDept;
 int empSal;

 Employee(int no,String na,int a,String de,int sal)
 {
  empId=no;
  empName=na;
  empAge=a;
  empDept=de;
  empSal=sal;
 }
}
 
public class Test
{
 public static void main(String args[])
 {
  try
  {
  Scanner in=new Scanner(System.in);
  System.out.println("Enter employee details like id,name,age,dept,salary ");
  int no=in.nextInt();
  String na=in.next();
  int a=in.nextInt();
  String de=in.next();
  int sal=in.nextInt();
  Employee e1=new Employee(no,na,a,de,sal);
  FileOutputStream f=new FileOutputStream("emp.txt");
  ObjectOutputStream out=new ObjectOutputStream(f);
  out.writeObject(e1);
  FileInputStream f1=new FileInputStream("emp.txt");
  ObjectInputStream ini=new ObjectInputStream(f1);
  Employee e=(Employee)ini.readObject();
  System.out.println("EmpId: "+e.empId+"\nEmpName: "+e.empName+"\nEmpAge: "+e.empAge+"\nEmpDept: "+e.empDept+"\nEmpSal: "+e.empSal);
  ini.close();
  f1.close();
  out.close();
  f.close();
  }
  catch(Exception e)
  {
   System.out.println(e);
  }
 }
}
