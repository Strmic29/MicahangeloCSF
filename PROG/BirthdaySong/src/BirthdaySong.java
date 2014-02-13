
public class BirthdaySong {
	// the BS class has
    // three fields
    String secondline;
    String animal;
    String verb;

    // the BS class has
    // one constructor
    public BirthdaySong(String secondline, String animal, String verb) {

        this.secondline = secondline;
        this.animal = animal;
        this.verb = verb;
        }
 
    public String toString()  {
        String result = "Happy birthday to you \nHappy birthday to you\n";

            result += "You look like a " + this.animal + "\n";
            result += this.secondline + "\n";
            result += "And you " + this.verb + " like one too.";
        return result;
       }
    public static void main(String[]args) {
        BirthdaySong song = new BirthdaySong("You live in a Rave", "Bonobo", "Jam");
        String songtoString = song.toString();
        System.out.println(song);
       
       
   
}
}
	
