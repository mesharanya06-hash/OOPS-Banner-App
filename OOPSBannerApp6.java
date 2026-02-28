/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 * 
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 * 
 * @author Sharanya
 * @version 6
 */ 
 public class OOPSBannerApp6 {
	public static String[] getOPattern() {
		
		return new String[] {
			"    ***    ",
			" **     ** ",
			"**       **",
			"**       **",
			"**       **",
			" **     ** ",
			"    ***    "
		};
	 }	
	public static String[] getPPattern() {
		
		return new String[] {
			"******   ",
			"**   **  ",
			"**   **  ",
			"******   ",
			"**       ",
			"**       ",
			"**       "
		};
	}
	public static String[] getSPattern() {
		
		return new String[] {
			"    *****  ",
			"   **   ** ",
			"  **       ",
			"    ***    ",
			"       **  ",
			"        ** ",
			"   *****   "
		};
	}	
	public static void main (String[] args) {
			 String[] oPattern = getOPattern();
		     String[] pPattern = getPPattern();
			 String[] sPattern = getSPattern();

			 for (int i = 0; i < oPattern.length; i++) {
					System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
			 }

	}
 }