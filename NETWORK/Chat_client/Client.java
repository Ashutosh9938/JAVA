import java.net.*;
import java.io.*;
public class Client {
    public static void main(String[]args){
        try{
            Socket s=new Socket("localhost",4544);
            System.out.println("MESSAGE");
            DataOutputStream dos=new DataOutputStream(s.getOutputStream());
            dos.writeUTF("k cha");

            dos.flush();
            dos.close();
            s.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
