public class SnakeandLadder {

	public static void main(String[] args) {

		
		int position = 0;
		System.out.println(" Welcome to the snake world ");
		
		
		double dice = Math.floor( (Math.random() * 10) % 6 + 1); 
		System.out.println(" The dice is On " + dice);
		int option = (int)Math.floor(Math.random() * 3); 
		
		switch(option) {
		case 0: 
			System.out.println(" Player action: nothing");
			break;
		case 1: 
			System.out.println(" increse the position");
			position += dice;
			break;
		case 2: 
			System.out.println(" Snake bites!!!go to your previous position");
			position -= dice;
			break;
						
		}
		
		System.out.println(" Current position: " + position);
	}

}
