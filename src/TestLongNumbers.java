// Delta College - CST 283 - Klingler                  
// This application demonstrates addition of two long integer
// objects for very long numbers.

public class TestLongNumbers
{
    public static void main(String [] args)
    {
        LongInteger number1 = new LongInteger("2");
        // LongInteger number1 = new LongInteger("bignumber1.txt");

        LongInteger number2 = new LongInteger("4");
        // LongInteger number2 = new LongInteger("bignumber2.txt");

        LongInteger sum = number1.addTo(number2);         // Add the numbers
        System.out.println(sum);         // Write the sum



        number1 = new LongInteger("42");
        number1 = new LongInteger("69");
        System.out.println(number1.addTo(number2));


        number1 = new LongInteger("5849393859403");
        number2 = new LongInteger("32894929048953");
        System.out.println(number1.addTo(number2));


        number1 = new LongInteger("3534");
        number2 = new LongInteger("49040594939304049595959403030394595495495959549493030303049494");
        System.out.println(number1.addTo(number2));


    }
}