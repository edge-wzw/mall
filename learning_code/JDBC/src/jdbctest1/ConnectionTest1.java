package jdbctest1;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @ClassName ConnectionTest1
 * @Description TODO
 * @Author 15588
 * @Date 2021/4/9 18:35
 * @Version 1.0
 */
public class ConnectionTest1 {
    @Test
    public void testConnect1() throws SQLException {
        Driver driver = null;
        String url = null;
        Properties info = null;
        Connection connect = driver.connect(url, info);
    }
}
