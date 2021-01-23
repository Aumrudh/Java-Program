import java.sql.*;
import java.util.Scanner;
public class EmployeeDB{
/**This program makes connection to a database of Microsoft access, named employee. The table has field’s empno, empname, salary, designation, and department.The records where department is computer & designation is System Analyst is displayed.
@since 2020-04-09
@author aumrudh
*/
  public static void main(String args[])throws Exception{
  	Scanner ip=new Scanner(System.in);
    try{
    	Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");			
		String url = "jdbc:ucanaccess://C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\employee.mdb";
		Connection con=DriverManager.getConnection(url);
    	Statement smt=con.createStatement();
    	while(true){
    		System.out.println("1-Insert\n2-Display\n3-Exit");
    		System.out.print("Enter your choice : ");
    		int ch=ip.nextInt();
			if(ch==1){
		  		System.out.print("Enter employee Id : ");
		  		int id=ip.nextInt();
		  		System.out.print("Enter employee Name : ");
		  		String name=ip.next();
		  		System.out.print("Enter employee Salary : ");
		  		int sal=ip.nextInt();
		  		System.out.print("Enter employee Designation : ");
		  		String des=ip.next();
		  		ip.nextLine();
		  		System.out.print("Enter employee Department : ");
		  		String dep=ip.next();
		  		smt.executeUpdate("INSERT INTO employee VALUES("+id+",'"+name+"',"+sal+",'"+des+"','"+dep+"')");
		  	}
		  	else if(ch==2){
		  		String td="System Analyst";
		  		String tdp="computer";
				ResultSet rs=smt.executeQuery("Select * from employee where Department='"+tdp+"' and  Designation='"+td+"'");
				while(rs.next()){
					System.out.print(rs.getString(1));
					System.out.print(rs.getString(2));
					System.out.print(rs.getString(3));
					System.out.print(rs.getString(4));
					System.out.println(rs.getString(5));
				}
			}
			else if(ch==3){
				break;
			}
			else{
				System.out.println("Wrong Choice");
			}
		}
	}
	catch(Exception e){
		System.out.print(e);
	}
  }
}