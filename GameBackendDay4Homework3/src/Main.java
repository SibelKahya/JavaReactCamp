import java.util.Date;

import Adapters.GamerCheckServiceMernis;
import Concrete.GamerManager;
import Concrete.SellManager;
import Entities.Campaign;
import Entities.Gamer;
import Entities.Sell;

public class Main {

	public static void main(String[] args) {
		
   Gamer gamer=new Gamer();
      gamer.setId(1);
      gamer.setFirstName("SÝBEL");
      gamer.setLastName("KAHYA");
      gamer.setNationalityId("10101101010");
      gamer.setDateOfBirth(new Date(1992));
      
      GamerManager gamerManager=new GamerManager(new GamerCheckServiceMernis());
      gamerManager.save(gamer);
      
      Campaign campaign=new Campaign();
      campaign.setId(1);
      campaign.setCampaingName("Yeni Oyuncu Kampanyasý");
      campaign.setCampaignDiscount(10);
      
      
      Sell sell=new Sell(campaign);
      sell.setId(1);
      sell.setGameName("Pubg");
      sell.setGamer(gamer);
      sell.setPrice(150);
      
      SellManager sellManager=new SellManager(gamer, campaign);
      sellManager.toShell(sell);
	}

}
