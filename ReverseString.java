package week1.day2;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class ReverseString {

	public static void main(String[] args) {
		String sName = "Hello";
		System.out.println(sName);
		char[] chars = sName.toCharArray();

		for (int i = chars.length-1; i>=0; i--) {
			System.out.print(chars[i]);

		}
	}

}