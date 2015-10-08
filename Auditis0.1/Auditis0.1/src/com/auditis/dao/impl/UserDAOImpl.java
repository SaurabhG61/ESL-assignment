package com.auditis.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;
import org.springframework.stereotype.Repository;

import com.auditis.dao.UserDAO;
import com.auditis.model.User;

@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO{

	@Override
	public List<User> getAllUsers() {
		//PreparedStatement preparedStatement = 
		return null;
	}

	@Override
	public User getUser(String username) {
		String sql="select * from user where uname=?";
		User userData=	getJdbcTemplate().queryForObject(sql, new ParameterizedRowMapper<User>(){
				@Override
				public User mapRow(ResultSet rs, int arg1)
						throws SQLException {
					User user =new User();
					user.setEmailId(rs.getString("email"));
					user.setUserName(rs.getString("uname"));
					user.setPassword(rs.getString("pwd"));
					return user;
				}
				
			},username);
		
		return userData;
		
	
	}
	
	
	

}
