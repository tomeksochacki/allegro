package pl.ts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");     //ładoanie jakiejś klasy do aplikacji, czyli ładujemy  // klasę do aplikacji z pakietu który pobraliśmy zależnościami
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/allegro?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&characterEncoding=utf8", "root", "");
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }


}
