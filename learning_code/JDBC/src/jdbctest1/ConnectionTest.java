package jdbctest1;

import org.junit.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @ClassName ConnectionTest
 * @Description TODO
 * @Author 15588
 * @Date 2021/3/28 16:37
 * @Version 1.0
 */
public class ConnectionTest {
    @Test
    public void testConnect1() throws SQLException {
        Driver driver = null;
        String url = null;
        Properties info = null;
        Connection connect = driver.connect(url, info);

    }
}
