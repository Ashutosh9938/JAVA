package DATABASE;

import java.sql.*;
import java.util.Scanner;


class MenuDriven {
    static Scanner scan=new Scanner(System.in);

    public void showRecord(Connection cn){
        try{
        Statement s=cn.createStatement();
        ResultSet rs=s.executeQuery("SELECT*from student");
        while(rs.next()){
           System.out.println("NAME"+rs.getString(1)+"ROLL"+rs.getInt(2)+"FACULT"+rs.getString(3)+"MARKS"+rs.getInt(4)); 
        }

    }catch(SQLException e){
        System.out.println(e.getMessage());
    }
}
    public void numberOfRecords(Connection cn){
        try{
            Statement s=cn.createStatement();
            ResultSet rs=s.executeQuery("SELECT COUNT(*)FROM student");
            rs.next();
            int count=rs.getInt(1);
            System.out.println("Number Of Records="+count);

    
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public void displayRecords(Connection cn){ try{

        System.out.println("Enter Your Name");
        String name=scan.nextLine();
        PreparedStatement s=cn.prepareStatement("SELECT COUNT*FROM student WHERE NAME=?");
        s.setString(1, name);
        ResultSet rs=s.executeQuery();
     
        int count=rs.getInt(1);
        System.out.println("Number Of Records of"+name+"="+count);
    }catch(SQLException e){

        System.out.println(e.getMessage());
    }

    }
    public void averageMarks(Connection cn){ try{
        Statement s=cn.createStatement();
        ResultSet rs=s.executeQuery("SELECT AVG(MARKS)FROM student GROUP BY ROLL");
        while(rs.next()){
            System.out.println("Average marks of Students="+rs.getInt(4));

        }

    }catch(SQLException e){
        System.out.println(e.getMessage());
    }

    }
    public void facultyAverageMarks(Connection cn){ try{
        System.out.println("enter your faculty");
        String faculty=scan.nextLine();
        PreparedStatement ps=cn.prepareStatement("SELECT AVG(MARKS)FROM student WHERE FACULTY=?");
        ps.setString(1,faculty);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.println("Average marks of"+faculty+"="+rs.getInt(4));
        }
        
    }catch(SQLException e){
        System.out.println(e.getMessage());
    }

    }

public static void main(String[]args){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","");
        MenuDriven md=new MenuDriven();
        int choice;
        md.showMenu();
        do{
            System.out.print("Enter your choice");
            choice=scan.nextInt();
            switch(choice)
            {
                case 1:md.showRecord(cn);
                break;
                case 2:md.numberOfRecords(cn);
                break;
                case 3:md.displayRecords(cn);
                break;
                case 4:md.averageMarks(cn);
                break;
                case 5:md.facultyAverageMarks(cn);
                break;
                
            }
        }while(choice!=5);
        cn.close();
    }catch(ClassNotFoundException e){
        System.out.println(e.getMessage());
    }catch(SQLException e){
        System.out.print(e.getMessage());
    }
}
    public void showMenu(){
        System.out.println("**menu**");
        System.out.println("1.show Records \n 2.Display Number Of Records \n 3.Display Records Of Given Name \n 4.Average Marks \n 5.Faculty Average Marks");
    }

}
