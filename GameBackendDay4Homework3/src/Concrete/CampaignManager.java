package Concrete;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void campaignAdd(Campaign campaign) {
	  System.out.println(campaign.getCampaingName()+" : Eklendi");
		
	}

	@Override
	public void campaignDelete(Campaign campaign) {
		System.out.println(campaign.getCampaingName()+" : Silindi");
		
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
	System.out.println(campaign.getCampaingName()+" :Guncellendi");
		
	}

}
