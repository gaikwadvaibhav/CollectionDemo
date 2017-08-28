import jdk.nashorn.internal.scripts.JD;

import java.sql.*;
import java.util.Scanner;

/**
 * Created by melayer on 23/8/17.
 */
public class JdbcDemo1 {
    Connection con = null;
    Statement stmt = null;
    ResultSet rs=null;
    Scanner sc = new Scanner(System.in);

    public JdbcDemo1() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FirstDemo","root","root");
          stmt= con.createStatement();
    }


  void insert() throws SQLException, ClassNotFoundException {

      PreparedStatement pst=con.prepareStatement("insert into testdemo values(?,?,?)");

      pst.setInt(1,5);
      pst.setString(2,"Pune1");
      pst.setString(3,"City1");

      pst.setInt(1,6);
      pst.setString(2,"Pune2");
      pst.setString(3,"City2");


      int i=pst.executeUpdate();
      if(i>=1){
          System.out.println(i+ "Query Insertion Success");
      }

  }

  void show() throws SQLException, ClassNotFoundException {
//      Class.forName("com.mysql.jdbc.Driver");
//      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FirstDemo","root","root");
             rs=stmt.executeQuery("select * from testdemo");
            while (rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
  }

  void update() throws SQLException {
        int a=stmt.executeUpdate("update testdemo set name='vaibhava' where city='city2'");
//      System.out.println(a);
       if(a>=1){
          System.out.println(" Query Updated Success");
      }else{
           System.out.println("Failed to update");
       }
  }

    void delete() throws SQLException {
        System.out.println("Enter the ID  to delete Record : ");
        int id=sc.nextInt();

        int b =stmt.executeUpdate("delete from testdemo where id="+id);

        if(b>=1){
            System.out.println("Records Are Deleted Successfully");
        }else{
            System.out.println("failed to delete");
        }
    }

    void create_table() throws SQLException {
        int x=stmt.executeUpdate("create table myTab05(id int,name varchar(20),city varchar(20),addr varchar(20))");
//        System.out.println(x);
        if(x<1){
            System.out.println("Table Created Successfully");
        }else{
            System.out.println("Can't create table ");
        }
    }

    void delete_table() throws SQLException {
        System.out.println("Enter the table name  to delete Table : ");
        String tab=sc.next();

        int b =stmt.executeUpdate("drop table "+tab);

        if(b<1){
            System.out.println("Records Are Deleted Successfully");
        }else{
            System.out.println("failed to delete");
        }
    }

   void alter_table() throws SQLException {
        int at= stmt.executeUpdate("alter table testdemo add  varchar(20)");
        if(at>1){
            System.out.println("Table Alter success");
        }else {
            System.out.println("Failed to Alter Table");
        }
   }

//   void truncate_tab() throws SQLException {
//        int tt=stmt.executeUpdate("truncate myTab");
//        if (tt<1){
//            System.out.println("TurncateTab successfully");
//        }else {
//            System.out.println("Failed to trunOP");
//        }
//   }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        JdbcDemo1 jd1= new JdbcDemo1();
        jd1.insert();
        jd1.show();
        jd1.update();
//        jd1.delete();
//        jd1.create_table();
//        jd1.delete_table();
        jd1.alter_table();
//        jd1.truncate_tab();

    }
}
