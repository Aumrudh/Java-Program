import java.util.Scanner;
class myGen<T extends Number>
{
    private T radius;
    double vol,sur;
    public double getVolume(T radi)
    {
		this.radius = radi;
        vol = (4/3)*Math.PI*radius.doubleValue()*radius.doubleValue()*radius.doubleValue();
        return vol;
    }
    public double getSurface(T radi)
    {
		this.radius = radius;
        sur = 4*Math.PI*radius.doubleValue()*radius.doubleValue();
        return sur;
    }
}

public class Testsphere
{
    public static void main(String args[])
        {
                Scanner ip= new Scanner(System.in);
				myGen<Integer> integer= new myGen<>();
                System.out.print("\nEnter radius in integer: ");
                int r = ip.nextInt();
                System.out.println("The volume of the sphere is: "+integer.getVolume(r));
                System.out.println("The surface of the sphere is: "+integer.getSurface(r));
                myGen<Number> floating= new  myGen<>();
                System.out.print("\nEnter radius in float: ");
                float f= ip.nextFloat();
                System.out.println("The volume of the sphere is: "+floating.getVolume(f));
                System.out.println("The surface of the sphere is: "+floating.getSurface(f));
        }
}
