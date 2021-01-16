package subpackage;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionTest {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://121.151.52.240:3306/bunjang?useSSL=false&serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true";
    private static final String USER = "sungjae";
    private static final String PASSWORD = "1234";

    @Test
    public void testConnection() throws Exception{
        Class.forName(DRIVER);
        try(Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)){
            System.out.println(connection);
            System.out.println("MySQL 연결 성공");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("MySQL 연결 실패");
        }
    }
}
