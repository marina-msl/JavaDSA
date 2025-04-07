package Stack;

import java.util.ArrayList;

public class StackWithArray<T> {
	
	private ArrayList<T> stackList = new ArrayList<>();
	
	public ArrayList<T> getStackList() {
		return stackList;
	}
	
	public void printStackList() {
		for (int i = stackList.size() - 1; i >= 0 ; i --) {
			System.out.println(stackList.get(i));
		}
	}
	
	public boolean isEmpty() {
		return stackList.size() == 0;
	}
	
	public T peek() {
		if(isEmpty()) {
			return null;
		} else {
			return stackList.get(stackList.size() - 1);
		}
	}
	
	public int size() {
		return stackList.size();
	}
	
	/** The challenge was to implement a push method for the stack, it was made 
	 *  with an Array using generics instead of a LinkedList.
	 *  Really simple, only add the value in the Array.
	 * @param value
	 */
	public void push(T value) {
		stackList.add(value);
	}
	
	/** The challenge was to implement a pop method for the stack,
	 * 	so important to check if the size is zero, and return null.
	 *  and then, return the end value of the stack.
	 * @return
	 */
	public T pop() {
		if(stackList.size() == 0) return null;
		
		return stackList.remove(stackList.size() - 1);
	}
}
