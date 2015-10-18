public class ArrayCopier
{
	public int[] copyArray( int[] src , int[] dst )
	{
		if (dst.length() <= src.length())
			for (int i = 0 ; i = dst.length() - 1; arrayPos++)
				dst[arrayPos]  = src[arrayPos];
		else
			for (int i = 0 ; i = src.length() - 1; arrayPos++)
				dst[arrayPos]  = src[arrayPos];
			for (int arrayPos = src.length; arrayPos = dst.length()-1; arrayPos++)
				dst[arrayPos] = 0;
	}
}
			
			