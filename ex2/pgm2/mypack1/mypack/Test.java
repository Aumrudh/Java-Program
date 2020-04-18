package mypack;
class Student{
/** The mypack package contains student class. It has roll number as field name/
    It also has getter and setter methods for rollnumber
    @author aumrudh
    @since  2019-12-19
*/
	private int rollNumber;
	//Getter method for rollNumber
	public int getNumber(){
	  return rollNumber;
	}
	//Setter method for rollNumber
	public void putNumber(int rollNumber){
	  this.rollNumber=rollNumber;
	}
}
public class Test extends Student{
/** The class test is the extension of calss student. In addition it has mark as array
    and getter and setter methods is there.
*/
	private int mark[]=new int[5];
	//Getter method for marks
	public int getMark(int i){
          return mark[i];
        }
        //Setter method for marks
        public void putMark(int[] mark){
          this.mark=mark;
        }
}


