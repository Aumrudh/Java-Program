import java.util.*;
import java.lang.Number.*;

public class TestArith
{
    public static void main(String args[])
        {
                Scanner ip= new Scanner(System.in);
                System.out.print("\nEnter two integer values: ");
                int n1 = ip.nextInt();
                int n2 = ip.nextInt();
				ArrayList<Integer> intlist=new ArrayList<Integer>();
				intlist.add(n1);
				intlist.add(n2);
                getSum(intlist);
                getDiff(intlist);
                getProd(intlist);

				
                System.out.print("\nEnter two float values: ");
                float f1 = ip.nextFloat();
                float f2 = ip.nextFloat();
				ArrayList<Float> floatlist=new ArrayList<Float>();
				floatlist.add(f1);
				floatlist.add(f2);
                getSum(floatlist);
                getDiff(floatlist);
                getProd(floatlist);
		}
				 public static <E> void getSum(ArrayList<?extends Number> elements)
                  {
                      Number sum=0;
	                for(Number i:elements)
	                {
	                      sum=sum.doubleValue()+i.doubleValue();
	                }
                  System.out.println("The addition of two numbers is: "+sum);
                  }
	public static <E> void getProd(ArrayList<?extends Number> elements)
   {
       Number pro=1;
	   for(Number i:elements)
	   {
	     pro=pro.doubleValue()*i.doubleValue();
	   }
        System.out.println("The product between two numbers is: "+pro);
    }
	public static <E> void getDiff(ArrayList<?extends Number> elements)
   {
       double  diff=0.0;
	   for(Number i:elements)
	   {
	     diff=i.doubleValue()-diff;
	   }
         System.out.println("The difference between two numbers is: "+diff);
    }
				
				
    }
