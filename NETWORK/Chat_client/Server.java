import java.net.*;
import java.io.*;
class  Server{
    public static void main(String[] args) {
        try{
            ServerSocket ss=new ServerSocket(4544);
            System.out.print("server connected at 4544");
            Socket s=ss.accept();
            DataInputStream dis=new DataInputStream(s.getInputStream());
            String str=dis.readUTF();
            System.out.println("ma sunira chu"+str);
            ss.close();
            s.close();
            dis.close();
    }catch(IOException e){
        System.out.println(e.getMessage());
    }
}
}