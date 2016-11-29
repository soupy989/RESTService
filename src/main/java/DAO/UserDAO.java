package DAO;

import models.User;

public interface UserDAO {
	
	public void create(String name, String device, String token);
	
	public User getUser(Integer id);
	
	public void delete(Integer id);
	
	public void update(Integer id, String name, String token);
	
}
