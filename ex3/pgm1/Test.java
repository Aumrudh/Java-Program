import java.util.Scanner;
class Student{
/** The student calss has field rollnumber and name.
 *  It has Getter and setter methods
 *  @author aumrudh
 *  @since 2020-01-02
 */
	private int rollNumber;
	private String name;
	//getter and setter methods for rollNumber
	public int getNumber(){
		return rollNumber;
	}
	public void putNumber(int rollNumber){
		this.rollNumber=rollNumber;
	}
	//getter and setter methods for name
	 public String getName(){
		 return name;
	 }
         public void putName(String name){
                 this.name=name;
         }
}
class Exam extends Student{
/** The exam class is inherited from student . It has Addtional
 *  field as 6 subject marks.
 */
	private int mark[]=new int[6];
	//getter and setter methods for mark
	public int getMark(int i){
        	return mark[i];
	}
	public void putMark(int[] mark){
                 this.mark=mark;
	}
}
class Result extends Exam{
/** The result class has total_marks as field and 
 *  a method for calculating total mark.
 */
	private int totalMark;
	public void calculateTotal(Result obj){
		for(int i=0;i<6;i++){
			totalMark+=obj.getMark(i);
		}
	}
	//getter method for total_marks
	public int getTotalMark(){
		return totalMark;
	}
}
public class Test{
/** The main method is available here .*/
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Number of Students : ");
		int n=ip.nextInt();
		Result obj[]=new Result[n];
		for(int i=0;i<n;i++){
			obj[i]=new Result();
			System.out.print("Enter Roll Number of student : ");
			int rn=ip.nextInt();
			obj[i].putNumber(rn);
			System.out.print("Enter Name of student : ");			
			String na=ip.next();                                      			
			obj[i].putName(na);
		        int m[]=new int[6];
			System.out.print("Enter 6 Subject Marks : ");
			for(int j=0;j<6;j++){
				m[j]=ip.nextInt();
			}
			obj[i].putMark(m);
			obj[i].calculateTotal(obj[i]);
		}
		int tot[]=new int[n];
		System.out.println("RollNumber\tName\tMark\t\tTotalmark");
		for(int i=0;i<n;i++){
			tot[i]=obj[i].getTotalMark();
			System.out.print(+obj[i].getNumber()+"\t\t"+obj[i].getName()+"\t\t");
			for(int j=0;j<6;j++){
				System.out.print(+obj[i].getMark(j)+" ");
			}
			System.out.println("\t"+obj[i].getTotalMark());
		}
	}
}	
