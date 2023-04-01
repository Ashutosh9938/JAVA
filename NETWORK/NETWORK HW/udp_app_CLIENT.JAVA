import java.net.*;
class Udp_app_CLIENT{
    public static void main(String[]args){
        try{
            DatagramSocket dgs=new DatagramSocket();
            byte[] rd=new byte[1024];
            byte[] sd=new byte[1024];

            String aa="k cah server";
            sd=aa.getBytes();
             InetAddress ip=ip.getLocalHost();
             DatagramPacket rdp=new DatagramPacket(rd,rd.length);
             dgs.receive(rdp);
             DatagramPacket sdp=new DatagramPacket (sd,sd.lenght);
             dsg.send(sdp);
             rd=rdp.getData();
             String bb=new String(rd);
             System.out.print(bb);
             dgs.close();
            }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }
}