//3rd commit is just to see if my name is attached to commit

//made a new helper method called arrayAsString which turns the array
//into a string so I can tell the user what the values in their arrays are.
//This is usually called a 'toString' method, but normally it would be in a separate class called Array
//I am going to ask if it is better to do the array as a separate class with a toString method

import java.util.Scanner;

public class CopyAnArray
{
	public static void main(String[] args)
	{
	int[] firstArray = makeArray();
	System.out.println("The first array is: " + arrayAsString(firstArray));
	int[] secondArray = makeArray();
	System.out.println("The second array is: " + arrayAsString(secondArray));
	ArrayCopier.copyArray(firstArray , secondArray);
	System.out.println ("The second array is now: " + arrayAsString(secondArray));
	}
	
	
	private static int[] makeArray()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println ("Enter the size of your next array: ");
		int arraySize = scanner.nextInt();
		int[] thisArray = new int[arraySize];
		int pos = 1;
		for (int i = 1 ; i <=arraySize; i++)
		{
			System.out.println ("Enter the number for position " + pos + ": ");
			thisArray[i-1] = scanner.nextInt();
			pos++;
		}
		return thisArray;
	}
	
	private static String arrayAsString(int[] thisArray)
	{
		String arrayAsString = "( ";
		for (int i = 0; i<= thisArray.length -1 ; i++)
			arrayAsString += thisArray[i] + " , ";
		arrayAsString += ")";
		return arrayAsString;
	}
}