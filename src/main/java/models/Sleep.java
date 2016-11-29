package models;


public class Sleep {
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getTotal_min() {
		return total_min;
	}
	public void setTotal_min(String total_min) {
		this.total_min = total_min;
	}
	public String getTotal_sleep_records() {
		return total_sleep_records;
	}
	public void setTotal_sleep_records(String total_sleep_records) {
		this.total_sleep_records = total_sleep_records;
	}
	public String getTotal_time_in_bed() {
		return total_time_in_bed;
	}
	public void setTotal_time_in_bed(String total_time_in_bed) {
		this.total_time_in_bed = total_time_in_bed;
	}
	private String date;
	private Integer user_id;
	private String total_min;
	private String total_sleep_records;
	private String total_time_in_bed;
	
	

}
