import java.util.*;
public class TestArray{
        public static void main(String args[]){
                ArrayList<String> cl=new ArrayList<String>();
                Scanner ip=new Scanner(System.in);
                while(true){
                        System.out.print("\n1-Add color\n2- Iterate\n3-Retrieve an element at given position\n4-Copy to another\n5-Join two ArrayList\nEnter your Choice : ");
                        int ch=ip.nextInt();
                        if(ch==1){
                                System.out.print("\nEnter color name : ");
                                String stem=ip.next();
                                cl.add(stem);
                        }
                        else if(ch==2){
                                Iterator<String> i=cl.iterator();
                                System.out.println("Printing Names\n");
                                while(i.hasNext()){
                                        System.out.println(i.next());
                                }
                        }
                        else if(ch==3){
                                System.out.print("Enter position : ");
                                int ind =ip.nextInt();
                                String st=cl.get(ind);
                                System.out.println(st);
                        }
                        else if(ch==4){
                                ArrayList cl1=new ArrayList();
                                cl1=(ArrayList)cl.clone();
                                System.out.println("First array : "+cl);
                                System.out.println("Copied array : "+cl1);      
                        }
                        else if(ch==5){
                                ArrayList<String> cl2=new ArrayList<String>();
                                cl2.add("White");
                                System.out.println("Array 2 Before join : "+cl2);
                                cl2.addAll(cl);                                
                                System.out.println("Array 1 : "+cl);
                                System.out.println("Joined List : "+cl2);
                        }
                        else{
                        	System.out.println("Wrong Choice");
                                break;
                        }
                }
        }
}