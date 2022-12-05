import java.net.*;
import java.io.*;
public class MyServer2Data
{
        public static void main(String[] args) throws IOException 
        {
                 ServerSocket ss =new ServerSocket(5555);
                 Socket s1=ss.accept();//establish connection
                 System.out.println("CLIENT CONNECTED");

                  InputStreamReader in =new InputStreamReader(s1.getInputStream());
                   BufferedReader bf= new  BufferedReader(in);
                   String str=bf.readLine();
                   System.out.println("client:"+str);
                   ss.close();

         }
}