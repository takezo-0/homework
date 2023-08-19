//Delta College - CST 183 - Homework 2
// LineFun Class Test Driver 3
// Name:

public class TestLinFun
{
    public static void main( String args[] )
    {
        // Test no-arg constructor
        LinFun function1 = new LinFun();
        System.out.println(function1);

        // Test setters, toString(), and calculation
        function1.setM(5.0);
        function1.setB(3.0);
        System.out.println(function1);
        System.out.println(function1.calcY(7));

        // Test parameterized constructor
        LinFun function2 = new LinFun(4.0,2.0);
        System.out.println(function2);

        // Build (x,y) table using function2
        System.out.println(" x      y");
        for (double x = 0; x <= 10; x+=2.0)
            System.out.println(x + "   " + function2.calcY(x));
    }
}  

