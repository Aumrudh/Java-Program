import java.util.*;
public class array
{
        public static void main(String args[])
        {
                ArrayList<String> a=new ArrayList<String>();
                Scanner in=new Scanner(System.in);
                while(true)
                {
                        System.out.println("1-Add color 2- Iterate 3- Retrieve an element at given position 4-copy to another 5-join");
                        int ch=in.nextInt();
                        if(ch==1)
                        {
                                System.out.println("Enter color");
                                a.add(in.next());
                        }
                        else if(ch==2)
                        {
                                Iterator i=a.iterator();
                                while(i.hasNext())
                                {
                                        System.out.println(i.next());
                                }
                        }
                        else if(ch==3)
                        {
                                System.out.println("Enter index to retrieve");
                                int ind =in.nextInt();
                                System.out.println(a.get(ind));
                        }
                        else if(ch==4)
                        {
                                ArrayList<String> a1=(ArrayList<String>)a.clone();
                        }
                        else if(ch==5)
                        {
                                ArrayList<String> a2=new ArrayList<String>();
                                a2.add("Red");
                                a2.add("Green");
                                System.out.println("List1"+a+"List2"+a2);
                                a.addAll(a2);
                                System.out.println("Joined List"+a);
                        }
                        else
                        {
                                break;
                        }
                }
        }
}