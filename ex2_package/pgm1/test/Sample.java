package test;
import math.Calculation;
import java.util.Scanner;
public class Sample{
/**  The Sample class is used to invoke the method of math package and do the respective
     operation . This is done in package called test.\
     @author aumrudh
     @since  2019-12-19
*/
    public static void main(String args[]){
	Calculation obj=new Calculation();
	Scanner input=new Scanner(System.in);
	System.out.print("Enter value of a : ");
	int a =input.nextInt();
	System.out.print("Enter value of b : ");
        int b =input.nextInt();
	int ans=0;
	ans=obj.add(a,b);
	System.out.println("Sum is "+ans);
	ans=obj.sub(a,b);
        System.out.println("Differance is "+ans);
	ans=obj.mul(a,b);
        System.out.println("Product is "+ans);
	ans=obj.div(a,b);
        System.out.println("Quotient is "+ans);
    }
}

