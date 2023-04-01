import java.net.*;
import java.io.*;
public class MultiThead_server {
    public static void main(String[]args){
        try{
            ServerSocket ss=new ServerSocket(4000);
            System.out.print("server connected at port 4000");
            while(true){
            Socket s=ss.accept();
            ClientHandeler ch=new ClientHandeler();
            ch.start();
        }
    }
    catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
    class ClientHandeler extends Thread{
       private Socket s;
        void ClientHandeler(Socket s){
            this.s=s;
        }
        public void run(){
            try{
            System.out.print("client connected");
            DataInputStream dis=new DataInputStream(this.s.getInputStream());
            DataOutputStream dos=new DataOutputStream(this.s.getOutputStream());
            while(true){
                String text=dis.readUTF();
                dos.writeUTF(text);
            }
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        }
    }


