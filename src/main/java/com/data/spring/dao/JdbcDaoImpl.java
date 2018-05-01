package com.data.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.data.spring.model.Circle;

@Component
public class JdbcDaoImpl {
	
	@Autowired
	private DataSource dataSource;
	
	public Circle getCircle(int circleId) {
		
		Connection conn = null;
		Circle circle = null;
		
		String sql = "SELECT * FROM circle where id = ?";
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, circleId);
			
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				circle = new Circle(circleId, rs.getString("name"));
			}
			rs.close();
			stmt.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException se) {
			}
		}
		
		return circle;
	}

}
