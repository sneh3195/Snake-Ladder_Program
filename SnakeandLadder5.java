public class SnakeandLadder5 {

	public static void main(String[] args) {

		
		int position1 = 0;
		int position2 = 0;
		System.out.println(" Welcome to the snake world");
		
		
		int dice;
		int options;
		int roll = 0;
		int newturn = 0;
		int oldTurn = 0;
		
		
		while (position1 < 100 && position2 < 100) {
			
			if (newturn == 0) 
				System.out.println(" Player 1 is playing");
			else
				System.out.println(" Player 2 is playing");
			
			dice = (int)Math.floor( (Math.random() * 10) % 6 + 1); 
			System.out.println(" The dice is On " + dice);
			options = (int)Math.floor(Math.random() * 3); 
			
			switch(options) {
			case 0: 
				System.out.println(" nothing to play");
				break;
			case 1: 
				System.out.println(" increse your position");
				if (newturn == 0) 
					position1 += dice;
					
				else
					position2 += dice;
				
				if (position1 > 100) {
					position1 -= dice;
					System.out.println(" Player1 exceeded 100 ");
				}
				
				if (position2 > 100) {
					position2 -= dice;
					System.out.println(" Player2 exceeded 100 ");
				}
				break;
			case 2: 
				System.out.println("oops snake bites");
				if (newturn != 0) 
					position1 -= dice;
					
				else
					position2 -= dice;
				
				
				if (position1 < 0) {
					position1 = 0;
					System.out.println(" Player1 go to 0");
				}
				
				if (position2 < 0) {
					position2 = 0;
					System.out.println(" Player2 go to 0");
				}
				
				newturn = (newturn + 1) % 2;
				break;
							
			}
			
			if (oldTurn == 0)
				System.out.println(" Current position for Player1: " + position1 + "\n");
			else
				System.out.println(" Current position for Player2: " + position2 + "\n");
			roll++;
			oldTurn = newturn;
		}
		
		System.out.println(" Congratulations you won" + (newturn + 1) + "!!");
		System.out.println(" We put " + roll + "  win the game!!");
	}

}
