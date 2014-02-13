
public class GuessGame {
	
	//GuessGame has three varibles as objects
	Player p1;
	Player p2;
	Player p3;
	Player p4;
	Player p5;
	
	
	public void startGame() {
		//creates three player objects and assigns vars
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		p4 = new Player();
		p5 = new Player();
		
		//3 vars to hold 3 guesses
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		int guessp4 = 0;
		int guessp5 = 0;
		
		//vars to hold boolean based on Player answer
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		boolean p4isRight = false;
		boolean p5isRight = false;
		
		//creates target number
		int targetNumber = (int) (Math.random() * 100);
		System.out.println("I'm thinking of a number between 0 and 100...");
		
		while(true) {
			System.out.println("Number to guess is " + targetNumber);
			
			//calls each player's guess() method
			p1.guess();
			p2.guess();
			p3.guess();
			p4.guess();
			p5.guess();
			
			//get each guess, the result of their guess() method, by accessing
			//number var of each player
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);			
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);			
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);			
			guessp4 = p4.number;
			System.out.println("Player four guessed " + guessp4);
			guessp5 = p5.number;
			System.out.println("Player five guessed " + guessp5);
		
			
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			if (guessp4 == targetNumber) {
				p4isRight = true;
			}
			if (guessp5 == targetNumber) {
				p5isRight = true;		
			}
			
			//if player one OR player two Or.. is right
			if (p1isRight || p2isRight || p3isRight || p4isRight || p5isRight) {
				
				System.out.println("We have a winner!");
				System.out.println("Player one got it right " + p1isRight);
				System.out.println("Player two got it right " + p2isRight);
				System.out.println("Player three got it right " + p3isRight);
				System.out.println("Player four got it right " + p4isRight);
				System.out.println("Game is over.");
				break;
				} else {
					System.out.println("Players will have to try again");
					
				} //end if/else
			
		} //end loop
		
	}//end method

}//end class
