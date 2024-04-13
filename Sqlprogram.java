import java.sql.*;
import java.sql.DriverManager;

public class Sqlprogram {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/Student_table";
        String name="root";
        String pwd="Vaishnav@2003";
        try {
            Driver d=new Driver();
            DriverManager.registerDriver(d);
            Connection c=DriverManager.getConnection(url, name, pwd);
            Statement s=c.createStatement();
            ResultSet rs=s.executeQuery("Select * from Student");
            while (rs.next())
            {
                int id=rs.getint("Stu_id");
                String name=getString("Stud_name");
            }
        }
    }
}
