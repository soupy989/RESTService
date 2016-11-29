package mappers;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import models.HeartRate;

public class HeartRateMapper implements RowMapper<HeartRate>
{

	public HeartRate mapRow(ResultSet rs, int rowNum) throws SQLException
	{
		HeartRate heartRate = new HeartRate();
		heartRate.setCA_min(rs.getInt("CA_min"));
		heartRate.setDate(rs.getString("Date"));
		heartRate.setFB_min(rs.getInt("FB_min"));
		heartRate.setHeartRate(rs.getInt("HR_value"));
		heartRate.setId(rs.getInt("heartrate_Id"));
		heartRate.setOR_min(rs.getInt("OR_min"));
		heartRate.setPE_min(rs.getInt("PE_min"));
		heartRate.setRestingHeartRate(rs.getInt("Restin_HR"));
		heartRate.setUser_id(rs.getInt("User_id"));
		
		heartRate.setOr_cal(rs.getInt("or_cal"));
		heartRate.setCa_cal(rs.getInt("ca_cal"));
		heartRate.setPe_cal(rs.getInt("pe_cal"));
		heartRate.setOr_max(rs.getInt("or_max"));
		heartRate.setFb_cal(rs.getInt("fb_cal"));
		heartRate.setFb_max(rs.getInt("fb_max"));
		heartRate.setCa_max(rs.getInt("ca_max"));
		heartRate.setPe_max(rs.getInt("pe_max"));
		
		return heartRate;
	}
}