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
		}	
}
