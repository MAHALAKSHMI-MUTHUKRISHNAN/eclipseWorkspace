import java.io.*;
 import  java.net.*; 
public class  EchoServer  
{  
 public static void main(String args[]) throws Exception  
 {  
try  
 { 
 while(true)  
 {  
 ServerSocket ss=new ServerSocket(9999);  
 Socket client=ss.accept();  
 BufferedReader r=new BufferedReader(new InputStreamReader(client.getInputStream()));   PrintWriter w=new PrintWriter(client.getOutputStream(),true);  
 w.println("Welcome to the java EchoServer.Type 'bye' to close.");  
 String line;  
do  
 {  
 line=r.readLine();  
if(line!=null)  
 w.println("Echoed: "+line);  
 System.out.println(line);  
 }  
 while(!line.equals("bye"));  
client.close();  
 }  
 }  
 catch(Exception err)  
 {  
 System.err.println(err);  
 }  
 }  
}  
