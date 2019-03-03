package my.math;

import java.util.Arrays;

public class MyMath {

	/**
	 * calculates ggT of two integer values
	 * 
	 * @param a first argument
	 * @param b second argument
	 * @return result
	 */
	public int calc_ggt(int a, int b) {
		int z;
		while (b != 0) {
			z = a % b;
			a = b;
			b = z;
		}
		return a;
	}

	/**
	 * calculates kgV of two integer values
	 * 
	 * @param a first argument
	 * @param b second argument
	 * @return result
	 */
	public int calc_kgV(int a, int b) {
		int z = calc_ggt(a, b);
		return a * b / z;
	}

	/**
	 * calculates ggT of two integer values implemented recursive
	 * 
	 * @param a first argument
	 * @param b second argument
	 * @return result
	 */
	public int calc_ggtr(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return calc_ggtr(b, a % b);
		}
	}

	/**
	 * calculates arithmetic middle of values
	 * 
	 * @param values
	 * @return result
	 */
	public double calcArithmeticMiddle(double[] values) {
		int nbrOfValues = values.length;
		double summ = 0;
		for (double value : values) {
			summ += value;
		}
		return summ / nbrOfValues;
	}

	/**
	 * gets highest value in values
	 * 
	 * @param values
	 * @return result
	 */
	public double getMaxValue(double[] values) {
		double maxValue = values[0];
		for (double value : values) {
			if (value > maxValue)
				maxValue = value;
		}
		return maxValue;
	}

	/**
	 * gets smallest value in values
	 * 
	 * @param values
	 * @return result
	 */
	public double getMinValue(double[] values) {
		double minValue = values[0];
		for (double value : values) {
			if (value < minValue)
				minValue = value;
		}
		return minValue;
	}

	/**
	 * sort values in array
	 * 
	 * @param values
	 * @param ascending
	 */
	public void sort(double[] values, boolean ascending) {
		Arrays.sort(values);
		if (!ascending) {
			reverse(values);
		}
	}
	
	/**
	 * reverse values in array
	 * @param values
	 */
	public void reverse(double[] values) {
		for (int i = 0, j = values.length - 1; i < values.length / 2; i++, j--) {
			double f = values[i];
			values[i] = values[j];
			values[j] = f;
		}
	}

	//java function parameters are always called by value
	// - elementary types cannot be passed to function as reference
	// - for objects the reference to the object is passed as values, 
	//   so the object itself van be modified inside the function, 
	//   but not assigned to an other object.

	//does not work because of assigning called by value object reference
	public void reverse1(double[] values) {
		double revValues[] = new double[values.length];
		for (int i = 0, j = values.length - 1; i < values.length / 2; i++, j--) {
			revValues[i] = values[j];
			revValues[j] = values[i];
		}
		values = revValues;  //assigning to called by value reference
	}
	
	//does not work because of passing elementary type by value
	public void reverse2(double[] values) {
		for (int i = 0, j = values.length - 1; i < values.length / 2; i++, j--) {
			swapp2(values[i], values[j]);  //call with elementary types double
		}
	}


	//does work because of passing object reference by value
	public void reverse3(double[] values) {
		for (int i = 0, j = values.length - 1; i < values.length / 2; i++, j--) {
			Double d = Double.valueOf(values[i]);
			Double e = Double.valueOf(values[j]);
			swapp3(d, e);  //call with references to Double Object
			values[i] = e;
			values[j] = d;
		}
	}

	//does not work because of passing elementary type by value
	private void swapp2(double d, double e) {
		double f = d;
		d = e;
		e = f;
	}

	//does work because of passing object reference by value
	private void swapp3(Double d, Double e) {
		Double f = d;
		d = e;
		e = f;
	}

}
