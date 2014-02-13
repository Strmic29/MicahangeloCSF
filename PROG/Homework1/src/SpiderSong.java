

//Micah Stringham
//January 13th, 2014
//Strmic29


// import list utility
import java.util.ArrayList;

public class SpiderSong {
       
  //List of Animals excluding horse - punchline
	    static String[] animals = {"fly","spider","bird","cat", "dog", "thundercat",};
    
  // List of unique lines
     static String[] lines = {"I don't know why she swallowed that fly" + "\n" +
            "perhaps she'll die",
        "That wriggled and iggled and jiggled inside of her",
        "How absurd to swallow a bird.",
        "Imagine that, to swallow a cat",
        "What a hog to swallow a dog.",
        "What a dunder to swallow a thundercat",
               };
         
   
    public static void main(String[]args) {
                  
  // for loop that for each animal prints the opening and indexed unique line       
           for (int i = 0; i < animals.length; i++) {
           
             System.out.println("\n" + "There was an old woman who swallowed a "
                + animals[i] + "\n" + lines[i]);
             
  // for loop that prints she swallowed the animal to catch the previous animal
  // and on the last one prints the punch line with the horse
             
                       for (int j = i - 1; j >= 0; j--) {
                           System.out.println("She swallowed the "
                                   + animals[j + 1] + " to catch the " + animals[j]);
                           
//"idk why... perhaps she'll die" at end of each verse (j ==0)                       
                               if (j == 0) {
                                   System.out.println(lines[0]);
                               }                  
        }
     }
          
        System.out.println("\n" + "There was an old woman who swallowed a horse" +
     "\n" + "she died of course");
                     
    }
            
}