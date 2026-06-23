public class stackCloneDemo{
	

	public static void main(String[] args){


		ArrayStack<String> myStack = new ArrayStack<>();


		myStack.push("Data Structures");
		myStack.push("to");
		myStack.push("Introduction");
		myStack.push("CSCI-UA 9102");
		myStack.push("NYU");
		myStack.push("to");
		myStack.push("Welcome");
		
		
		System.out.println("Emptying copy");

		// Creating deep copy.
		ArrayStack<String> myShallowCopy = myStack.clone();

		while(!myShallowCopy.isEmpty()){

			System.out.println(myShallowCopy.pop());

		}

		System.out.println("Emptying original stack");

		while(!myStack.isEmpty()){

			System.out.println(myStack.pop());

		}





	}






}