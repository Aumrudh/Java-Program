import java.util.Scanner;
import java.io.*;
public class FileScanner
{
  public static void main(String args[])throws Exception
  {
    try
	{
	Scanner ip=new Scanner(new File("in.txt"));
	int b=ip.nextInt();
	float d=ip.nextFloat();
	String s=ip.next();
	float h=b+d;
	System.out.println("The integer read is:"+b);
	System.out.println("The floating point read is:"+d);
	System.out.println("The String read is:"+s);
	System.out.println("Hi! Peter,the sum "+b+" + "+d+" is "+h);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
  }
}