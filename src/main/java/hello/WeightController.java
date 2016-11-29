package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DAO.WeightDAO;
import models.Weight;

import java.util.List;

@RestController
public class WeightController {

	@Autowired
	private WeightDAO weightDAO;
	
    @RequestMapping("/weight/{user_id}/{startDate}/{endDate}")
    public List<Weight> getWeights(@PathVariable(value="user_id", required = true)Integer id,
    		@PathVariable(value="startDate", required = true) String startDate,
    		@PathVariable(value="endDate", required = true) String endDate)
    {
    	System.out.println("hi");
    	List<Weight> weights = weightDAO.getWeight(id,  startDate, endDate);
    	//System.out.println(user.getName());
    	return weights;
    }
    
    @RequestMapping("/createWeight/{weight_id}/{user_id}/{date}/{weight}/{bmi}/{source}")
    public void createWeight(@PathVariable(value="user_id", required = true) Integer id,
    		@PathVariable(value="date", required = true) String date,
    		@PathVariable(value="weight", required = true) String weight,
    		@PathVariable(value="bmi", required = true) String bmi,
    		@PathVariable(value="user_id", required = true) String source,
    		@PathVariable(value="weight_id", required = true) Integer weightId)
    {
    	weightDAO.create(id, weight, bmi, source, date, weightId);
    	return;
    }
}