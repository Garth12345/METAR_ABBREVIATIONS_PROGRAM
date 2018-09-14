//	Garth Adcock
//	Project#1 IT-313
//	9/7/18
import java.util.Scanner; //import the scanner to use
public class MetarAbbreviations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //instantiate the scanner 
        System.out.print("Enter a METAR Abbreviation of the following: + - B DZ E HZ RA SN"); //display options to user
        
        String word = in.nextLine().toUpperCase(); //use scanner/read from keyboard and then convert it to uppercase (so it does not matter if user enters text in upper, lower, or a combination of the two)
        String abbreviationVal = ""; //initialize the abbrev val to empty string
        
        //if & else blocks
        if (word.equals("+")) { 
            abbreviationVal = "Heavy Intensity";
        }
        else if (word.equals("-")) {
            abbreviationVal = "Light intensity";
        }
        else if (word.equals("B")) {
            abbreviationVal = "Began At Time";
        }
        else if (word.equals("DZ")) {
            abbreviationVal = "Drizzle";
        }
        else if (word.equals("E")) {
            abbreviationVal = "Ended At Time";
        }
        else if (word.equals("HZ")) {
            abbreviationVal = "Haze";
        }
        else if (word.equals("RA")) {
            abbreviationVal = "Rain";
        }
        else if (word.equals("SN")) {
            abbreviationVal = "Snow";
        }
        else {
            abbreviationVal = "invalid"; //else set the val to be invalid
        }
       
        if (abbreviationVal.equals("invalid")) { //the val is invalid print out unknown abbrev
            System.out.println("Unknown abbreviation");
        }
        else {
            System.out.println("This Abbreviation means: " + abbreviationVal); //else print out the meaning of the abbrev
        }
        in.close(); //close the scanner
    } //end of main method
} //end of class