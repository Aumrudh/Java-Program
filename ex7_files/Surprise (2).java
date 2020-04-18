import java.io.*;
import java.util.*;
public class Surprise{
        public static void main(String args[]) throws Exception{
        try{
                File f=new File("a.txt");
                FileInputStream fin=new FileInputStream(f);
                InputStreamReader iin=new InputStreamReader(fin);
                BufferedReader bin=new BufferedReader(iin);
                FileOutputStream fout=new FileOutputStream("sur.txt");

                ArrayList<String> line = new ArrayList<String>();
                ArrayList<String> line1 = new ArrayList<String>();
                int count=1;
                String temp;
                while (bin.ready()) {
                line.add(bin.readLine());
                }   
                Collections.sort(line);
                /*for (String li : line){
                writer.write(li);
                writer.newLine();
                }*/
                for(String i : line){
                        byte b[]=i.getBytes();
                        fout.write(b);
                }
                //fout.close();
                //fin.close();
                //bout.close();
                //bin.close();
                }
        catch(Exception e){
           System.out.println(e);
        }
        }       
}
