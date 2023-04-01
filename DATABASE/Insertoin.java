package DATABASE;
import java.sql.*;
import java.util.Scanner;
class Insertion {
    static Scanner scan = new Scanner(System.in);
    public static void main(String []args){
        try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc.mysql://localhost:3306/bipin","root",""); 
                PreparedStatement stmt = cn.prepareStatement("INSERT INTO Student VALUES(?,?,?)");
                int count = 0;
                String prompt;
                do{
                    System.out.println("Enter Roll Number: ");
                    int roll = scan.nextInt();
                    System.out.println("Enter Name: ");
                    String name = scan.next();
                    System.out.println("Enter Faculty: ");
                    String faculty = scan.next();
                    System.out.println("Enter Marks: ");
                    int marks = scan.nextInt();
                    stmt.setInt(1,roll);
                    stmt.setString(2,name);
                    stmt.setString(3,faculty);
                    stmt.setInt(4,marks);
                    int r = stmt.executeUpdate();
                    count = count +r;
                    System.out.println("Enter any character to continue or 'exit' to stop process: ");
                    prompt = scan.next();
                }
                while(prompt.toLowerCase().equalsIgnoreCase("exit"));
                System.out.println("Number of records added: "+count);
                cn.close();
            }
            catch(SQLException e){
                System.out.println(e.getMessage());
            }
            catch(ClassNotFoundException e){
                System.out.println(e.getMessage());
            }
        }
}