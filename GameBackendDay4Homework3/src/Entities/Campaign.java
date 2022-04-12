package Entities;

public class Campaign {
	private int id;
	private String campaingName;
	private double campaignDiscount;
	
	public Campaign() {}
	
	public Campaign(int id, String campaingName, double campaignDiscount) {
		super();
		this.id = id;
		this.campaingName = campaingName;
		this.campaignDiscount = campaignDiscount;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCampaingName() {
		return campaingName;
	}
	
	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}
	
	public double getCampaignDiscount() {
		return campaignDiscount;
	}
	
	public void setCampaignDiscount(double campaignDiscount) {
		this.campaignDiscount = campaignDiscount;
	}
	

}
