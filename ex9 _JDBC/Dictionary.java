import java.util.Scanner;
import java.sql.*;
public class Dictionary
{
  public static void main(String args[])throws Exception
  {
    try
	{
	  Scanner input=new Scanner(System.in);
	  Class.forName("com.mysql.cj.jdbc.Driver");
	  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Dict","root","Jeyakumar28");
	  Statement smt=conn.createStatement();
	  String sea="jan";
	  for(;;)
	  {
	    System.out.println("1-Admin 2-User");
		int ch=input.nextInt();
		if(ch==1)
		{
		  System.out.println("1-Insert 2-Delete 3-Display 4-New Words");
          int c=input.nextInt();
          if(c==1)
          {
             System.out.println("Enter wordno,word,meaning");
             int wno=input.nextInt();
             String w=input.next();
             String m=input.next();
             smt.executeUpdate("INSERT INTO Dict VALUES('"+wno+"','"+w+"','"+m+"')");
          }
          else if(c==2)
          {
             System.out.println("Enter word to delete");
			 String wo=input.next();
			 smt.executeUpdate("DELETE FROM Dict WHERE word='"+wo+"'");
		  }
		  else if(c==3)
		  {
			  ResultSet rs=smt.executeQuery("SELECT * FROM Dict");
			  while(rs.next())
			  {
				  System.out.println("wordno:"+rs.getInt(1)+"\nWord:"+rs.getString(2)+"\nMeaning:"+rs.getString(3));
			  }
		  }
		  else if(c==4)
		  {
		  	 System.out.print("Enter meaning for word "+sea+" : ");
			 smt.executeUpdate("UPDATE  Dict SET mean='"+input.next()+"' WHERE word='"+sea+"'");
		  }
		}
		else if(ch==2)
		{
			System.out.println("Enter search word:");
			sea=input.next();
			ResultSet rs2=smt.executeQuery("SELECT * FROM Dict WHERE word='"+sea+"'");
			if(rs2.next())
			{
				System.out.println("Meaning:"+rs2.getString(3));
			}
			else{
					System.out.println("Word Does not exist");
					System.out.print("Enter word no : ");
			 int tw=input.nextInt();
             String tm="";
             smt.executeUpdate("INSERT INTO Dict VALUES('"+tw+"','"+sea+"','"+tm+"')");
         }
		}
		else{break;}
	  }
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
  }
}
			
			  