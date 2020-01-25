import lib280.list.LinkedIterator280;
import lib280.list.LinkedList280;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PerformanceByRank {

    public static LinkedList280<Crew> readCrewData(String path) {
        Scanner infile = null;

        try {
            infile = new Scanner(new File(path));
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        }

        // Initialize output list.
        LinkedList280<Crew> pirateCrew = new LinkedList280<Crew>();

        // While there is more stuff to read...
        while(infile.hasNext()) {
            // Read the three values for a Crew record
            int rank = infile.nextInt();
            double pay = infile.nextDouble();
            int sacks = infile.nextInt();

            // Create a crew object from the data
            Crew c = new Crew(rank, pay, sacks);

            // Place the new Crew instnace in the linked list.
            pirateCrew.insertFirst(c);
        }

        // Close the input file like a good citizen. :)
        infile.close();

        // Return the list of Crew objects.
        return pirateCrew;
    }


    public static void main( String args[] ) {
        // Read the data for Jack's pirate crew.

        // If you are getting a "File Not Found" error here, you may adjust the
        // path to piratecrew.txt as needed.
        LinkedList280<Crew> pirateCrew = readCrewData("C:\\Users\\User\\Documents\\Second-year\\CMPT280\\Assignments\\src\\piratecrew.txt");

		// TODO Write your solution here.

        LinkedList280<Crew>[] piratesByRanks= new LinkedList280[10];


        //Iterating through List of read pirateCrew data
        LinkedIterator280 iter = pirateCrew.iterator();




    }

}
