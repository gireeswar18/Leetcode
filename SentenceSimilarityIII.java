package leetcode;

public class SentenceSimilarityIII {
	public static void main(String[] args) {
//		String s1 = "A a a a A A A";
//		String s2 = "A A a a a";
		
		String s1 = "A B C";
		String s2 = "A";
		
		System.out.println(areSentencesSimilar(s1, s2));
	}
	
	public static boolean areSentencesSimilar(String sentence1, String sentence2) {
		String[] arr1 = sentence1.split(" ");
		String[] arr2 = sentence2.split(" ");
		
		int left1 = 0, left2 = 0;
		int right1 = arr1.length - 1, right2 = arr2.length - 1;
		boolean flag = true;
		
		while (left1 < arr1.length && left2 < arr2.length) {
			if (arr1[left1].equals(arr2[left2])) {
				left1++;
				left2++;
			}
			else {
				left1--;
				left2--;
				flag = false;
				break;
			}
		}
		
		if (flag) {
			left1--;
			left2--;
		}
		flag = true;
		
		while (right1 >= 0 && right1 > left1 && right2 >= 0 && right2 > left2) {
			if (arr1[right1].equals(arr2[right2])) {
				right1--;
				right2--;
			}
			else {
				right1++;
				right2++;
				flag = false;
				break;
			}
		}
		
		if (flag) {
			right1++;
			right2++;
		}
				
		System.out.println("Left1: " + left1);
		System.out.println("Left2: " + left2);
		System.out.println("Right1: " + right1);
		System.out.println("Right2: " + right2);
		
		return (right1 - 1 == left1 || right2 - 1 == left2);
		
    }
}
