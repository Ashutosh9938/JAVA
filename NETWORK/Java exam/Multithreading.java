import java.net.*;
import java.io.*;
import java.util.*;
public class Multithreading {
    public static void main(String[]args){
        try{
        ServerSocket ss=new ServerSocket(4000);
        System.out.println("sever started");
         while(true){
        Socket s=ss.accept();
        ClientHandler ch=new ClientHandler();
        ss.Start();
        }
    }catch(Exception e){
        System.out.print(e.getMessage());
    }
}
}
class ClientHandler extends Thread{
    private Socket s;
    public ClientHandler(){
        this.s=s;
    }
    public void run(){
        try{
            System.out.println("connected");
            DataInputStream dis=new DataInputStream(this.s.getInputStream());
            DataOutputStream dso=new DataOutputStream(this.s.getOutputStream());
            
        }
    }
    
}
