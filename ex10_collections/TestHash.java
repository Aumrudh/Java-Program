import java.util.*;
public class TestHash{
        public static void main(String args[]){
                HashSet<String> obj=new HashSet<String>();
                obj.add("Rohit");
                Scanner ip=new Scanner(System.in);
                while(true){
                        System.out.print("\n1-Add Last\n2-Print\n3-Convert To array\n4-Compare and retain same element\n5-Remove all elements\nEnter your Choice : ");
                        int ch=ip.nextInt();
                        if(ch==1){
                                System.out.print("\nEnter cricket player name : ");
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
                                Object[] arr=obj.toArray();
                                System.out.println("Printing Array");
                                for(int i=0;i<arr.length;i++){
                                        System.out.println(arr[i]);
                                }
                        }
                        else if(ch==4){
                                HashSet<String> obj1=new HashSet<String>();
                                obj1.add("India");
                                obj1.add("Rohit");
                                obj.retainAll(obj1);
                                System.out.println("Retained same elements :"+obj);
                        }
                        else if(ch==5){
                                System.out.println("Origianl HashSet : "+obj);
                                obj.removeAll(obj);                               
                                System.out.println("Removed All elements");
                        }
                        else{
                        	System.out.println("Wrong Choice");
                                break;
                        }
                }
        }
}