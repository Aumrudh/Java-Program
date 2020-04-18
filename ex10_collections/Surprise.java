import java.util.*;
public class Surprise{
	public static void main(String args[]){
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter number of lines of input : ");
		int n=ip.nextInt();
		ArrayList<Integer>[] al = new ArrayList[n]; 
		for(int i=0;i<n;i++){
			al[i] = new ArrayList<Integer>();
		}
		for(int i=0;i<n;i++){
			System.out.print("Enter value : ");
			int no=ip.nextInt();
			for(int j=0;j<no;j++){
					int val=ip.nextInt();
					al[i].add(val);
			}
		}
		for(int i=0;i<n;i++){
	        System.out.print(al[i]);
		}
		System.out.print("Enter list and position");
		int l=ip.nextInt();
		int pos=ip.nextInt();
		int ans=al[l].get(pos);
		System.out.print(ans);
	}
}