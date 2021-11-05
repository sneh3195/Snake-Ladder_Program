public class SnakeandLadder2{

        public static void main(String[] args) {

                int position = 0;
                System.out.println(" Welcome to the snake world ");

                int dice;
                int options;

                while (position < 100) {
                        dice = (int)Math.floor( (Math.random() * 10) % 6 + 1);

                      System.out.println("\n The dice On : " + dice);
                        options = (int)Math.floor(Math.random() * 3);

                        switch(options) {
                        case 0:
                                System.out.println(" Player action: nothing");
                                break;
                        case 1:
                                System.out.println(" position is increases");
                                position += dice;
                                break;
                        case 2:
                                System.out.println(" Snake bites go to the previous position");
                                position -= dice;
                                position = position < 0 ? 0 : position;
                                break;

                        }

                        System.out.println(" Current position: " + position);

                }

                System.out.println("Yahoo!!!!!!YOu won the game");
        }

}
