// This program performs some manipulations of bits.
// Demonstration uses 8-bit 'byte' variables.

public class TestBits
{
	public static void main(String args[]) 
	{
		// Build and display test bit set 1
		int bitString1 = (int)0b10110111;
		System.out.println(writeBitString(bitString1));

		// Turn off bit at position 5
		bitString1 = turnOffBit(bitString1,5);
		System.out.println(writeBitString(bitString1));

		System.out.println();   // Blank line

		// Build and display test bit set 2
		int bitString2 = (int)0b01011001;
		System.out.println(writeBitString(bitString2));

		// Turn on bit at position 2
		bitString2 = turnOnBit(bitString2,2);
		System.out.println(writeBitString(bitString2));
	}

	// This method receives an integer and toggles ON the bit in a given position
	// Position numbers are zero-based and started from the "right".
	public static int turnOnBit(int bitStr, int pos)
	{
		return bitStr;    // This is incomplete and only so far returns the input parameter
	}

	// This method receives an integer and toggles OFF the bit in a given position
	// Position numbers are zero-based and started from the "right".
	public static int turnOffBit(int bitStr, int pos)
	{
		return bitStr & ~(1 << pos);
	}

	// This method receives a bit string (stored within an integer) and
	// displays the first 8 bits (from the right) as a String.
	public static String writeBitString(int bitVal)
	{
		int digit;
		String outBitString = "";

		for (int ex = 7; ex >= 0; ex--)
		{
			digit = bitVal / (int)Math.pow(2.0, ex);  // Divide by current power of 2
			outBitString += digit;
			bitVal = (byte)(bitVal % (int)Math.pow(2.0, ex));     // Reset number to remainder
			// after extracting power of 2
		}
		return outBitString;
	}
}

