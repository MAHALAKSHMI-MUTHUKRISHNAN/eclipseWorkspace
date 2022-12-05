import java.net.*;
import java.io.*;

public class MyClient2Data
{
        public static void main(String[] args) throws IOException 
        {
                 Socket s =new Socket("localhost",5555);
                 PrintWriter pr=new PrintWriter(s.getOutputStream());
                 pr.println("HAPPY LEARNING by MAHA");
                 pr.flush();
                 s.close();
         }
}