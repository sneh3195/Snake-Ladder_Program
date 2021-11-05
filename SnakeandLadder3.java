public class SnakeandLadder3 {

	public static void main(String[] args) {

		
		int position = 0;
		System.out.println(" Welcome to the snake world ");
		
		
		int dice;
		int options;
		
		
		while (position < 100) {
			dice = (int)Math.floor( (Math.random() * 10) % 6 + 1); 
			System.out.println("\n The dice was rolled to: " + dice);
			options = (int)Math.floor(Math.random() * 3); 
			
			switch(options) {
			case 0: 
				System.out.println(" Sorry nothing");
				break;
			case 1: 
				System.out.println(" increse the position");
				position += dice;
				break;
			case 2: 
				System.out.println("oops Snake bite ");
				position -= dice;
				position = position < 0 ? 0 : position;
				break;
							
			}
			
			System.out.println(" Current position: " + position);
			
		}
		
		System.out.println(" YAHOOO YOU WON");
	}

}
