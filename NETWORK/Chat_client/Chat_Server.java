import java.io.*;
import java.net.*;
import java.util.Scanner;
public class Chat_Server {
    public static void main(String[]args){
        try{
            ServerSocket ss=new ServerSocket(3390);
            System.out.print("Server connected \n");
            Socket s=ss.accept();
            System.out.println("connected \n");
            Scanner sn=new Scanner(System.in);
            DataInputStream dis=new DataInputStream(s.getInputStream());
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            String Clientmsg="";
            while(!Clientmsg.equals("la")){
                Clientmsg=dis.readUTF();
                System.out.print(Clientmsg);
                System.out.print("reply to client\n");
                //Servermsg=sn.nextLine();
                dos.writeUTF(sn.nextLine());
                dos.flush();
            }
            dis.close();
            s.close();
            ss.close();
            dos.close();


        }catch(IOException e){
            System.out.print(e.getMessage());
        }
    }
}
