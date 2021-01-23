import java.util.Scanner;
interface Queue{
/** Queue interface . Has Methods to insert,delete and create queue
@author aumrudh
@since 2020-9-01
*/
	void insert(int element);
	void create(int size);
	void delete();
	void check();
}
class QueueTest implements Queue{
/** This class has the bussiness logic of the methods of interface*/
	private int quearr[];
  	private int rear;
  	private int front;
	//method to create queue array
  	public void create(int size){
		quearr=new int[size];
		rear=front=0;
   	}
	//method to insert element in queue
	public void insert(int element){
		Scanner ip=new Scanner(System.in);
		int s=quearr.length;
                if(rear==s-1){
			System.out.print("Queue full Enter a new size : ");
	 		int si=ip.nextInt();
	 		int q1[]=new int[si];
	 		for(int i=0;i<s;i++){
	  			q1[i]=quearr[i];
	  		}
	  		quearr=q1;
	  		rear++;
	  		quearr[rear]=element;
	  	}
	  	else{
	   		rear++;
	   		quearr[rear]=element;
	   	}
	}
	//method to delete and elements in queue
	public void delete(){
		 int s=quearr.length;
		 if(front==(s-1) || front>rear){
		 	System.out.print("Empty queue");
		 }
		 else{
			front++;
		  	System.out.println("Dequeued element : "+quearr[front]);
		  }
	}
	public void check(){
		if(front==-1||front>rear){
			System.out.println("No elements");
		}
		else{
			System.out.println("Not empty");
		}
	}
}
public class Test{
/** This is test class to check queue implentation*/
	public static void main(String args[]){
		int ch,p;
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter size : ");
		int siz=ip.nextInt();
		QueueTest q=new QueueTest();
		q.create(siz);
		while(true){
			System.out.print("1-Insert\n2-Delete\n3-Check\nEnter your choice : ");
			ch=ip.nextInt();
			if(ch==1){
				System.out.print("Enter a element to insert : ");
	  			p=ip.nextInt();
	  			q.insert(p);
	  		}
	  		else if(ch==2){
	    			q.delete();
			}
			else if(ch==3){
				q.check();
		  	}
		  	else{
				System.out.println("Invalid choice:");
			}
		}
	}
}
