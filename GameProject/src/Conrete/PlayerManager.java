package Conrete;

import Abstract.PlayerService;
import Abstract.UserValidationService;
import Entities.Player;

public class PlayerManager implements PlayerService{
	
	UserValidationService userValidationService;
	
	public PlayerManager (UserValidationService userValidationService)
	{
		this.userValidationService=userValidationService;
	}
	
	
	
	
	public void register (Player player) {
		
		if (userValidationService.validete(player)) {
			System.out.println(player.getFirstName()+"kaydedildi");
		}else {
			System.out.println("kiþi doðrulanamadý");
		}
		
		
		
	}

	@Override
	public void update(Player player) {
		// TODO Auto-generated method stub
		System.out.println(player.getFirstName()+"updated");
	}

	@Override
	public void delete(Player player) {
		
		// TODO Auto-generated method stub
		System.out.println(player.getFirstName()+"silindi");
	}

}
