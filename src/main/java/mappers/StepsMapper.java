package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import models.Step;

public class StepsMapper implements RowMapper<Step>
{

	public Step mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Step step = new Step();
		step.setId(rs.getInt("step_id"));
		step.setSteps(rs.getInt("steps"));
		step.setTime(rs.getString("date"));
		step.setUser_id(rs.getInt("user_id"));
		
		return step;
	}
}