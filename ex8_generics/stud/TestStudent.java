import java.util.*;
class Student
{
    
    public static void calculate(List<? extends Number> list)
    {
        char grade;		
        double s=0.0;
		double avg;
        for(Number n:list)
        {
            s+=n.doubleValue();
        }
        avg=s/5;
        if(avg>90)
            grade='A';
        else if(avg>70)
            grade='B';
        else if(avg>50)
            grade='C';
        else
            grade='D';
    
        System.out.println("Your Grade is:"+grade);
    }
}
public class TestStudent
{
    public static void main(String args[])
    {
        Scanner ip= new Scanner(System.in);
		System.out.println("Enter 5 marks:");
        List<Integer>li=Arrays.asList(ip.nextInt(),ip.nextInt(),ip.nextInt(),ip.nextInt(),ip.nextInt());
        Student s1=new Student();
		s1.calculate(li);
        
    }
}
