package my.stack;

/**
 * MyStack - Klasse implementiert mit statischem Array
 * Grösse wird in Konstruktor definiert
 * 
 * @author MaVoAdmin
 *
 */
public class MyStack {

	private int[] data;
	private int sp;

	public MyStack(int size) {
		data = new int[size];
		sp = 0;
	}

	public void clear() {
		sp = 0;
	}

	public Boolean isEmpty() {
		return (sp == 0);
	}

	public int pop() throws Exception {
		if (sp > 0) {
			return data[--sp];
		} else
			throw new Exception("Stack Underflow");
	}

	public void push(int val) {
		data[sp++] = val;
	}

	public void swappXY() throws Exception {
		if (sp >= 2) {
			int c = data[0];
			data[0] = data[1];
			data[1] = c;
		} else
			throw new Exception("Stack less then 2 Elements");
	}

	public String toString() {
		String s = "Stack: ";
		for (int i = 0; i < sp; i++) {
			s += data[i] + " ";
		}
		return s;
	}

}
