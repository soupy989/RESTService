package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DAO.SleepDAO;
import models.Sleep;
import java.util.List;

@RestController
public class SleepController {

	@Autowired
	private SleepDAO sleepDAO;
	
    @RequestMapping("/sleep/{user_id}/{startDate}/{endDate}")
    public List<Sleep> getSleep(@PathVariable(value="user_id", required = true)Integer id,
    		@PathVariable(value="startDate", required = true) String startDate,
    		@PathVariable(value="endDate", required = true) String endDate)
    {
    	List<Sleep> sleep = sleepDAO.getSleep(id,  startDate, endDate);
    	//System.out.println(user.getName());
    	return sleep;
    }
    
    @RequestMapping("/sleep/{sleep_id}/{date}/{total_min}/{user_id}/{total_sleep_record}/{value_in_min}")
    public void createSteps(@PathVariable(value="sleep_id", required = true)Integer id,
    @PathVariable(value="date", required = true)String date,
    @PathVariable(value="total_min", required = true)Integer total_min,
    @PathVariable(value="user_id", required = true)Integer user_id,
    @PathVariable(value="total_sleep_record", required=true) Integer total_sleep_record,
    @PathVariable(value="value_in_min", required = true)Integer value_in_min)
    {
    	sleepDAO.createSleep(id, date, total_min, user_id, total_sleep_record, value_in_min);
    	return;
    }
}