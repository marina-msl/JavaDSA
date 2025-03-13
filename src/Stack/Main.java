package Stack;

public class Main {
	
	public static void main(String[] args) {
		
		Stack myStack = new Stack(1);
		
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		
		myStack.printStack();

		System.out.println("Poping Node: " + myStack.pop().value);
		
		myStack.printStack();
		
		System.out.println("Second stack");
		Stack mySecondStack = new Stack(1);
		System.out.println("Printing second stack");
		mySecondStack.printStack();
		mySecondStack.pop();
		
		System.out.println("Printing empty second stack");
		mySecondStack.printStack();
		mySecondStack.pop();		
	}
}
