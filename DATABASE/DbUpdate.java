package DATABASE;
import java.sql.*;

class DbUpdate {
    public static void main(String[]args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/cu","root","pwd");
            Statement st=cn.createStatement();
            String query="UPDATE Employee SET salary=5000 WHERE POST='manager'";
            int r=st.executeUpdate(query);
            System.out.println(r);
            cn.close();
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
}
