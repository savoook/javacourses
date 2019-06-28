package repositoryJDBC;

import java.sql.*;

public class StudentsRepository {
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        String url = "jdbc:mysql://localhost/students_control?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC ";
        Connection con = null;
        try {
            con = DriverManager.getConnection(url, "root", "estonia");
            Statement statement = con.createStatement();
            // boolean result = statement.execute("insert into student values('15','Денис', 'Глотов', 'КТ-21','2011-09-01', '1');");
            ResultSet resultSet = statement.executeQuery("select * from student");
            while (resultSet.next()) {
                Student student=new Student();
                student.setId(resultSet.getInt("id"));
                student.setSurname(resultSet.getString("surname"));
                student.setName(resultSet.getString("name"));
                student.setGroup(resultSet.getString("group"));
                //resultSet.getDate("data");
                student.setStatus(resultSet.getBoolean("status"));
                System.out.println(student);
            }
            statement.close();
        }
         finally {
            con.close();
        }
    }
}
