package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DAO.HeartRateDAO;
import models.HeartRate;
import java.util.List;

@RestController
public class HeartRateController {
	
	@Autowired 
	private HeartRateDAO hrDAO;
	
	@RequestMapping("/hr/{user_id}/{startDate}/{endDate}")
	public List<HeartRate> getHeartRate(@PathVariable(value="user_id", required = true)Integer id,
    		@PathVariable(value="startDate", required = true) String startDate,
    		@PathVariable(value="endDate", required = true) String endDate)
	{
		List<HeartRate> hr = hrDAO.getHeartRates(id, startDate, endDate);
		return hr;
	}
	
	@RequestMapping("/hr/{user_id}/{date}/{heartRate}/{restringHeartRate}/{or_min}/{fb_min}/{ca_min}/{pe_min}/{or_cal}/"
			+ "{fb_cal}/{ca_cal}/{pe_cal}/{or_max}/{fb_max}/{ca_max}/{pe_max}/{hr_id}")
	public void createHeartRate(@PathVariable(value="user_id", required = true)Integer id,
			@PathVariable(value="date", required = true)String date,
			@PathVariable(value="heartRate", required = true)Integer heartRate,
			@PathVariable(value="restringHeartRate", required = true)Integer restringHeartRate,
			@PathVariable(value="or_min", required = true)Integer or_min,
			@PathVariable(value="ca_min", required = true)Integer ca_min,
			@PathVariable(value="fb_min", required = true)Integer fb_min,
			@PathVariable(value="pe_min", required = true)Integer pe_min,
			@PathVariable(value="or_cal", required = true)Integer or_cal,
			@PathVariable(value="fb_cal", required = true)Integer fb_cal,
			@PathVariable(value="ca_cal", required = true)Integer ca_cal,
			@PathVariable(value="pe_cal", required = true)Integer pe_cal,
			@PathVariable(value="or_max", required = true)Integer or_max,
			@PathVariable(value="fb_max", required = true)Integer fb_max,
			@PathVariable(value="ca_max", required = true)Integer ca_max,
			@PathVariable(value="pe_max", required = true)Integer pe_max,
			@PathVariable(value="hr_id", required = true)Integer hr_id)
	{
		hrDAO.createHeartRate(date, id, heartRate, restringHeartRate, or_min, fb_min, ca_min, pe_min, or_cal, fb_cal, ca_cal, pe_cal, or_max, fb_max, ca_max, pe_max, hr_id);
		return;
	}
}