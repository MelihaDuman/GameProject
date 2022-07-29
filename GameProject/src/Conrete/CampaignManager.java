package Conrete;

import Abstract.CampaignService;

import Entities.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void newCampaign(Campaign campaign) {
		System.out.println("kampanya eklendi");
		
	}

	@Override
	public void updateCampaing(Campaign campaign) {
		System.out.println("kampanya güncellendi");
		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("kampanya silindi");
		
	}

	
}
