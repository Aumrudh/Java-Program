import java.util.Scanner;
class Bank{
/** Base class.Has getBalance Method
 * @author aumrudh
 * @version 2020-01-23
 */
	public int getBalance(){
		System.out.println("I am in Base Class.No amount");
		return 0;
	}
}

class BankA extends Bank{
/**Derived Class BankA .Has getBalance Method.
 */
	private int bal;
	public void putBal(int bal){
		this.bal=bal;
	}
	public int getBalance(){
		return bal;
	}
}

class BankB extends Bank{
/**Derived Class BankB .Has getBalance Method.                                                                                                                 */
        private int bal;
        public void putBal(int bal){
                this.bal=bal;
        }
        public int getBalance(){
                return bal;
        }
} 

class BankC extends Bank{
/**Derived Class BankC .Has getBalance Method.   
*/
          private int bal;
          public void putBal(int bal){
                  this.bal=bal;
          }
          public int getBalance(){
                  return bal;
          }    
}
class Test{
/** Test class.*/
	public static void main(String args[]){
		BankA aobj=new BankA();
		aobj.putBal(1000);
		BankB bobj=new BankB();
		bobj.putBal(1500);
		BankC cobj=new BankC();
		cobj.putBal(2000);
		System.out.print("1-BankA\n2-BankB\n3-BankC\nEnter your choice : ");
		Scanner ip=new Scanner(System.in);
		int ch=ip.nextInt();
		if(ch==1){
			System.out.println("Balance in BankA is : "+aobj.getBalance());
		}
		else if(ch==2){
			 System.out.println("Balance in BankB is : "+bobj.getBalance());
                }
		else if(ch==3){
		         System.out.println("Balance in BankC is : "+cobj.getBalance());
		}
		else{
			System.out.println("Wrong Choice");
		}
	}
}
