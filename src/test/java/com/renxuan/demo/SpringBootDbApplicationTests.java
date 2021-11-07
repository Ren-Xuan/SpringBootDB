package com.renxuan.demo;

import static org.assertj.core.api.Assertions.offset;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SpringBootDbApplicationTests {

//	@Autowired
//	DataSource  dataSource;
//	
//	
//	@Test
//	void contextLoads() throws SQLException {
//		System.out.print(dataSource.getClass());
//		
//		Connection connection=dataSource.getConnection();
//		System.out.println(connection);
//		connection.close();
//	}
	
	@Test
	void contextLoads() throws SQLException {
	
	}

}
