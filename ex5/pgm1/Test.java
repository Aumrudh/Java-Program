import java.util.Scanner;
class Degree{
/** This is base class . It has a method getDegree.
 * @author aumrudh
 * @since 2020/01/23
 */
	//getter method
	public void getDegree(){
		System.out.println("I got a Degree");
	}
}
class UnderGraduate extends Degree{
/** This is derived class ug. It also has same method GetDegree.
 */
	//getter method
	public void getDegree(){
		System.out.println("I am an UnderGraduate");
	}
}
class PostGraduate extends Degree{
/** This is derived class pg. It also has same method GetDegree.
 */
	//getter method
        public void getDegree(){
                System.out.println("I am an PostGraduate"); 
	}
}
public class Test{
/** THis is sample Test class. Here we invoke getMethods.
*/        
	public static void main(String args[]){
		Degree dobj=new Degree();
		dobj.getDegree();
		UnderGraduate uobj=new UnderGraduate();
		uobj.getDegree();
		PostGraduate pobj=new PostGraduate();
                pobj.getDegree();
	}
}
