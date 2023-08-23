// Delta College - CST 283 - Homework 3
// Name:


import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

public class DoubleBubble 
{
    final static int MAX_ARRAY = 20;    
    final static String INPUT_FILENAME = "mydata.txt";
    
    public static void main(String[] args) throws IOException
    {
        // Declare parallel arrays for zip code data
        int key[]  = new int[MAX_ARRAY];      // Array for key values
        int data[] = new int[MAX_ARRAY];      // Array for data values
        int numElems = 0;                     // Actual number of values in array 
 
        // Read file and count values in array
        numElems = getData(key,data);

        // Write contents of arrays - before sorting
        writeArray(key, data, numElems);    

        // Sort array
        sortArray(key, numElems);

        // Write contents of arrays - after sorting
        writeArray(key, data, numElems);

        System.exit(0);
    }

    // ---------------------------------------------------------------------
    // Method reads key and data arrays from file into respective parallel arrays
    // Return: number of data elements in array (n <= MAX_ARRAY)
    public static int getData(int key[], int data[]) throws IOException
    {
        File inputfile = new File(INPUT_FILENAME);  
        Scanner inputFileScanner = new Scanner(inputfile);  

        // Read key and data elements into arrays - in parallel
        int i = 0;
        while (inputFileScanner.hasNext() && i < MAX_ARRAY)
        {
            key[i]  = inputFileScanner.nextInt();   
            data[i] = inputFileScanner.nextInt();  
            i++;                               
        }
        int numElems = i;
        
        inputFileScanner.close();   
        
        return numElems;
    }

    // ---------------------------------------------------------------------
    // This method receives an array of integers, reorders it to an ascending
    // order, and returns the array in place by reference.
    public static void sortArray(int[] array, int numElems)
    {
        int lastPos;    
        int index;       
        int temp;    
      
        for (lastPos = numElems - 1; lastPos >= 0; lastPos--)
        {
             for (index = 0; index <= lastPos - 1; index++)
            {
                if (array[index] > array[index + 1])
                {
                   temp = array[index];
                   array[index] = array[index + 1];
                   array[index + 1] = temp;
                }
             }
        }
    }

    // ---------------------------------------------------------------------
    // This writes the contents of two parallel arrays of integers
    public static void writeArray(int array1[], int array2[], int elems)
    {
       for (int i = 0; i < elems; i++)
       {
          System.out.println(array1[i] + "  " + array2[i]);   
       }
       System.out.println("\n\n"); 
    }
}


