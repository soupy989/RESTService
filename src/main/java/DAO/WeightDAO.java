package DAO;

import java.util.List;

import models.Weight;

public interface WeightDAO {
	
	public void create(Integer user_id, String weight, String bmi, String source, String date, Integer weightId);
	
	public List<Weight> getWeight(Integer id, String startDate, String endDate);
	
	public void delete(Integer id);
	
}