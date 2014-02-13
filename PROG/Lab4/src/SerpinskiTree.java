public class SerpinskiTree {

        static int base = 7; 

	    static String triangles(int n, int d, int l) {
	        String result = "";
	        for (int i = 1; i <= base; i +=2) {
	             for (int k = 0; k < l; k++) {
	                   result += " ";
	             }
	             for (int k = 0; k <n; k++) {
	            	 for (int j = 0; j < d; j++) {
	            		 result += " ";
	            	 }
	            	 for (int j = 0; j < (base - i) /2 ; j++) {
	            		 result += " ";
	            	 }
	            	 for (int j = 0; j < (i); j++) {
	            		 result += "*";
	            	 }
	            	 for (int j = 0; j < (base - i) / 2; j++) {
	            		 result += " ";
	            	 }
	            	 for(int j = 0; j < d; j++) {
	            		 result += " ";
	            	 }
                     result += " ";
	             }        	
	            	 result += "\n";
	        }
	
	return result;
	        
	}
public static void main (String[] args) {
	String basestring = "";
			basestring += triangles(1,0,12);
			basestring += triangles(2,0,8);
			basestring += triangles(2,4,0);
			basestring += triangles(4,0,0);
			for (int j = 0; j < 5; j++) {
				basestring += "            *******\n";
			}	
							
							System.out.println(basestring);
    }}