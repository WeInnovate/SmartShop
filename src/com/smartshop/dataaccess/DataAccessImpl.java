/**
 * 
 */
package com.smartshop.dataaccess;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.smartshop.pojo.Item;
import com.smartshop.pojo.Login;
import com.smartshop.pojo.User;

public class DataAccessImpl extends HibernateDaoSupport implements IDataAccess {

	public DataAccessImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.smartshop.dataaccess.IDataAccess#insertUser(com.smartshop.pojo.User)
	 */
	@Override
	public User insertUser(User user) {
		// TODO Auto-generated method stub
		String pk = null;
		pk = (String)getHibernateTemplate().save(user);
		if(pk != null){
			getHibernateTemplate().save(new Login(user.getUserName(), user.getPassword()));
			List<User> u = (List<User>) getHibernateTemplate().find("from User u where u.userName=?", pk);
			return u.get(0);
		}else{
			return null;
		}
	}
	
	@Override
	public User getUserByEmailId(String userName) {
		// TODO Auto-generated method stub
		List<User> user = (List<User>) getHibernateTemplate().find("from User u where u.userName=?",userName);
		return user.get(0);
	}
	
	@Override
	public boolean checkLogin(String userName, String password) {
		// TODO Auto-generated method stub
		System.out.println(this.getClass().getSimpleName()+" EmailId: "+userName+" Pass: "+password);
		List<Login> login =getHibernateTemplate().find("from Login l where l.userName=? and l.password=?",userName, password);
		if(login.size() > 0)
			return true;
		return false;
	}

	/* (non-Javadoc)
	 * @see com.smartshop.dataaccess.IDataAccess#insertItem(com.smartshop.pojo.Item)
	 */
	@Override
	public Item insertItem(Item item) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> getItems() {
		// TODO Auto-generated method stub
		return (List<Item>)getHibernateTemplate().find("from Item");
	}

	public void insertDummyItems(){
		long itemId = 100;
		int  qunaity = 5;
		double price = 100.0;
		for(int i = 1; i<=10; i++ ){
			getHibernateTemplate().save(new Item(itemId+i, "Item"+i, "Item"+i+" Desc", qunaity,
					price+i));
		}
	}
}
