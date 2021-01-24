package com.vastika.um.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.vastika.um.model.User;
import com.vastika.um.util.UserRowMapper;

public class UserRepositoryImpl implements UserRepository {

	private static final String SAVE_SQL = "insert into user_tbl(user_name, password, email, gender, hobbies, address, mobile_no, nationality, comments, dob)values(?,?,?,?,?,?,?,?,?,?)";
	private static final String LIST_SQL = "select * from user_tbl";
	private static final String DELETE_SQL = "delete from user_tbl where id=?";
	private static final String GET_USER_BY_ID = "select * from user_tbl where id=?";
	private static final String UPDATE_SQL="update user_tbl set user_name=?, password=?, email=?, gender=?, hobbies=?, address=?, mobile_no=?, nationality=?, comments=?, dob=? where id=?";
	
	@Autowired
	private DataSource dataSource;

	@Override
	public void saveUser(User user) {
		getJdbcTemplate(dataSource).update(SAVE_SQL,
				new Object[] { user.getUsername(), user.getPassword(), user.getEmail(), user.getGender(),
						user.getHobbies(), user.getAddress(), user.getMobileNo(), user.getNationality(),
						user.getComments(),user.getDob() });
	}

	@Override
	public List<User> getAllUser() {
		return getJdbcTemplate(dataSource).query(LIST_SQL, new UserRowMapper());
	}

	private JdbcTemplate getJdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Override
	public void deleteUser(int id) {
		getJdbcTemplate(dataSource).update(DELETE_SQL, new Object[] { id });
	}

	@Override
	public User getUserById(int id) {
		List<User> userList = getJdbcTemplate(dataSource).query(GET_USER_BY_ID, new Object[] {id}, new UserRowMapper());
		return userList.get(0);
	}

	@Override
	public void updateUser(User user) {
		getJdbcTemplate(dataSource).update(UPDATE_SQL,
				new Object[] { user.getUsername(), user.getPassword(), user.getEmail(), user.getGender(),
						user.getHobbies(), user.getAddress(), user.getMobileNo(), user.getNationality(),
						user.getComments(), user.getDob(),user.getId()});
		
	}

}
