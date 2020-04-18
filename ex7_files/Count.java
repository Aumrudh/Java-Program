import java.io.*;
public class Count{
        public static void main(String args[]) throws Exception{
        try{
                File f=new File("a.txt");
                FileInputStream fin=new FileInputStream(f);
                InputStreamReader iin=new InputStreamReader(fin);
                BufferedReader bin=new BufferedReader(iin);
                int count=0;
                String line;
                String[] word=new String[20];
                while((line=bin.readLine())!=null){
                word=line.split(" ");
                count+=word.length;
                }
                fin.close();
                bin.close();
                System.out.println("Total Number of words is : "+count);
        }
        catch(Exception e){
           System.out.println(e);
        }
}
}