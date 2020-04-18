import java.util.Scanner;
class Product{
/** This class is the Base class. Has no and name and getter and setter methods.
 * @author aumrudh
 * @since 2020-01-02
 */
	private int no;
	private String name;
	public void putNo(int no){
		this.no=no;
	}
	public void putName(String name){
		this.name=name;
	}
	public int getNo(){
		return no;
	}
	public String getName(){
		return name;
	}
}
class Book extends Product{
/** This class is extension of product class and has publisher as field name.
 * Has getter and setter methods.
 */
	private String publisher;
	public void putPublisher(String publisher){
		this.publisher=publisher;
	}
	public String getPublisher(){
		return publisher;
	}
}
class Cd extends Product{
/** This class is extension of product class and has capacity as field name.  
 * Has getter and setter methods
 */
	private int capacity;
	public void putCapacity(int capacity){
		this.capacity=capacity;
	}
	public int getCapacity(){
		return capacity;
	}
}
class Scientific extends Book{
/** Extension of book class. Has Category as extra field name.
 */
	private String category;
	public void putCategory(String category){
		this.category=category;
	}
	public String getCategory(){
		return category;
	}
}
public class Test{
/** Driver class*/
	public static void main(String args[]){
		Cd cobj=new Cd();
		Scientific sobj=new Scientific();
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter product no. : ");
		int pn=ip.nextInt();
		System.out.print("Enter product name : ");
		String n=ip.next();
		System.out.print("Enter capacity of CD : ");
		int cap=ip.nextInt();
		cobj.putNo(pn);
		cobj.putName(n);
		cobj.putCapacity(cap);
		System.out.println("PdtNo\tName\tCapacity");
		System.out.println(+cobj.getNo()+"\t"+cobj.getName()+"\t"+cobj.getCapacity());
		System.out.print("Enter product no. : ");
                pn=ip.nextInt();
                System.out.print("Enter product name : ");
                n=ip.next();
		System.out.print("Enter publisher name : ");
                String pu=ip.next();
                System.out.print("Enter category name : ");
		String cat=ip.next();
		sobj.putNo(pn);
		sobj.putName(n);
		sobj.putPublisher(pu);
		sobj.putCategory(cat);
		System.out.println("Pdtno\tName\tPublisher\tCategory");
		System.out.println(+sobj.getNo()+"\t"+sobj.getName()+"\t"+sobj.getPublisher()+"\t"+sobj.getCategory());
	}
}
