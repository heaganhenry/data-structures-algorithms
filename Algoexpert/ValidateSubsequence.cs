// # Given two non-empty arrays of integers, write a function that determines whether the second array is a subsequence of the first one.

using System;
using System.Collections.Generic;

public class Program 
{
	public static bool IsValidSubsequence(List<int> array, List<int> sequence) 
	{
		int i = 0, j = 0;
		
		while (i < array.Count && j < sequence.Count)
		{
			if (array[i] == sequence[j])
				j++;
			i++;
		}
		
		return j == sequence.Count;
	}
}