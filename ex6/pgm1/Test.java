import java.lang.*;
class CheckArgument extends Exception{
	public void display(){
		System.out.println("Number of Arguments is less than 5");
	}
}
public class Test{
	public static void main(String args[]){
		int ans=1;
		int s=args.length;
		int a[]=new int[5];
		try{
			if(args.length<5){
				throw new CheckArgument();
			}
			else{
				for(int i=0;i<args.length;i++){
					a[i]=Integer.parseInt(args[i]);
					ans*=a[i];
				}
			 }
			System.out.println("Product : "+ans);
		}
		catch(CheckArgument e){
			e.display();
		}
	}
}

