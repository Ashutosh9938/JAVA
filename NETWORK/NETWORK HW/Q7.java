import java.net.*;
class Q7{
    public static void main(String[]args){
        try{
            InetAddress ip=InetAddress.getByName("www.google.com");
            System.out.println(ip);
            InetAddress ip2=InetAddress.getByName("192.168.1.1");
            System.out.println(ip2.getHostName());
            InetAddress ip3=InetAddress.getLocalHost();
            System.out.println(ip3.getHostAddress());
            System.out.println(ip3.getHostName());
            InetAddress ip4=InetAddress.getLoopbackAddress();
            System.out.println(ip4.getHostAddress());
        }catch(Exception e){
            System.out.print(e.getMessage());

        }
    }
}
