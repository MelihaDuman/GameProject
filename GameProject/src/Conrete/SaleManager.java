package Conrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public class SaleManager implements SaleService{

	@Override
	public void sale(Player player, Game game, Campaign campaign) {
		// TODO Auto-generated method stub
		System.out.println(player.getFirstName()+" kiþisine "+game.getGameName()+" oyunu satýldý.");
	}

	
}
