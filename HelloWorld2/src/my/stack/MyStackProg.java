package my.stack;

public class MyStackProg {

	public static void main(String[] args) {

		System.out.println("Hello from Java");

		try {
			final int STACK_SIZE = 5;
			MyStack myStack = new MyStack(STACK_SIZE);

			for (int i = 0; i < STACK_SIZE; i++) {
				myStack.push(i);
				printStack(myStack);
			}

			while (!myStack.isEmpty()) {
				printStack(myStack);
				myStack.pop();
			}

			myStack.clear();
			myStack.push(100);
			myStack.push(200);
			printStack(myStack);
			myStack.swappXY();
			printStack(myStack);

			myStack.clear();
			printStack(myStack);
			myStack.push(100);
			printStack(myStack);
			myStack.pop();
			printStack(myStack);

			myStack.clear();
			myStack.pop();
			
			myStack.clear();
			myStack.push(100);
			//myStack.push(200);
			myStack.swappXY();
			printStack(myStack);
		}

		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	static private void printStack(MyStack stack) {
		System.out.println(stack.toString());
	}

}
