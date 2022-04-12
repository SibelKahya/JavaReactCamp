package Concrete;

import Entities.Campaign;
import Entities.Gamer;
import Entities.Sell;

public class SellManager {
	private Gamer gamer;
	private Campaign campaign;
	
	public SellManager(Gamer gamer, Campaign campaign) {
		super();
		this.gamer = gamer;
		this.campaign = campaign;
	}
	
	public void toShell(Sell sell) {
		System.out.println(gamer.getFirstName()+" isimli kullaniciya "+sell.getGameName()+" Oyun "
	     +campaign.getCampaingName()+" ile "+sell.getPrice()+" Fiyata Satýldý ");
		
	}
	
	

}
