import java.io.*;
import java.net.*;
import java.util.*;

public class Chat_client {
    public static void main(String[]args){
        try{
            Socket s=new Socket("localhost",3390);
            DataInputStream dis=new DataInputStream(s.getInputStream());
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            Scanner sn=new Scanner(System.in);
            String Clientmsg="",Servermsg="";
            while(!Servermsg.equals("la")){
                System.out.print("reply from server \n");
                Servermsg=sn.nextLine();
                dos.writeUTF(Servermsg);
                Clientmsg=dis.readUTF();
                System.out.print(Clientmsg);
                dos.flush();
            }
            dis.close();
            s.close();
            dos.close();
        }catch(IOException e)
        {
            System.out.print(e.getMessage());
        }
    }
}
