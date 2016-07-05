/**
 * 
 */
package splitString;

import java.util.StringTokenizer;

/**
 * @author AmolV
 *
 */
public class Split {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count_hdp = 0;
		
		String a = "Hadoop is open source frame work Hadoop is good framework for handling big data" ;
		String b ;	
		
		StringTokenizer st = new StringTokenizer(a," ");  
	     while (st.hasMoreTokens()) {  
	    	 
	    	 b = st.nextToken();
	         System.out.println(b);  
	          if (b.equals("Hadoop") )
	        	  count_hdp++;
	         
	     }  
	     
	     System.out.println("Hadoop is present " + count_hdp + "Times");

	}

}
