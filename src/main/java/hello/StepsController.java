package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DAO.StepDAO;
import models.Step;
import java.util.List;

@RestController
public class StepsController {

	@Autowired
	private StepDAO StepDAO;
	
    @RequestMapping("/step/{user_id}/{startDate}/{endDate}")
    public List<Step> getSteps(@PathVariable(value="user_id", required = true)Integer id,
    		@PathVariable(value="startDate", required = true) String startDate,
    		@PathVariable(value="endDate", required = true) String endDate)
    {
    	List<Step> steps = StepDAO.getSteps(id,  startDate, endDate);
    	//System.out.println(user.getName());
    	return steps;
    }
    
    @RequestMapping("/createStep/{step_id}/{date}/{steps}/{user_id}")
    public void createSteps(@PathVariable(value="step_id", required = true)Integer id,
    @PathVariable(value="date", required = true)String date,
    @PathVariable(value="steps", required = true)Integer steps,
    @PathVariable(value="user_id", required = true)Integer user_id)
    {
    	StepDAO.createSteps(id, date, steps, user_id);
    	return;
    }
}