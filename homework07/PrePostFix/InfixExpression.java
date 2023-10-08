// Delta College - CST 283 - Klingler
// This class manages an infix arithmetic expression with variables (A-Z), arithmetic
// operators, and grouping symbols (parentheses only).  No spaces exist in the
// expression.  It provides methods to return either prefix or postfix 
// equivalents of the stored infix expression.

public class InfixExpression 
{
    private String expression;
    
    /*****************************************************************/
    // Constructor
    /*****************************************************************/    
    public InfixExpression(String e)
    {
        expression = e;
    }

    /*****************************************************************/
    // This method converts the member expression to the 
    // equivalent postfix expression and returns as a string.
    // PRE: expression is valid and parentheses are balanced
    /*****************************************************************/
    public String toPostfix()
    {
        String outString = "";
        int len = expression.length();

        int i;
        char symbol,addSym,atTop,justPopped;
        CharStack theStack = new CharStack(50);

        // Iterate through infix string - one char at a time
        for (i = 0; i < len; i++)
        {
            // Read next symbol
            symbol = expression.charAt(i);

            // Handle variables
            if (aVariable(symbol))
                outString += symbol;

            // Handle operators
            if (anOperator(symbol))
            {
                while (!theStack.isEmpty() && theStack.peek() != '(' && 
                        Precedence(theStack.peek()) >= Precedence(symbol) )
                {
                    addSym = theStack.pop();
                    outString += addSym;
                }
                theStack.push(symbol);
            }

            // Handle open parenthesis
            if (symbol == '(')
                theStack.push(symbol);

            // Handle close parenthesis
            if (symbol == ')')
            {
                while (theStack.peek() != '(' )
                {
                    addSym = theStack.pop();
                    outString += addSym;
                }
                justPopped = theStack.pop();
            }
        } 

        // Handle remaining stack (if necessary)
        while(!theStack.isEmpty())
        {
            addSym = theStack.pop();
            outString += addSym;
        }

        return outString;

    }
    
    /*****************************************************************/
    // This method converts the member expression to the 
    // equivalent prefix expression and returns as a string.
    // PRE: expression is valid and parentheses are balanced
    /*****************************************************************/
    public String toPrefix()
    {
        String outString = "";
        char symbol, addSym;
        CharStack theStack = new CharStack(50);

        // Reverse expression and work backwards
        String revExpression = reverse(expression);
 
        int len = expression.length();

        // Iterate through infix string - one char at a time
        for (int i = 0; i < len; i++)
        {
            symbol = revExpression.charAt(i);

            // Handle variable
            if (aVariable(symbol))
                outString += symbol; 

            // Handle close parenthesis
            if (symbol == ')')
                theStack.push(symbol);

            // Handle arithmetic operator
            if (anOperator(symbol))
            {
                while ( !theStack.isEmpty()  &&
                      theStack.peek() != ')' && 
                      Precedence(symbol) < Precedence(theStack.peek()) )
                {
                    addSym = theStack.pop();
                    outString += addSym; 
                }
                theStack.push(symbol);
            }

            // Handle open parenthesis
            if (symbol == '(')
            {  
                while (!theStack.isEmpty() && theStack.peek() != ')')
                {
                    addSym = theStack.pop();
                    outString += addSym; 
                }
                theStack.pop();
            } 
        }
      
        // Handle remaining stack (if necessary)
        while(!theStack.isEmpty())
        {
            addSym = theStack.pop();
            outString += addSym; 
        } 

        outString = reverse(outString);

        return outString;
    }

    /*****************************************************************/
    // This method receives a String object, reverses it, and returns
    // it as a String.
    /*****************************************************************/
    String reverse (String inStr)
    {
        StringBuilder temp = new StringBuilder(inStr);
        temp = temp.reverse(); 
        String outStr = new String(temp);
        return outStr;
    }

    /*****************************************************************/
    // Deterimine if a char is an arithmetic operator.
    public boolean anOperator (char charVal)
    {
        if (charVal == '*' || charVal == '/' ||
            charVal == '+' || charVal == '-')
            return true;
        else
            return false;
    }

    /*****************************************************************/
    // Deterimine if a char is a variable.
    public boolean aVariable (char charVal)
    {
        if ((charVal >= 65 && charVal <= 90) ||
            (charVal >= 97 && charVal <= 122))
            return true;
        else
            return false;
    }

    /*****************************************************************/
    // Define multiplication/division as a higher precedence (returning 2)
    // than addition/substraction (returning 1)
    public int Precedence (char charVal)
    {
        if (charVal == '*'|| charVal == '/')
            return 2;
        else if (charVal == '+'|| charVal == '-')
            return 1;
        else 
            return 0;
    }
    
    /*****************************************************************/
    // Return current expression as string
    public String toString ()
    {
        return expression;
    }
}

