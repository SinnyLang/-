package com.ershoujiaoyi.utils;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtils {
    static DruidDataSource dataSource;
    static {
        Properties properties = new Properties();
        InputStream inStream = JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
        try {
            properties.load(inStream);
            dataSource = (DruidDataSource) DruidDataSourceFactory.createDataSource(properties);
            inStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //连接数据库
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    //释放连接
    public static void closeConnection(Connection connection){
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
