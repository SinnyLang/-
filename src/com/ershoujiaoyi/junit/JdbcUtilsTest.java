package com.ershoujiaoyi.junit;

import com.ershoujiaoyi.utils.JdbcUtils;
import org.junit.Test;

import java.sql.Connection;

public class JdbcUtilsTest {

    @Test
    public void getConnection() {
        Connection conn = JdbcUtils.getConnection();
        JdbcUtils.closeConnection(conn);
    }
}