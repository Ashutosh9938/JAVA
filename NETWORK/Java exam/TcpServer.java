import java.net.*;
import java.io.*;
import java.util.*;
class TcpServer{
    public static void main(String[]args){
        try{
            ServerSocket ss=new ServerSocket(4000);
            System.out.println("Server running");

            Socket s=ss.accept();
            System.out.println("connected");

            DataInputStream dis=new DataInputStream(s.getInputStream());

            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            String cmsg=""; String smsg="";
            while(!cmsg.equals("bye")){
            Scanner sc=new Scanner(System.in);
             cmsg=dis.readUTF();
            System.out.println("client says" +cmsg);
            
            System.out.println("reply to client");
            smsg=sc.nextLine();
            dos.writeUTF(smsg);
            dos.flush();
            sc.close();
            }
            dis.close();
            dos.close();
            s.close();
            ss.close();
            

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}