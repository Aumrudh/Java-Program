import java.lang.*;
class RangeException extends Exception{
	public void display(){
		System.out.println("Marks out of range");
	}
}
public class Test{
	public static void main(String args[]){
		int tot=0;
		double avg=0.0;
		String name=args[0];
		int m[]=new int[6];
		for(int i=1;i<args.length;i++){
			m[i]=Integer.parseInt(args[i]);
		}
		try{
			for(int i=1;i<=5;i++){
				if(m[i]>100||m[i]<0){
					throw new RangeException();
				}
				else{
					tot+=m[i];
				}
			}
				avg=tot/5;
				System.out.println("Total is : "+tot);
				System.out.println("Average is "+avg);
		}
		catch(RangeException e){
			e.display();
		}
	}
}

