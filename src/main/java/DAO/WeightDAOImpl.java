package DAO;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import mappers.WeightMapper;
import models.Weight;

public class WeightDAOImpl implements WeightDAO{
	
	private JdbcTemplate jdbcTemplateObject;
	
	public WeightDAOImpl(DataSource dataSource)
	{
		jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	@Override
	public void create(Integer user_id, String weight, String bmi, String source, String date, Integer weightId) {
		String SQL = "insert into Weight (weight_id, user_id, weight, bmi, source, date) values(?,?,?,?,?,?)";
		
		jdbcTemplateObject.update(SQL, weightId, user_id, weight, bmi, source, date);
		return;
	}

	@Override
	public List<Weight> getWeight(Integer id, String startDate, String endDate) {
		String SQL = "select * from Weight where user_id = ? and date between ? and ?";
		List<Weight> weight = jdbcTemplateObject.query(SQL,  new Object[]{id, startDate, endDate}, new WeightMapper());
		return weight;
	}

	@Override
	public void delete(Integer id) {
		String SQL = "delete from Weight where id = ?";
		jdbcTemplateObject.update(SQL, id);
		return;
	}
	
}