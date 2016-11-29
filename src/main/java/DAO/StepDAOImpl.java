package DAO;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import mappers.StepsMapper;
import models.Step;

public class StepDAOImpl implements StepDAO{

	private JdbcTemplate jdbcTemplateObject;
	
	public StepDAOImpl(DataSource dataSource)
	{
		jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Step> getSteps(Integer id, String startDate, String endDate) {
		String SQL = "select * from steps where user_id=? and date between ? and ?";
		List<Step> steps = jdbcTemplateObject.query(SQL, new Object[]{id, startDate, endDate}, new StepsMapper());
		return steps;
	}

	@Override
	public void createSteps(Integer stepId, String date, Integer steps, Integer user_id) {
		String SQL = "insert into steps (step_id, date, steps, user_id) values(?,?,?,?)";
		jdbcTemplateObject.update(SQL, stepId, date, steps, user_id);
		return;
	}
	
}
	