import java.util.Scanner;
public class SquareTest{
/**This program will generate and print square of natural numbers until 10.if n exceeds 10 then expection thrown.
This Program 
@since 2020-04-08
@author aumrudh
*/
	public static void main(String args[]){		
		Scanner ip=new Scanner(System.in);
		int count=0;		
		System.out.print("Enter n value :");
		try{
			int n=ip.nextInt();
		    int arr[]=new int[10];
			if(n>10)
			{
			   throw new ArrayIndexOutOfBoundsException();
			}
			else{
			    System.out.println("Square of first 10 natural numbers");
				for(int i=1;i<=n;i++){
					    count++;
						arr[i-1]=count*count;
				}
				for(int i=0;i<n;i++){
					System.out.println(arr[i]);
				}
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}