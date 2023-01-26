import java.io.*; 
public class Read_No_Console {
    
    public static void main(String[]args){
        try{
            InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader bf=new BufferedReader(isr);
            System.out.println("number hal");
            int num=Integer.parseInt(bf.readLine());
            System.out.print("taile haleko no ="+num);
        }catch (IOException e){
            System.out.print(e.getMessage());
        }
    }
}
