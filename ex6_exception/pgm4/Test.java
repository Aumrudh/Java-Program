import java.lang.*;
import java.util.*;
import java.lang.reflect.*;
class CheckCondition extends Exception
{
	CheckCondition(String s)
	{
		super(s);
	}
}
class A{
	private int num;
	public void v(int a){
		try{
		if(a<0){
			throw new IllegalArgumentException("Number less than 0");
		}
		else
			this.num=a;
		}
		catch(IllegalArgumentException e){
		        System.out.println("Number less than 0");
		}
	}
	public int getNum(){
		return this.num;
	}
}
public class Test{
	public void show(){
		System.out.print("Hi");
	}
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		A Aobj=new A();
		while(true){
			System.out.print("1-Divide by Zero\n2-InputMisMatch\n3-Illegalaccess\n4-NOsuchMethod\n");
			System.out.print("5-IllegalArgumentException\nEnter your choice : ");
			int ch=ip.nextInt();
			if(ch==1){
				System.out.print("Enter two Number : ");
				int a=ip.nextInt();
				int b=ip.nextInt();
				try{
						int c=a/b;
						System.out.println("Anwer : "+c);
				}
				catch(ArithmeticException e){
					System.out.println("Handled divide by zero exception ");
				}
			}
			if(ch==2){
				try{
					System.out.print("Enter a number : ");
					int a=ip.nextInt();
					throw new InputMismatchException();
				}
				catch(Exception e){
					System.out.println("Input Miss match");
				}
				ip.nextLine();
			}
			if (ch==3){
				try{
					Class c=Aobj.getClass();
					Field f=c.getDeclaredField("num");
					System.out.print(f.get(Aobj));
				}
				catch(IllegalAccessException e){
					System.out.println("IllegalAccess to private method");
				}
				catch(NoSuchFieldException e){
					System.out.println("No such field exist");
				}
			}
			if(ch==4){
				try{
					System.out.println("Accesing method not present");
					System.out.print(A.class.getMethod("Abc"));
				}
				catch(NoSuchMethodException e){
					System.out.println("No such method ");
				}
			}
			if(ch==5){
					System.out.print("Enter a Number : ");
                                        int p=ip.nextInt();
                                        Aobj.v(p);
			}
			//else{
				//System.out.print("Wrong choice "); 
				//break;
			//}
		}
	}
}

