import java.io.IOException;
import java.net.*;
 class Q1{
    public static void main(String[]args){
        try{
            URL url=new URL("http://www.pornhub.com/result?search_query=faketaxi");
            System.out.println("protocal"+url.getProtocol());
            System.out.println("HOSTNAME"+url.getHost());
            System.out.println("port"+url.getPort());
            System.out.println("CONTENT"+url.getContent());
            System.out.println("query"+url.getQuery());
            System.out.println("REFERENCE"+url.getRef());
            System.out.println("File"+url.getFile());
        }catch(IOException e){
            System.out.print(e.getMessage());
        }
    }
 }