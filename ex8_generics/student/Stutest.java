import java.util.*;
class Stulist<T>
{
  List<T> li=new LinkedList<>();
    public void addBeg(T a)
   {
    li.add(0,a);
   }
	public void addLaast(T a)
	{
	  li.add(a);
	}
	public void addMid(T a)
	{
	   li.add(li.size()/2,a);
	}
	 public void remove(T a)
	{
	    li.remove(a);
	}
	public void print()
	{
		for(T i:li)
		{
			System.out.println(i);
		}
	}
 }
 public class Stutest
 {
   public static void main(String args[])
   {
   Scanner ip=new Scanner(System.in);
   Stulist<Integer> s=new Stulist<Integer>();
   int ch,a;
   while(true)
   {
     System.out.println("Enter your Choice"); 
     System.out.println("1-Add First  2-Add last 3-Add Middle 4-Remove 5-Print");
	 ch=ip.nextInt();
	 
	  if(ch==1)
	  {System.out.println("Enter a number:");
	          s.addBeg(ip.nextInt());
	  //break;
	}
	 
	  if(ch==2){
		  System.out.println("Enter a number:");
	          s.addLaast(ip.nextInt());
	  //break;
	      }
	  if(ch==3)
	  {System.out.println("Enter a number:");
	         s.addMid(ip.nextInt());
	//  break;
	}
	   if(ch==4){System.out.println("Enter a number:");
	          s.remove(ip.nextInt());
	//   break;
	}
		if(ch==5){System.out.println("List:"); 
		       s.print();
	//	break;
	}
		//else{break;}
	 
	 
	 
	}
	//break;
}	
 }
 