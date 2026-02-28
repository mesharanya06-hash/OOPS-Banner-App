/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 * 
 * This use case improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 * 
 * @author Sharanya
 * @version 5
 */
 
 public class OOPSBannerApp5 {

  
    public static void main(String[] args) {

        
        String[] lines = {

		 String.join(" ",
                "  ***** ", "   ***** ", " ******** ", "  ***** "),

         String.join(" ",
                "**     **", "**     **", "**     **", "**     **"),

         String.join(" ",
                "**     **", "**     **", "**     **", "**"),

         String.join(" ",
                "**     **", "**     **", "******** ", "   **** "),

         String.join(" ",
                "**     **", "**     **", "**       ", "      **"),

         String.join(" ",
                "**     **", "**     **", "**       ", "**     **"),

         String.join(" ",
                "  ***** ", "   ***** ", " **      ", "   ***** "),
		};

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
