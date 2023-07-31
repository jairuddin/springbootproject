package spring.service;

import org.springframework.beans.factory.annotation.Autowired;

import springmvc.Dao.UserdDao;
import springmvc.controller.Userd;

public class UserService {
@Autowired
	private UserdDao userDao;

	public int createUser(Userd user) {
		return this.userDao.saveUser(user);
	}
}
