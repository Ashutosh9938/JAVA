import java.io.*;
public class FileRead_Write {
    public static void main(String[]args){
        try{
            FileOutputStream dos=new FileOutputStream("student.txt");
            String str="this is student file object";
            byte[] b=str.getBytes();
            dos.write(b);
            System.out.println("file writen");
            dos.close();

            FileInputStream fis=new FileInputStream("student.txt");
            int c;
            while((c=fis.read())!=-1){
                System.out.println((char)c);
            }
            fis.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }   
}
