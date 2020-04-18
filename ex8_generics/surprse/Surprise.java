import java.util.*;
public class Surprise{
	public static <E extends Comparable<E>> void sortArray(E[] element){
		for(int i=0;i<element.length;i++){
			for(int j=0;j<i;j++){
				if(element[i].compareTo(element[j])<0){
					E temp=element[i];
					element[i]=element[j];
					element[j]=temp;
				}
			}
		}
		for(E elements : element){
			System.out.println(elements);
		}
	}
	public static void main(String args[]){
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n=ip.nextInt();
		System.out.print("1-Integer\n2-Float\n3-Character\nEnter Choice :");
		int ch=ip.nextInt();
		if(ch==1){
			Integer[] iA=new Integer[n];
			System.out.print("Enter the numbers : ");
			for(int i=0;i<n;i++){
				iA[i]=ip.nextInt();
			}
  			sortArray(iA);
		}
		
		Character[] cA=new Character[n];
		Float[] fA=new Float[n];
		if(ch==2){
			System.out.print("Enter the numbers : ");
			for(int i=0;i<n;i++){
				fA[i]=ip.nextFloat();
			}
  			sortArray(fA);
		}
		if(ch==3){
			System.out.print("Enter the characters : ");
			for(int i=0;i<n;i++){
				cA[i]=ip.next().charAt(0);
			}
  			sortArray(cA);
		}

	}
}