package week1.day2;

import java.util.Arrays;

public class DuplicateValues {

	public static void main(String[] args) {
		int [] number = {22, 19, 82, 19, 45, 37, 22};
		int length = number.length;
		Arrays.sort(number);
		for (int i=0; i<length-1; i++) {
			if (number[i] == number[i+1]) {
				System.out.println("Repeated Value is" + " " +number[i]);
			}

		}

	}

}