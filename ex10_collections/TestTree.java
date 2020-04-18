import java.util.*;
public class TestTree{
        public static void main(String args[]){
                TreeSet<String> obj=new TreeSet<String>();
                Scanner ip=new Scanner(System.in);
                while(true){
                        System.out.print("\n1-Add\n2- Iterate\n3-Add all to another TreeSet\n4-Get element greater than or equal to given element\n5-Retrive and remove first element\nEnter your Choice : ");
                        int ch=ip.nextInt();
                        if(ch==1){
                                System.out.print("\nEnter color name : ");
                                String stem=ip.next();
                                obj.add(stem);
                        }
                        else if(ch==2){
                                Iterator<String> i=obj.iterator();
                                System.out.println("Printing Names\n");
                                while(i.hasNext()){
                                        System.out.println(i.next());
                                }
                        }
                        else if(ch==3){
                                TreeSet<String> obj1=new TreeSet<String>();
                                obj1.add("Black");
                                obj1.addAll(obj);
                                System.out.println("\nTreeSet 2 : " +obj1);
                        }
                        else if(ch==4){
                                System.out.print("Enter a color : ");
                                String temp=ip.next();
                                System.out.println(obj.ceiling(temp)+" : is greater than or equal to "+temp);      
                        }
                        else if(ch==5){
                                System.out.println("TreeSet : "+obj);
                                System.out.println("First Element is  : "+obj.pollFirst());
                                System.out.println("Removed First Element\n"+obj);
                        }
                        else{
                        	System.out.println("Wrong Choice");
                                break;
                        }
                }
        }
}