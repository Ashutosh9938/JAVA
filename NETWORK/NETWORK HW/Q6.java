import java.io.*;
import java.net.*;

class Q6 {
    public static void main(String[]args){
        try{
            URL url=new URL("https://mail.google.com");
            HttpURLConnection urlcn=(HttpURLConnection)url.openConnection();
            //int code=urlcn.getResponseCode();
          //  if(code==HttpURLConnection.HTTP_OK){
                InputStream is=urlcn.getInputStream();
                int i;
                while((i=is.read())!=-1){
                    System.out.print((char)i);
                }
            //}
            //else{
                System.out.print("cannot print");
            //}
        }catch(IOException e){
            System.out.print(e.getMessage());
        }
    }    
}
