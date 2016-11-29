package DAO;

import java.util.List;

import models.HeartRate;

public interface HeartRateDAO {
	public List<HeartRate> getHeartRates(Integer id, String startDate, String endDate);
	public void createHeartRate(String date, Integer user_id, Integer heartRate, Integer restingHeartRate, Integer or_min, Integer FB_min, Integer ca_min, Integer pe_min, Integer or_cal, Integer fb_cal, Integer ca_cal, Integer pe_cal, Integer or_max, Integer fb_max, Integer ca_max, Integer pe_max, Integer hr_id);
}