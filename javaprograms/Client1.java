import java.net.*;
import java.io.*;

public class Client1{
   public static void main(String args[]){
      try{
           Socket s= new Socket("localhost",9999);
          }
      catch(Exception e){
            System.out.println(e);
      }
   }
}