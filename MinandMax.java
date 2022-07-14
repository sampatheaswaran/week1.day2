package week1.day2;

import java.util.Arrays;

public class MinandMax {

	public static void main(String[] args) {
		int [] number = {22, 3981, -19, 82, 0, 45, 37};
		int length = number.length;
		Arrays.sort(number);
		System.out.println("Minimun Value is :" + number[0]);
		System.out.println("Maximum Value is :" + number[length-1]);

	}

}