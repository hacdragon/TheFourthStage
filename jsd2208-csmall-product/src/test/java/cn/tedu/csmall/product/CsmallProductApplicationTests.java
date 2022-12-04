package cn.tedu.csmall.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class CsmallProductApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    DataSource dataSource; // 数据源，导包时使用java.sql包

    @Test
    void getConnection() throws Throwable {
        dataSource.getConnection(); // 获取与数据库的连接对象，会执行连接到数据库的操作
    }

}
