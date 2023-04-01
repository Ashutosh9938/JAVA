import java.net.*;
public class Udp_app_SERVER {
    public static void main(String[]args){
    try{
        DatagramSocket dgs=new DatagramSocket(4000);
        byte[] rd=new byte[1034];
        byte[] sd=new byte[1240];
        while(true){
            DatagramPacket dgp=new DatagramPacket(rd, rd.length);
            dgs.receive(dgp);
            String a=new String(dgp.getData());
            System.out.print(a);
            String b="k cha";
            sd=b.getBytes();
            InetAddress cip=dgp.getAddress();
            int port=dgp.getPort();
            DatagramPacket sdgp=new DatagramPacket(sd,sd.length,cip,port);
            dgs.send(sdgp);
            dgs.close(); 
                }

    }   catch(Exception e){
        System.out.print(e.getMessage());
    } 
}
}
