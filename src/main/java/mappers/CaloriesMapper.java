package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import models.Calories;

public class CaloriesMapper implements RowMapper<Calories>
{

	public Calories mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Calories calories = new Calories();
		calories.setActivity(rs.getString("activity"));
		calories.setCalories(rs.getInt("calories"));
		calories.setId(rs.getInt("Id"));
		calories.setTime(rs.getString("time"));
		calories.setUser_id(rs.getInt("user_id"));
		
		return calories;
	}
}