import java.sql.*;
class DbInsertIon {
    public static void main(String[]args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cu");
            Statement s=cn.createStatement();
            String query="INSERT INTO Student values(6,'xyz','bese')";
            int r=s.executeUpdate(query);
            System.out.println(r);
            cn.close();
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }
    
}
