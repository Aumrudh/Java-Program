import java.util.Scanner;
class Sphere{
/** The class sphere has radius and coordinates as field names.
 *  It will calculate surface area and volume of sphere.
 *  It has constructor to initialize.
 *  @author aumrudh
 *  @since 2020-01-02
 */
	private double rad;
	private double x,y,z;
	public Sphere(double rad,double x,double y,double z){
		this.rad=rad;
		this.x=x;
		this.y=y;
		this.z=z;
	}
	public double surfaceArea(){
		return 4*3.14*rad*rad;
	}
	public double volume(){
		return 4*0.33*3.14*rad*rad*rad;
	}
	public double getrad(){
               return rad;
       }
}
class HemiSphere extends Sphere{
/** The hemisphere class is extension of class sphere .
 *  Here the surface area , volume and density is calculated.
 *  Additional field name is mass.
 */
	private double mass;
	double ra=getrad();
	public double surfaceArea1(){
		return 2*3.14*ra*ra;
	}
	public double volume1(){
	        return 2*0.33*3.14*ra*ra*ra;
       }
       public double density(double vol){
	       return mass/(vol);
       }
       public HemiSphere(double rad,double x,double y,double z,double mass){
	       super(rad,x,y,z);
	       this.mass=mass;
       }
}
public class Test{
/** This is an test class to check the working of derived class*/
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter the three center coordinates of sphere : ");
		double a=ip.nextDouble();
		double b=ip.nextDouble();
		double c=ip.nextDouble();
		System.out.print("Enter radius of Sphere : ");
		double r=ip.nextFloat();
		System.out.print("Enter mass of Sphere : ");
		double m=ip.nextFloat();
		HemiSphere obj = new HemiSphere(r,a,b,c,m);
		Sphere sobj=new Sphere(r,a,b,c);
		while(true){
		System.out.print("1-Sphere\n2-Hemisphere\nEnter your choice : ");
		int ch=ip.nextInt();
		if(ch==1){
			double sa=sobj.surfaceArea();
                	double v=sobj.volume();
			System.out.println("Surface Area : "+sa);
                        System.out.println("Volume : "+v);
		}
		else if(ch==2){	
			double sa=obj.surfaceArea1();
			double v=obj.volume1();
			double d=obj.density(v);
			System.out.println("Surface Area : "+sa);
			System.out.println("Volume : "+v);
			System.out.println("Density : "+d);
		}
		else{
			System.out.print("Wrong choice\n");
		}
		}
	}
}
