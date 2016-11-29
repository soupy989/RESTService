package models;


public class HeartRate{

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
	public Integer getHeartRate() {
		return heartRate;
	}
	public void setHeartRate(Integer heartRate) {
		this.heartRate = heartRate;
	}
	public Integer getRestingHeartRate() {
		return restingHeartRate;
	}
	public void setRestingHeartRate(Integer restingHeartRate) {
		this.restingHeartRate = restingHeartRate;
	}

	public Integer getOR_min() {
		return OR_min;
	}
	public void setOR_min(Integer oR_min) {
		OR_min = oR_min;
	}
	public Integer getFB_min() {
		return FB_min;
	}
	public void setFB_min(Integer fB_min) {
		FB_min = fB_min;
	}
	public Integer getCA_min() {
		return CA_min;
	}
	public void setCA_min(Integer cA_min) {
		CA_min = cA_min;
	}
	public Integer getPE_min() {
		return PE_min;
	}
	public void setPE_min(Integer pE_min) {
		PE_min = pE_min;
	}
	public Integer getOr_cal() {
		return or_cal;
	}
	public void setOr_cal(Integer or_cal) {
		this.or_cal = or_cal;
	}
	public Integer getFb_cal() {
		return fb_cal;
	}
	public void setFb_cal(Integer fb_cal) {
		this.fb_cal = fb_cal;
	}
	public Integer getCa_cal() {
		return ca_cal;
	}
	public void setCa_cal(Integer ca_cal) {
		this.ca_cal = ca_cal;
	}
	public Integer getPe_cal() {
		return pe_cal;
	}
	public void setPe_cal(Integer pe_cal) {
		this.pe_cal = pe_cal;
	}
	public Integer getOr_max() {
		return or_max;
	}
	public void setOr_max(Integer or_max) {
		this.or_max = or_max;
	}
	public Integer getFb_max() {
		return fb_max;
	}
	public void setFb_max(Integer fb_max) {
		this.fb_max = fb_max;
	}
	public Integer getCa_max() {
		return ca_max;
	}
	public void setCa_max(Integer ca_max) {
		this.ca_max = ca_max;
	}
	public Integer getPe_max() {
		return pe_max;
	}
	public void setPe_max(Integer pe_max) {
		this.pe_max = pe_max;
	}

	private String date;
    private Integer user_id;
    private Integer heartRate;
    private Integer restingHeartRate;
    private Integer OR_min;
    private Integer FB_min;
    private Integer CA_min;
    private Integer PE_min;
    private Integer or_cal;
   
	private Integer fb_cal;
    private Integer ca_cal;
    private Integer pe_cal;
    private Integer or_max;
    private Integer fb_max;
    private Integer ca_max;
    private Integer pe_max;
    
    
}
