


public class NormalBirthdaySong {
	  // the BS class has
    // four fields
	String name;
    String secondline;
    String animal;
    String verb;

    // the BS class has
    // one constructor
    public NormalBirthdaySong(String name,String secondline, String animal, String verb) {

    	this.name = name;
        this.secondline = secondline;
        this.animal = animal;
        this.verb = verb;
        }
 
    public String toString() {
        String result = "Happy birthday to you \nHappy birthday to you\n";

            result += "Happy birthday dear " + this.name + "\nHappy birthday to you\n";
        	result += "You look like a " + this.animal + "\n";
            result += this.secondline + "\n";
            result += "And you " + this.verb + " like one too.";
        return result;
       }
    public static void main(String[]args) {
        NormalBirthdaySong song = new NormalBirthdaySong("Micah","You live in a Rave", "Bonobo", "KNOW");
        String songtoString = song.toString();
        System.out.println(song);
       
       
   
}

}
