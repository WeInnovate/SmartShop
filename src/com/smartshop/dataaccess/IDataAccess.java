package com.smartshop.dataaccess;

import java.util.List;

import com.smartshop.pojo.Item;
import com.smartshop.pojo.User;

public interface IDataAccess {
	public User insertUser(User user);
	public Item insertItem(Item item);
	public User getUserByEmailId(String userName);
	public boolean checkLogin(String userName, String password);
	public List<Item> getItems();
}
