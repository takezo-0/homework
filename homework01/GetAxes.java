// Delta College - CST 283 - Homework 1
// Name:  

import java.io.*;

public class GetAxes {
    static final String FILENAME = "data.txt";
    static final int MAX_COORDS = 100;

    public static void main(String[] args) {

        // Parallel arrays for (x,y) coordinates
        int[] xVals = new int[MAX_COORDS];
        int yVals = new int[MAX_COORDS];

        int numCoords = 0;      // Counter for number of coordinates

        // Start file processing
        try {
            String filename = FILE_NAME;
            File dataFileRef = new File(filename);

            // Check for file existence.  If not found, display error and crash
            if (!dataFileRef.exists()) {
                System.out.println("File was not found");
                System.exit(0);
            }

            Scanner inputFile = new Scanner(dataFileRef);

            // File processing loop.  Build parallel arrays of (x,y) coordinates.
            int i = 0;
            while (inputFile.hasNext()) {
                xVals(i) = inputFile.nextNum();
                yVals(i) = inputFile.nextNum();
            }
            numCoords = i;

        catch (IOException e)    // If file error, display message and crash
        {
            System.out.println("File error.");
            System.exit(0);
        }

        // Invoke method to determine axes range.
        writeaxes(numCoords,xVals[],yVals[]);
    }


    // This method receives parallel integer arrays of (x,y) coordinates.
    // It seeks the max and min of each set in order to define graphing axes ranges.
    // Arrays contain 'n' elements.
    public static void writeAxes(int xVals, int yVals, int n) {
        int minX = 999;
        int maxX = -999;
        int minY = 999;
        int maxY = -999;

        // Process arrays to seek min and max for both


               // Enter your new code here





        System.out.println("x-axis: " + minX + " - " + maxX);
        System.out.println("y-axis: " + minY + " - " + maxY);
    }
}

