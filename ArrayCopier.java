//solved some basic errors

public class ArrayCopier
{
	public static int[] copyArray( int[] src , int[] dst )
	{
		if (dst.length <= src.length)                 
        // error solved- couldn't find symbol dst.length() because there should not be () after length.
		{
			for (int i = 0 ; i <= dst.length - 1; i++)
				dst[i]  = src[i];
		}
		else 
		{
			for (int i = 0 ; i <= src.length - 1; i++)
				dst[i]  = src[i];
			for (int i = src.length; i <= dst.length-1; i++)
				dst[i] = 0;
		}
		return dst;
	}
}
			
			