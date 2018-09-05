public class Practice2
{
	public static void insertionSort (int[] numbers)
	{
		for (int i = 1; i < numbers.length; i++)
		{
			int key = numbers[i];
			int position = i;
			while (position > 0 && numbers[position-1] > key)
			{	numbers[position] = numbers[position-1]; position--;
			}
			numbers[position] = key;
		}
	}
	public static void jollySort (int[] numbers)
	{
		int temp;
		for (int i = 1; numbers.length - i > 1; i += 2)
		{
			temp = numbers[i+1];
			numbers[i+1] = numbers[i];
			numbers[i] = temp;
		}
	}
	public static void main (String[] args)
	{
		int[] myArray = {1, 2, 4, 5, 6, 3, 10, 9, 7, 8,
						13, 14, 12, 11, 15, 18, 17, 16,
						19, 22, 25, 34, 28, 32, 38};
		insertionSort(myArray);
		jollySort(myArray);
		for (int i = 0; i < myArray.length; i++)
			System.out.println(myArray[i]);
	}
}
