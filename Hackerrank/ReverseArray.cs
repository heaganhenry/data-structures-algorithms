// Reverse an array of integers

public class Result
{
    public static int[] ReverseArray(int[] array)
    {
        var revArray = new int[array.Length];
        for (int i = 0; i < array.Length; i++)
            revArray[i] = array[array.Length - 1 - i];

        return revArray;
    }
}
