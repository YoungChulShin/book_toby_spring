package springbook.user;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
import springbook.user.dao.ConnectionMaker;
import springbook.user.dao.DConnectionMaker;
import springbook.user.dao.UserDao;
import springbook.user.domain.User;

import java.sql.SQLException;

//@SpringBootApplication
public class SpringBookApplication {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        UserDao dao = new UserDao(new DConnectionMaker());

        User user = new User();
        user.setId("go1323");
        user.setName("신영철");
        user.setPassword("1323");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName());
        System.out.println(user.getPassword());

        System.out.println(user2.getId() + " 조회 성공");
    }
}
