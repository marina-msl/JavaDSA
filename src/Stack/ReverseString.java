package Stack;

public class ReverseString {
	
	
	
//	   A simple way to reverse an String without using stack
//	   public static String reverseString(String s) {
//	        
//	        return new StringBuilder(s).reverse().toString();        
//	    }
	
	
	
	public static String reverseString(String s) {
		
		StackWithArray<Character> stack = new StackWithArray<Character>();
		
		for (char c : s.toCharArray()) {
			stack.push(c);
		}
		
		String reversed = "";
		
		
		while (!stack.isEmpty()) {
			reversed += stack.pop();
		}
		
		return reversed;
	}
	
	
	public static void main(String[] args) {
        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */
	}

}
