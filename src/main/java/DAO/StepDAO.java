package DAO;

import java.util.List;

import models.Step;

public interface StepDAO {
	public List<Step> getSteps(Integer id, String startDate, String endDate);
	public void createSteps(Integer stepId, String date, Integer steps, Integer user_id);
}