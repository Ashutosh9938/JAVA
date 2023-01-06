import java.sql.*;
class DbShowRecords{
    public static void main(String[]args){
        String url="jdbc:mysql://localhost:3306/ncit";
        String name="root";
        String pwd="abc";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection(url,name,pwd);
            Statement st=cn.createStatement();
            String query="SELECT*FROM student";
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                System.out.println("roll"+rs.getInt(1)+"name"+rs.getString(2)+"faculty"+rs.getString(3));
            }
            cn.close();            
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }
}