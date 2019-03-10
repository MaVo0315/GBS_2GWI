package my.math;

import java.util.Arrays;

public class MyMathProg {

	public static void main(String[] args) {
		int a = 0, b = 0, z = 0;
		MyMath math = new MyMath();
		MyIoUtils util = new MyIoUtils();

		String ans = "Y";
		while (ans.equalsIgnoreCase("Y")) {
			String op = util.readString("Operation kgv oder ggt oder ggtr oder arr?");
			if (!op.equals("arr")) {
				a = util.readPosInt("Zahl 1:");
				b = util.readPosInt("Zahl 2:");
			}
			switch (op) {
			case "ggt":
				z = math.calc_ggt(a, b);
				break;
			case "kgv":
				z = math.calc_kgV(a, b);
				break;
			case "ggtr":
				z = math.calc_ggtr(a, b);
				break;
			case "arr":
				int nbrOfValues = 4;
				double[] values = util.readValues("Werte: ", nbrOfValues);
				Double v = math.calcArithmeticMiddle(values);
				Double min = math.getMinValue(values);
				Double max = math.getMaxValue(values);
				math.sort(values, false);
				util.writeString(" Mittelwert: " + v.toString() + 
						         " Min: " + min.toString() +
				                 " Max: " + max.toString() +
				                 " sortiert: " + Arrays.toString(values));
				break;
			default:
				op = "Invalid operation: " + op;
				z = 0;
			}
			if (!op.equals("arr"))
				util.showResult(op, a, b, z);
			ans = util.readString("Weitere Berechnung Y / N ?");
		}
		util.writeString("und tschüss...");
	}

}
