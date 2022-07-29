package Entities;

public class Campaign {

	String campaignName;

	public Campaign(String campaignName) {
		super();
		this.campaignName = campaignName;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
}
