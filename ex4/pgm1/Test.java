import java.util.Scanner;
import java.lang.*;
interface Stack{
	public void push(int item);
	public int pop();
	public void create(int size);
}
class StackTest implements Stack{
/** This class is implementation of Stack interface. 
 * It has push , pop methods and create method.
 */
	private int s[];
	private int top;
	public void create(int size){
		s=new int[size];
		top=0;
	}
	public void push(int item){
		if(top==s.length-1){
			System.out.println("Stack overflow");
			System.out.print("Enter new size : ");
			Scanner ip=new Scanner(System.in);
			int si=ip.nextInt();
			int s1[]=new int[si];
			for(int i=0;i<s.length;i++){
				s1[i]=s[i];
				s=s1;
			}
			s[++top]=item;
		}
		else{
			s[++top]=item;
		}
	}
	public int pop(){
		if(top<0){
			System.out.println("Stack underflow");
			return 0;
		}
		else{
			//top--;
			return s[top--];
		}
	}
}
public class Test{
/** Main method is here*/
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter size of Stack : ");
		int a=input.nextInt();
		StackTest obj=new StackTest();
		obj.create(a);
		while(true){
			System.out.print("1-Push\n2-Pop\nEnter your Choice : ");
			int ch=input.nextInt();
			if(ch==1){
				System.out.print("Enter an element to be pushed : ");
				int p = input.nextInt();
				obj.push(p);
			}
			else if(ch==2){
				int m=obj.pop();
				if(m!=0){
					System.out.println("The top element is : "+m/*obj.pop()*/);
				}
			}
			else{
				System.out.println("Wrong choice");
			}
		}
	}
}
