//andbra16
public class SpiderSong {

	public static void main(String[] args){
		firstVerse();
		secondVerse();
		thridVerse();
		fourthVerse();
		fifthVerse();
	}
	static void firstLine(String creature){
		System.out.println ("There was an old woman who swallowed a " + creature + ".");
	}
	
	static void flyDie(){
		return "I don't know why she swallowed that fly.\n" + "Perhaps she'll die.\n\n"
	}
	
	static void swallowedString(int x) {
		String one = "She swallowed the spider to catch the fly. \n" + flyDie();
		String two = "She swallowed the bird to catch the spider. \n" + one();
		String three= "She swallowed the cat to catch the bird,\n"+ two;
		String four= "She swallowed the dog to catch the cat,\n"+ three;
		String five ="She swallowed the man to catch the dog,\n"+ four;
	if (x==1) {
		System.out.print(one);
	} else if (x==2) {
		System.out.print(two);
	} else if (x==3) {
		System.out.print(three);
	} else if (x==4) {
		System.out.print(four);
	} else if (x==5) {
		System.out.print(five);
	}			
	}	
	static void firstVerse() {
		firstLine("spider");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		swallowedStrings(1);
	}
	static void thirdVerse() {
	firstLine("Bird");
	System.out.println("How Absurd to swallow a bird.");
	}	
	static void fourthVerse(){
	firstLine("Cat")
	System.out.println("Imagine that to swallow a cat.")

	static void fifthVerse(){
	firstLine("Dog")
	System.out.println("What a hog to swallow a dog.")

	}
	static void sixthVerse(){
	firstLine("Man")
	System.out.println("Quite the plan to swallow a man.")

	}

	static void lastVerse(){
	firstLine("Horse")
	System.out.println("She died ofcourse.");
	}
	}
