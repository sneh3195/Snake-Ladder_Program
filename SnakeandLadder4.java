public class SnakeandLadder4 {

	public static void main(String[] args) {

		int position = 0;
		System.out.println(" welcome to the snake world ");


		int dice;
		int options;
		int roll = 0;
		
		
		while (position < 100) {
			dice = (int)Math.floor( (Math.random() * 10) % 6 + 1); 
			System.out.println("\n The dice On " + dice);
			options = (int)Math.floor(Math.random() * 3); 
			
			switch(options) {
			case 0: 
				System.out.println(" Sorry nothing");
				break;
			case 1: 
				System.out.println(" increse the position");
				position += dice;
				if (position > 100) {
					position -= dice;
					System.out.println(" Exceeded Upto 100 ");
				}
				break;
			case 2: 
				System.out.println(" Snake bites ");
				position -= dice;
				position = position < 0 ? 0 : position;
				break;

			}
			
			System.out.println(" Current position: " + position);
			roll++;
		}
		
		System.out.println(" Congratulations you put " + roll + "  you win the game!!");
	}

}

