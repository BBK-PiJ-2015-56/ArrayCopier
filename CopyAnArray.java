java.util.Scanner;

public class CopyAnArray
{
	public static void main(String[] args)
	{
	int[] firstArray = makeArray();
	int[] secondArray = makeArray();
	ArrayCopier.copyArray(firstArray , secondArray);
	}
	
	
	private static int[] makeArray()
	{
		println ("Enter the size of your next array")
		int arraySize = scanner.nextInt()
		int[] thisArray = new int[arraySize];}
		int pos = 1;
		for (int i = 1 ; i <=arraySize; i++)
		{
			println (Enter the number for the " + pos + " position: ")
			thisArray[i-1] = scanner.nextInt();
			pos++;
		}
		return thisArray;
	}
}