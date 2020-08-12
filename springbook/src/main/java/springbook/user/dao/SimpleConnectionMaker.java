package springbook.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SimpleConnectionMaker {

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver"); // 클래스 체크
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/springbook", "root", "1323");
    }
}
