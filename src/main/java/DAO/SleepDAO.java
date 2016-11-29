package DAO;

import java.util.List;

import models.Sleep;

public interface SleepDAO {
	public List<Sleep> getSleep(Integer id, String startDate, String endDate);
	public void createSleep(Integer sleepId, String date, Integer totalMin, Integer user_id, Integer totalSleepRecord, Integer valueInMin);
}