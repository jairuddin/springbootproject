package springmvc.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import springmvc.controller.Userd;
@Repository
public class UserdDao {
	@Autowired
	private HibernateTemplate hibernateTemplete;
	public int saveUser(Userd user) {
		int id=(Integer)this.hibernateTemplete.save(user);
		return id;
	}
}
