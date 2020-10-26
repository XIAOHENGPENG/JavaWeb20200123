package com.at.test;

import com.at.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

public class JdbcUtilsTest {
    @Test
    public void testJdbcUtils(){
        Connection connection = JdbcUtils.getConnection();
        //maxActive=10 设置最大连接数为10
        //System.out.println(connection);
        for (int i=0; i<100; i++) {
            System.out.println(connection);
        }
        JdbcUtils.close(connection);
    }

}
