package Model;

public class Validate {

	public static boolean isLevelFinished(int[] arr, int[] result)
	{
		for(int i = 0 ; i < arr.length ; i++)
		{
			if(arr[i] != result[i])
			{
				return false;
			}
			else if (i == arr.length - 1 && arr[i] == result[i]) 
			{
				return true;
			}
		}
		return true;
	}
}
