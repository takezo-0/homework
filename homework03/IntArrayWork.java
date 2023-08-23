//Delta College - CST 183 - Homework 2
// Name:

import java.util.Scanner;
import java.io.*;

import java.util.Random;

public class IntArrayWork
{
    public static void main( String args[] ) throws IOException
    {
        final String inputfilename = "intdata.txt";
        final int ARRAY_SIZE = 50;                  // Max array size

        int data[];
        File inputfile;
        int numElems = 0;

        inputfile  = new File(inputfilename);
        data = new int[ARRAY_SIZE];

        // Check for file existence.  If not found, display error and crash
        if (!inputfile.exists())
        {
            System.out.println("ERROR - File note found.");
            System.exit(0);
        }

        // Asserting file found, instantiate scanner object for input
        Scanner inputFileScanner  = new Scanner(inputfile);

        // File processing loop
        int i = 0;
        while (inputFileScanner.hasNext())
        {
            data[i] = inputFileScanner.nextInt();
            i++;
        }
        numElems = i;
        inputFileScanner.close();

        // Check for non-empty file.  If OK, write sorted array to output
        if (numElems > 0)
        {


              // Perform your array operations here.


        }
        else  // Otherwise, assign output message to designate an error
            System.out.println("ERROR - Empty file");
    }
}  
