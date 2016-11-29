package DAO;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import models.Sleep;
import mappers.SleepMapper;

public class SleepDAOImpl implements SleepDAO{
	
	private JdbcTemplate jdbcTemplateObject;
	
	public SleepDAOImpl(DataSource dataSource)
	{
		jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Sleep> getSleep(Integer id, String startDate, String endDate) {
		String SQL = "select * from sleep where user_id = ? and date between ? and ?";
		List<Sleep> sleep = jdbcTemplateObject.query(SQL,  new Object[]{id, startDate, endDate}, new SleepMapper());
		return sleep;
	}

	@Override
	public void createSleep(Integer sleepId, String date, Integer totalMin, Integer user_id, Integer totalSleepRecord,
			Integer valueInMin) {
		String SQL = "insert into sleep (sleep_id, user_id, date, total_min, total_sleep_record, value_in_min) values(?,?,?,?,?,?)";
		System.out.println(SQL + " " + sleepId + user_id + date + totalMin + totalSleepRecord + valueInMin);
		jdbcTemplateObject.update(SQL, sleepId, user_id, date, totalMin, totalSleepRecord, valueInMin);
		return;
	}
	
}