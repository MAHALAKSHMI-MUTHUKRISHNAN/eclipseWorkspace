import java.net.*;
import java.io.*;

public class MyCliengt2Data{
   public static void main(String args[]){
       Socket s= new Socket("localhost",5555);
       PrintWriter pr = new PrintWriter(s.getOutputStream()); 
   }
}