package com.backend.DAO;


import com.backend.model.User;


public interface UserDAO {

	
public boolean createUser(User user);
public boolean updateUser(User user);
public boolean deleteUser(int id);
public boolean getUser(int id);


}
