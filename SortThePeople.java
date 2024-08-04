package leetcode;

import java.util.Arrays;

public class SortThePeople {
	public static void main(String[] args) {
//		String[] name = { "Mary", "John", "Emma" };
//		int[] height = { 180, 165, 170 };
		
//		String[] name = { "Alice","Bob","Bob" };
//		int[] height = { 155,185,150 };
		
		String[] name = {"IEO","Sgizfdfrims","QTASHKQ","Vk","RPJOFYZUBFSIYp","EPCFFt","VOYGWWNCf","WSpmqvb"};
		int[] height = { 17233,32521,14087,42738,46669,65662,43204,8224 };
		
		String[] res = new SortThePeople().sortPeople(name, height);
		
		System.out.println(Arrays.toString(res));
	}

	public String[] sortPeople(String[] names, int[] heights) {
		
		
		mergeSort(heights, 0, heights.length - 1, names);
		
		int i = 0;
		int j = names.length - 1;
		
		while (i < j)
		{
			String temp = names[i];
			names[i] = names[j];
			names[j] = temp;
			i++;
			j--;
		}
		
		return names;
	}
	
	private static void mergeSort(int[] heights, int start, int end, String[] names)
	{
		if (start == end)
		{
			return;
		}
		int mid = (start + end) / 2;
		mergeSort(heights, start, mid, names);
		mergeSort(heights, mid + 1, end, names);
		
		merge(heights, start, mid, end, names);
	}
	
	private static void merge(int[] arr, int start, int mid, int end, String[] names)
	{
		int[] mergeTemp = new int[end - start + 1];
		String[] namesTemp = new String[end - start + 1];
		
		int i = start;
		int j = mid + 1;
		int ind = 0;
		
		while (i <= mid && j <= end)
		{
			if (arr[i] < arr[j])
			{
				mergeTemp[ind] = arr[i];
				namesTemp[ind] = names[i];
				i++;
			}
			else
			{
				mergeTemp[ind] = arr[j];
				namesTemp[ind] = names[j];
				j++;
			}
			ind++;
		}
		
		while (i <= mid)
		{
			mergeTemp[ind] = arr[i];
			namesTemp[ind] = names[i];
			ind++;
			i++;
		}
		while (j <= end)
		{
			mergeTemp[ind] = arr[j];
			namesTemp[ind] = names[j];
			ind++;
			j++;
		}
		
		ind = 0;
		for (int k = start; k <= end; k++)
		{
			arr[k] = mergeTemp[ind];
			names[k] = namesTemp[ind];
			ind++;
		}
	}
}
