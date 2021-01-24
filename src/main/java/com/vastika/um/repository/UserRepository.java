package com.vastika.um.repository;

import java.util.List;

import com.vastika.um.model.User;

public interface UserRepository {

	void saveUser(User user);
	
	List<User> getAllUser();
	
	void deleteUser(int id);
	
	User getUserById(int id);
	
	void updateUser(User user);

}
