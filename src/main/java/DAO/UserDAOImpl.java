package DAO;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import mappers.UserMapper;
import models.User;

public class UserDAOImpl implements UserDAO{
	
	private JdbcTemplate jdbcTemplateObject;
	
	public UserDAOImpl(DataSource dataSource)
	{
		jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(String name, String device, String token) {
		String SQL = "insert into User (name, device, token) values(?,?,?)";
		
		jdbcTemplateObject.update(SQL, name, device, token);
		return;
	}
	
	@Override
	public User getUser(Integer id) {
		String SQL = "select * from customers where id = ?";
		User user = jdbcTemplateObject.queryForObject(SQL,  new Object[]{id}, new UserMapper());
		return user;
	}

	@Override
	public void delete(Integer id) {
		String SQL = "delete from User where id = ?";
		jdbcTemplateObject.update(SQL, id);
		System.out.println("Deleted Record with ID = " + id );
		return;	
	}

	@Override
	public void update(Integer id, String name, String token) {
		String SQL = "update User set name = ?, token= ? where id= ?";
		jdbcTemplateObject.update(SQL, name, token, id);
		System.out.println("Updated Record with ID = " + id );
		return;	
	}

}
