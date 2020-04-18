import java.util.*;
import java.io.*;
class Test implements Serializable{
	int no;
	String s;
	Test(int no,String s){
		this.no=no;
		this.s=s;
	}
	void display(){
		System.out.print("\n"+no+"\t"+s+"\n");
	}
}

public class Surprise{
	public static void main(String args[]){
		ArrayList<Test> l1 = new ArrayList<Test>();
		ArrayList<String> l2 = new ArrayList<String>();
		int count=0;
		Test z;
		try{
			Scanner input=new Scanner(new File("a.txt"));
			while(true){
				String s=input.next();
				l2.add(s);
				int cc=countno(s);
				Test x=new Test(cc,s);
				l1.add(x);
			}
		}
		catch(Exception e){
			//System.out.print(e);
		}
		try{
			FileOutputStream fout=new FileOutputStream("b.txt");
			ObjectOutputStream l=new ObjectOutputStream(fout);
			for(int i=0; i<l1.size(); i++){
				z=l1.get(i);
				l.writeObject(z);
				z.display();
			}
		}
		catch(Exception e){
			//System.out.print(e);
		}
		Collections.sort(l2);
		try{
			FileOutputStream fout=new FileOutputStream("c.txt");
			for(String s:l2){
				byte b[]=s.getBytes();
				fout.write(b);
				String k=" ";
				byte l[]=k.getBytes();
				fout.write(l);
			}
		}
		catch(Exception e){
			//System.out.print(e);
		}
}

	public  static int countno(String x){
		int count=0;
		try{
			Scanner input2=new Scanner( new File("a.txt"));
			while(true){
				String temp=input2.next();
				if(x.equals(temp)){
				count+=1;
			}
		}
	}
	catch(Exception e){
		//System.out.print(e);
	}
	return count;
	}
}