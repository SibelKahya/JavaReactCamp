package Concrete;

import Abstract.BaseGamerManager;
import Adapters.GamerCheckServiceMernis;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class GamerManager extends BaseGamerManager {
	
	GamerCheckServiceMernis checkService;

	public GamerManager(GamerCheckServiceMernis checkService) {
		super();
		this.checkService = checkService;
	}

	@Override
	public void save(Gamer gamer) {
		
		if(checkService.CheckIfRealPerson( gamer)){
			System.out.println("Saved to DB :"+gamer.getFirstName());
			
		}else {
			System.out.println("Kullanici bilgisi dogru degil !");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		if(checkService.CheckIfRealPerson(gamer)) {
			System.out.println("Delete to DB"+gamer.getFirstName());
			
		}else {
			System.out.println("Kullanici bilghisi dogru degil !!");
		}
		
		
	}

	@Override
	public void update(Gamer gamer) {
		if(checkService.CheckIfRealPerson(gamer)) {
			System.out.println("Update to DB"+gamer.getFirstName());
			
		}else {
			System.out.println("Kullanici bilgisi dogru degil");
		}
		
	}

}
