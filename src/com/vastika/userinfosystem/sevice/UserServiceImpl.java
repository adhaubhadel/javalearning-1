package com.vastika.userinfosystem.sevice;

import java.util.List;



import com.vastika.userinfosystem.dao.UserDao;
import com.vastika.userinfosystem.dao.UserDaoImpl;
import com.vastika.userinfosystem.model.User;

public class UserServiceImpl implements UserService{
	UserDao userDao= new UserDaoImpl();

	@Override
	public void saveUser(User user) {
		userDao.saveUser(user);
		
		
	}

	@Override
	public void updateUser(User user) {
		
	userDao.updateUser(user);
		
		
	}

	@Override
	public void deleteUser(int id) {
		
		userDao.deleteUser(id);
		
	}

	@Override
	public User getUserInfoById(int id) {
		
		return userDao.getUserInfoById(id);
	}

	@Override
	public List<User> getAllUserInfo() {
		
		return userDao.getAllUserInfo();
	}

}
