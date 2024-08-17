package leetcode;

import java.util.Arrays;

public class ConvertTheTemperature {
	public static void main(String[] args) {

		double c = 36.50;
		
		System.out.println(Arrays.toString(convertTemperature(c)));
		
	}

	public static double[] convertTemperature(double celsius) {

		return new double[] {celsius + 273.15, celsius * 1.80 + 32.00};
		
	}
}
