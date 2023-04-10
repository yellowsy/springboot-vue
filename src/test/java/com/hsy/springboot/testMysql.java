package com.hsy.springboot;

import com.hsy.springboot.controller.FileController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
public class testMysql {
    @Autowired
    private DataSource dataSource;
    @Test
    void connectSql() throws SQLException {
        System.out.println(dataSource.getConnection());
        System.out.println(dataSource.getClass());
    }
}
