package Conrete;

import Abstract.UserValidationService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class UserValidationManager implements UserValidationService {

	@Override
	public boolean validete(Player player) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy kpsPublicSopapProxy=new KPSPublicSoapProxy();
		boolean result =false;
	try {
		result=kpsPublicSopapProxy.TCKimlikNoDogrula(Long.parseLong(player.getNationalId()), player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(),player.getBirthday().getYear()); 
	}
		catch (Exception e) {
			System.out.println("bilgiler hatalý. kaydedilemedi");
		}
	return result;
	}

}
