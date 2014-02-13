
public class Player {
	
	//Guess...
	int number = 0; 
	
	public void guess() {
		number = (int) (Math.random() * 100);
		System.out.println("I'm guessing " + number);
	}

}
