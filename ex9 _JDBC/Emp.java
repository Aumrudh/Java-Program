import java.util.Scanner;
import java.sql.*;
import static java.lang.System.*;

public class Emp
{
  public static void main(String args[])throws Exception
  {
    try
	{
	  Scanner input=new Scanner(System.in);
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Jeyakumar28");
	  Statement smt=conn.createStatement();
	  for(;;)
	  {
	    System.out.println("Enter your choice:");
		System.out.println("1-Insert 2-Delete 3-Modify 4-Display1 5-Display2 6-Exit");
		int ch=input.nextInt();
		if(ch==1)
		{
		  System.out.println("Enter employee details");
		  String name,city,desig,sql0;
		  int pno,id;
		  System.out.print("Enter employee name");
		  name=input.next();
		  System.out.print("Enter employee id");
		  id=input.nextInt();
		  System.out.print("Enter employee Phoneno");
		  pno=input.nextInt();
		  System.out.print("Enter employee city");
		  city=input.next();
		  System.out.print("Enter employee department");
		  desig=input.next();
		  sql0="INSERT INTO employee VALUES('"+id+"','"+name+"','"+city+"','"+pno+"','"+desig+"')";
		  smt.executeUpdate(sql0);
		}
		else if(ch==2)
		{
		  System.out.println("Enter employee ID to delete");
		  int idno=input.nextInt();
		  String sql1="DELETE FROM Employee WHERE id='"+idno+"'";
		  smt.executeUpdate(sql1);
		}
		else if(ch==3)
		{
		  System.out.println("Choice"+"\n 1-Name 2-Phoneno");
		  int choice=input.nextInt();
		  if(choice==1)
		  {
		    System.out.println("Enter employee id,name to modify");
			int id_no=input.nextInt();
			String nam=input.next();
			String sql2="UPDATE Employee SET Name='"+nam+"' WHERE id='"+id_no+"'";
			smt.executeUpdate(sql2);
		  }
		  if(choice==2)
		  {
		    System.out.println("Enter employee id,name to modify");
			int ide=input.nextInt();
			int pno=input.nextInt();
			String sql3="UPDATE Employee SET Phoneno='"+pno+"' WHERE id='"+ide+"'";
			smt.executeUpdate(sql3);
		  }
		}
		else if(ch==4)
		{
		  System.out.println("Enter employee ID to display");
		  int idnoo=input.nextInt();
		  String sql4="SELECT * FROM Employee WHERE id='"+idnoo+"'";
		  ResultSet rs=smt.executeQuery(sql4);
		  while(rs.next())
		  {
		    System.out.println("ID:"+rs.getInt("id")+"\nName:"+rs.getString("name")+"\nPhoneno:"+rs.getInt("pno"));
		  }
		}
		else if(ch==5)
		{
		  String sql5="SELECT * FROM Employee";
		  ResultSet rs1=smt.executeQuery(sql5);
		   while(rs1.next())
		  {
		    System.out.println("ID:"+rs1.getInt("id")+"\n Name:"+rs1.getString("name")+"\n Phoneno:"+rs1.getInt("pno"));
		  }
		}
		else{ break;}
       }
    }
		catch(Exception e)
		{
		  System.out.println(e);
		}
   }
}

		  
		  
		  
		
		
			
		  
		  
		  