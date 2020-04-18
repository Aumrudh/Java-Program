import java.util.*;
public class TestLinked{
        public static void main(String args[]){
                LinkedList<Integer> obj=new LinkedList<Integer>();
                Scanner ip=new Scanner(System.in);
                while(true){
                        System.out.print("\n1-Add Last\n2-Print\n3-Iterate in reverse order\n4-Get first and last occurance of Specified element\n5-Shuffle elements\nEnter your Choice : ");
                        int ch=ip.nextInt();
                        if(ch==1){
                                System.out.print("\nEnter a number : ");
                                int stem=ip.nextInt();
                                obj.addLast(stem);
                        }
                         else if(ch==2){
                                System.out.println("List is "+obj);
                        }
                        else if(ch==3){
                                Iterator<Integer> i=obj.descendingIterator();
                                System.out.println("Printing in reverse order\n");
                                while(i.hasNext()){
                                        System.out.println(i.next());
                                }
                        }
                        else if(ch==4){
                                System.out.print("Enter element for which first and last occurance should be found : ");
                                int a=ip.nextInt();
                                System.out.println("Index of first occurance of "+a+" is : "+obj.indexOf(a));
                                System.out.println("Index of Last occurance of "+a+" is : "+obj.lastIndexOf(a));
                        }
                        else if(ch==5){
                                System.out.println("Origianl List : "+obj);
                                Collections.shuffle(obj);                               
                                System.out.println("Shuffled List : "+obj);
                        }
                        else{
                        	System.out.println("Wrong Choice");
                                break;
                        }
                }
        }
}