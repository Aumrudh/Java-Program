import java.util.Scanner;
import java.io.*;
class Conversion
{
 public static void main(String args[])throws IOException
 {
  Scanner in=new Scanner(System.in);
  System.out.println("Enter characters: ");
  String s=in.next();
  String s1=s.toUpperCase();
  FileOutputStream fout=new FileOutputStream("a1.txt");
  byte b[]=s1.getBytes();
  fout.write(b);
  fout.close();
 }
}