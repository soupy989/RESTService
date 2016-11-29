package DAO;

import java.util.List;

import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import models.HeartRate;
import mappers.HeartRateMapper;

public class HeartRateDAOImpl implements HeartRateDAO{
		private JdbcTemplate jdbcTemplateObject;

		public HeartRateDAOImpl(DataSource dataSource)
		{
			jdbcTemplateObject = new JdbcTemplate(dataSource);
		}
		
		@Override
		public List<HeartRate> getHeartRates(Integer id, String startDate, String endDate) {
			String SQL = "select * from heartrate where user_id = ? and date between ? and ?";
			List<HeartRate> hr = jdbcTemplateObject.query(SQL, new Object[]{id, startDate, endDate}, new HeartRateMapper());
			return hr;
		}

		@Override
		public void createHeartRate(String date, Integer user_id, Integer heartRate, Integer restingHeartRate,
				Integer or_min, Integer FB_min, Integer ca_min, Integer pe_min, Integer or_cal, Integer fb_cal,
				Integer ca_cal, Integer pe_cal, Integer or_max, Integer fb_max, Integer ca_max, Integer pe_max, Integer hr_id) {
			String SQL = "insert into heartrate (date, user_id, hr_value, restin_hr, or_min, fb_min, ca_min, pe_min, or_cal, fb_cal,ca_cal, pe_cal, or_max, fb_max, ca_max, pe_max, heartrate_id)"
					+ " values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			jdbcTemplateObject.update(SQL, date, user_id, heartRate, restingHeartRate, or_min, FB_min, ca_min, pe_min, or_cal, fb_cal,ca_cal, pe_cal, or_max, fb_max, ca_max, pe_max, hr_id);
			return;
		}
}