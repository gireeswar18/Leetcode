package leetcode;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] arr1 = new int[]{0};
        int[] arr2 = new int[]{1};

        MergeSortedArray m = new MergeSortedArray();
        m.merge(arr1, 0, arr2, 1);

        System.out.println(Arrays.toString(arr1));
    }

    public void merge(int[] arr1, int m, int[] arr2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0)
        {
            if (arr1[i] > arr2[j])
            {
                arr1[k] = arr1[i];
                i--;
            }
            else
            {
                arr1[k] = arr2[j];
                j--;
            }
            k--;
        }

        while (j >= 0)
        {
            arr1[k] = arr2[j];
            j--;
            k--;
        }

    }
}
