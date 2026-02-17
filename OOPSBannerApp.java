/**
 * OOPSBannerApp UC1 - OOPS Banner Display Application
 *
 * This class demonstrates a simple Java application that displays the Object
 * Oriented Programming System OOPS acronym to the console.
 *
 * @author: sharanya
 * @version: 1.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {
        printBanner();
    }

    public static void printBanner() {

        System.out.println(String.join(" ",
                " ***** ", " ***** ", " ****** ", " ***** "));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*     *", "*     *"));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*     *", "*"));

        System.out.println(String.join(" ",
                "*     *", "*     *", "****** ", " ***** "));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*       ", "      *"));

        System.out.println(String.join(" ",
                "*     *", "*     *", "*       ", "*     *"));

        System.out.println(String.join(" ",
                " ***** ", " ***** ", "*       ", " ***** "));
    }
}
