package my.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class MyIoUtils {

	/**
	 * Reads positive integer from console
	 * 
	 * @param prompt: text to show
	 * @return positive integer value
	 */
	public int readPosInt(String prompt) {
		int z;
		String s;
		do {
			s = readString(prompt);
			try {
				z = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				z = 0;
			}
		} while (z <= 0);
		return z;
	}

	/**
	 * Show result on console
	 * 
	 * @param op Operation
	 * @param a  first argument
	 * @param b  second argument
	 * @param c  result
	 */
	public void showResult(String op, int a, int b, int c) {
		System.out.printf("%s von %d und %d ist %d\n", op, a, b, c);
	}

	/**
	 * reads string from console
	 * 
	 * @param prompt text to show
	 * @return string
	 */
	public String readString(String prompt) {
		try {
			System.out.println(prompt);
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		} catch (IOException e) {
			return "IO-Error";
		}
	}

	/**
	 * writes text to console
	 * 
	 * @param msg : text to show
	 */
	public void writeString(String msg) {
		System.out.println(msg);

	}

	/**
	 * reads nbrOfValues into Array
	 * 
	 * @param prompt      text to show
	 * @param nbrOfValues number of values to read
	 * @return array of values
	 */
	public double[] readValues(String prompt, int nbrOfValues) {
		double[] values = new double[nbrOfValues];
		for (int i = 0; i < nbrOfValues; i++) {
			String s = readString("Zahl: ");
			try {
				values[i] = Double.parseDouble(s);
			} catch (NumberFormatException e) {
				values[i] = 0;
			}
		}
		return values;
	}

	/**
	 * writes values of array to console
	 * @param values
	 */
	public void writeValues(double[] values) {
		System.out.println(Arrays.toString(values));
	}
}
