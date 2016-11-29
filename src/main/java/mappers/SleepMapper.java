package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import models.Sleep;

public class SleepMapper implements RowMapper<Sleep>
{

	public Sleep mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Sleep sleep = new Sleep();
		sleep.setDate(rs.getString("Date"));
		sleep.setId(rs.getInt("sleep_id"));
		sleep.setTotal_min(rs.getString("total_min"));
		sleep.setTotal_sleep_records(rs.getString("total_sleep_record"));
		sleep.setTotal_time_in_bed(rs.getString("value_in_min"));
		sleep.setUser_id(rs.getInt("User_id"));
		
		return sleep;
	}
}