import java.net.*;
import java.io.*;
import java.util.*;
public class TcpClient {
    public static void main(String[]args){
        try{
            Socket s=new Socket("localhost",4000);

            DataInputStream dis=new DataInputStream(s.getInputStream());
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());

            Scanner sc=new Scanner(System.in);
            String smsg="";String cmsg="";
            while(!smsg.equals("bye")){
                smsg=dis.readUTF();
                System.out.print("  server says:"+smsg);
                cmsg=sc.nextLine();
                System.out.print("reply to server");
                dos.writeUTF(cmsg);
             dos.flush();
            }
             dos.close();
             dis.close();
             sc.close();
             s.close();

        }catch(Exception e){
            System.out.print(e.getMessage());
        }
    }    
}
