import java.sql.*;

/**
 * Created by melayer on 23/8/17.
 */
public class JdbcDemo {

        JdbcDemo() throws SQLException {

            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/FirstDemo","root","root");

//            Statement stmt= con.createStatement();
//
//            ResultSet rs=stmt.executeQuery("select * from testdemo");
//
//            while (rs.next()) {
//                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//            }

            PreparedStatement pstmt = con.prepareStatement("insert into testdemo values(?,?,?)");


                pstmt.setInt(1,4);
                pstmt.setString(2,"Good");
                pstmt.setString(3,"Morning");





            int i=pstmt.executeUpdate();
            System.out.println(i+"Query Inserted");
            con.close();



        }



    public static void main(String[] args) {

        try {
            JdbcDemo jd= new JdbcDemo();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
