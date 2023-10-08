// Delta College - CST 283 - Klingler                          
// This application reads a file containing infix arithmetic expressions.
// It utilizes the Expression class to then convert to both infix and postfix
// equivalents.

import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;

public class ExpressionChecker {

    public static final String fileName = "infixPractice.txt";

    public static void main(String[] args) 
    {
        try 
        {
            File inputfile = new File(fileName);  

            // Check for file existence.  If not found, display error and crash
            if (!inputfile.exists()) {
                JOptionPane.showMessageDialog(null,
                        "File was not found",
                        "File Error",
                        JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
            Scanner expressionScanner = new Scanner(inputfile);

            // Process all expressions in file
            while (expressionScanner.hasNext()) 
            {
                String inputExpression = expressionScanner.nextLine();
                InfixExpression currentExpression = new InfixExpression(inputExpression);
                         
                // Write expression and equivalent prefix and postfix to console
                System.out.println(currentExpression.toString() + "\n" +
                                    "   PREFIX  ==> " + currentExpression.toPrefix() + "\n" +
                                    "   POSTFIX ==> " + currentExpression.toPostfix()+ "\n\n");
            }
            
            expressionScanner.close();
        } 
        catch (IOException e) 
        {
             System.out.println("File Problem - Shutting Down");
             System.exit(-99);
        }

        System.exit(0);
    }
}
