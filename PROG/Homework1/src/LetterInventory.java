
public class LetterInventory {
	
	static int numberOfLetterC;
	static String c;
	
	public static void main(String[]args) {
		
		 String  sring = "GOTTA CATCH EM ALLL!";
		 String  alpha = "abcdefghijklmonpqrstuvwxyz";
		 
		 
		 for (int j = 0; j < alpha.length(); j++) {
			 
			    char c = alpha.charAt(j);			
			    int numberOfLetterC = LetterInventory(sring.toLowerCase(), c);
			    
			    if (numberOfLetterC > 0) {			    	
			    	System.out.println("Letter " + c + " = " + numberOfLetterC);
			    }		    			    
		 }
		 System.out.println("letters in the string: " + sring);
	}	
	
	 public static int LetterInventory(String source, char target) {
	        int counter = 0;
	       
	        for (int i = 0; i < source.length(); i++) {
	            if (source.charAt(i) == target) {
	                counter++;	              
	            }
	        } 
	      
	        return counter;	        
	 }
}
		    
	 

