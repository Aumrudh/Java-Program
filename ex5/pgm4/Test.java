import java.util.Scanner;
class APrint{
/** Base class. Has i data member and Getter and Setter methods.
 * @author aumrudh
 * @since 2020-01-23
 */
	private int i;
	public void printNum(){
		System.out.println("i="+i);
	}
	public void putnum(int i){
		this.i=i;
	}
}
class BPrint extends APrint{
/** Derived class. Has j data member and Getter and Setter methods.
*/
	private int j;   
        public void printNum(){
		super.printNum();
                System.out.println("j="+j);
	}
	public void putNum(int j){
		this.j=j;
	}
}
public class Test{
/** Sample Test class.*/
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter i Value : ");
		int a=ip.nextInt();
		System.out.print("Enter j Value : ");
		int b=ip.nextInt();
		BPrint obj=new BPrint();
		obj.putnum(a);
		obj.putNum(b);
		obj.printNum();
	}
}


