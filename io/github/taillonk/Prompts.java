package io.github.taillonk;
import java.util.Scanner;

public class Prompts {
    public static double getDouble(String input) {
        Scanner scanner = new Scanner(System.in); // setup scanner
        double num = 0; // will hold the returned number.
        String str = "";
        boolean gotDouble = false;// will go true when appropriate.
        while (!gotDouble) {
            System.out.println(input);
            str = scanner.nextLine();
            try {
                num = Double.parseDouble(str);
                gotDouble = true;
            } catch (Exception e) {
                System.out.println(str + " is not a number.");
            } // end try/catch
        } // end while()
        //throws error outside of function on repeat uses
        //scanner.close()
        return num;
    }// end getDouble()

    public static int getInt(String input) {
        Scanner scanner = new Scanner(System.in); // setup scanner
        int num = 0; // will hold the returned number.
        String str = "";
        boolean gotInt = false;// will go true when appropriate.
        while (!gotInt) {
            System.out.println(input);
            str = scanner.nextLine();
            try {
                num = Integer.parseInt(str);
                gotInt = true;
            } catch (Exception e) {
                System.out.println(str + " is not an integer.");
            } // end try/catch
        } // end while()
        //throws error outside of function on repeat uses
        //scanner.close()
        return num;
    }// end getInt()

    public static String getStr(String prompt) {
        Scanner scanner = new Scanner(System.in);
        String str = "";// will store data returned
        boolean gotString = false;// will turn true, with correct data
        while (!gotString) {
            System.out.println(prompt);
            str = scanner.nextLine();
            if (!str.isEmpty()) {
                gotString = true;
            } else {
                System.out.println("Please enter at least one character.");
            }
        } // end while
        //throws error outside of function on repeat uses
        //scanner.close()
        return str;
    }// end getStr()

}
