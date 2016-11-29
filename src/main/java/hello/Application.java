package hello;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import DAO.HeartRateDAO;
import DAO.HeartRateDAOImpl;
import DAO.SleepDAO;
import DAO.SleepDAOImpl;
import DAO.StepDAO;
import DAO.StepDAOImpl;
import DAO.UserDAO;
import DAO.UserDAOImpl;
import DAO.WeightDAO;
import DAO.WeightDAOImpl;

@SpringBootApplication
@Configuration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean 
    public DataSource getDataSource()
    {
    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
    	dataSource.setDriverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    	dataSource.setUrl("jdbc:sqlserver://uphtest2.database.windows.net:1433;database=uphTest;user=uphAdmin@uphtest2;password=uphPassword1;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
    	dataSource.setUsername("uphAdmin");
    	dataSource.setPassword("uphPassword1");
    	
    	return dataSource;
    }
    
    @Bean
    public UserDAO getUserDao()
    {
    	return new UserDAOImpl(getDataSource());
    }
    @Bean
    public WeightDAO getWeightDao()
    {
    	return new WeightDAOImpl(getDataSource());
    }
    @Bean
    public StepDAO getStepDao()
    {
    	return new StepDAOImpl(getDataSource());
    }
    @Bean
    public SleepDAO getSleepDao()
    {
    	return new SleepDAOImpl(getDataSource());
    }
    @Bean 
    public HeartRateDAO getHeartRateDAO()
    {
    	return new HeartRateDAOImpl(getDataSource());
    }
    
}

