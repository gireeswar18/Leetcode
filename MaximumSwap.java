package leetcode;

import java.util.*;

public class MaximumSwap {
	public static void main(String[] args) {
		int num = 1993;
		
		System.out.println(maximumSwap2(num));
	}
	public static int maximumSwap(int num) {
	    char[] arr = Integer.toString(num).toCharArray();
	    if (arr.length == 1) return num;

	    int n = arr.length;
	    Queue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] == a[0] ? b[1] - a[1] : b[0] - a[0]);

	    for (int i = 0; i < n; i++) {
	        maxHeap.add(new int[]{arr[i] - '0', i});
	    }

	    for (int i = 0; i < n; i++) {
	        while (!maxHeap.isEmpty() && maxHeap.peek()[1] <= i) {
	            maxHeap.poll();
	        }
	        
			if (maxHeap.isEmpty())
				break;

	        int[] peek = maxHeap.peek();
	        if (arr[i] - '0' < peek[0]) {
	            char t = arr[i];
	            arr[i] = (char) (peek[0] + '0');
	            arr[peek[1]] = t;
	            break;
	        }
	    }

	    return Integer.parseInt(String.valueOf(arr));
	}
	
	public static int maximumSwap2(int num) {
		char[] arr = Integer.toString(num).toCharArray();
	    if (arr.length == 1) return num;

	    int n = arr.length;
	    
	    int[] lastOccurence = new int[10];
	    for (int i = 0; i < n; i++) {
	    	lastOccurence[arr[i] - '0'] = i;
	    }
	    
	    System.out.println(Arrays.toString(lastOccurence));
	    
	    for (int i = 0; i < n; i++) {
	    	for (int j = 9; j > arr[i] - '0' ; j--) {
	    		if (lastOccurence[j] > i) {
	    			char t = arr[i];
	    			arr[i] = arr[lastOccurence[j]];
	    			arr[lastOccurence[j]] = t;
	    			return Integer.parseInt(String.valueOf(arr));
	    		}
	    	}
	    }
	    
	    return num;
	}
}
