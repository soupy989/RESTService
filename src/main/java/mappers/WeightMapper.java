package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import models.Weight;

public class WeightMapper implements RowMapper<Weight>
{

	public Weight mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		Weight weight = new Weight();
		weight.setBmi(rs.getString("bmi"));
		weight.setDate(rs.getString("date"));
		weight.setSource(rs.getString("source"));
		weight.setUser_id(rs.getInt("user_id"));
		//weight.setId(rs.getInt("id"));
		
		return weight;
	}
}