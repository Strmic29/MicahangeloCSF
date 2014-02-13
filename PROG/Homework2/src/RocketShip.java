
public class RocketShip {

	public static void main(String[]args) {
		     
		
		           for (int i = 1; i < 6; i++) {
		           
		        	String topL = " /////".substring(0,i+1);
		        	
		       		String topR = "**\\\\\\\\\\".substring(0, i + 2);
		       		
		       		
		       		System.out.println("      ".substring(0,5 - i) + topL + topR); 
		           if (i==5) {System.out.println("+=*=*=*=*=*=*+");}
		           }
		           
		           String up = "|../\\..../\\..|\n|./\\/\\../\\/\\.|\n|/\\/\\/\\/\\/\\/\\|\n";
		           String down = "|\\/\\/\\/\\/\\/\\/|\n|.\\/\\/..\\/\\/.|\n|..\\/....\\/..|\n";
		           String middle = "+=*=*=*=*=*=*+";
		           System.out.println(up + down + down + up + middle);
		           
		           for (int i = 1; i < 6; i++) {
			           
			        	String topL = " /////".substring(0,i+1);
			        	
			       		String topR = "**\\\\\\\\\\".substring(0, i + 2);
			       		
			       		
			       		System.out.println("      ".substring(0,5 - i) + topL + topR); 
			           if (i==5) {System.out.println("+=*=*=*=*=*=*+");}
			           }
		            
		            
		            
		            
		            
		         
		                                                       
		                                   
		                                                 
		        

	}
}