
public class UC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerposition=0;
		System.out.println("Welcome to Snake and Ladder Game");
		
		System.out.println("Created by Swayam Prakash");
		
		System.out.println("Player Starting Position is " +playerposition);
		
		int number = 1+ (int) (Math.random()*6);
		System.out.println("After rolling the dice player 1 got =  " +number);
		
		int option= (int) Math.floor(Math.random()*3);
				
		if (option ==0 ) {
			System.out.println("No play");
			playerposition = playerposition;
			System.out.println("Player Postion is " +playerposition);
		}
		else if (option == 1) {
			System.out.println("Ladder");
			playerposition = playerposition + number;
			System.out.println("Player current position is " +(playerposition + number));
		}
		else {
			System.out.println("Snake");
			playerposition = playerposition - number;
			if (playerposition < 0) {
				playerposition = 0;
			}
			System.out.println("Player Current Position is " +(playerposition - number));
		}
		
			
	}

}
