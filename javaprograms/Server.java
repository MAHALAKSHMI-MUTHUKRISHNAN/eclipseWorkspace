import java.net.*;
import java.io.*;

public class Server{
   public static void main(String args[]){
      try{
           ServerSocket ss= new ServerSocket(9999);
           Socket s = ss.accept();
           System.out.println("Client connected");
          }
      catch(Exception e){
            System.out.println(e);
      }
   }
}