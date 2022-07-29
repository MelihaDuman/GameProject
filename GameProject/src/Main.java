import java.time.LocalDate;

import Conrete.CampaignManager;
import Conrete.PlayerManager;
import Conrete.SaleManager;
import Conrete.UserValidationManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player player1 = new Player("30095068258","meliha","duman", LocalDate.of(1996,05,05));
		Game game1= new Game(1,"sism4");
		Campaign campaign1=new Campaign ("%50");
		
		PlayerManager playerManager = new PlayerManager(new UserValidationManager());
		playerManager.register(player1);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.newCampaign(campaign1);
		SaleManager saleManager = new SaleManager();
		saleManager.sale(player1, game1, campaign1);
		
		
		
		
		
		
	}

}
