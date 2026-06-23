public class clearStackSolution{



public static <E> void clearAll(ArrayStack<E> myStack){


	while(!myStack.isEmpty()){

		myStack.pop();


	}
	

	



}

public static void main(String[] args){
	
	ArrayStack<Integer> myStack1 = new ArrayStack<>(20);

	ArrayStack<Integer> myStack2 = new ArrayStack<>(20);


	myStack1.push(10);
	myStack1.push(8);
	myStack1.push(6);
	myStack1.push(4);
	myStack1.push(2);

	myStack2.push(10);
	myStack2.push(8);
	myStack2.push(6);
	myStack2.push(4);
	myStack2.push(2);


	System.out.println("Displaying content of stack before clear");
	while(!myStack1.isEmpty()){

	System.out.println(myStack1.pop());

	}

	clearAll(myStack2);

	System.out.println("Displaying content of stack after clear"); 

	while(!myStack2.isEmpty()){
	System.out.println(myStack2.pop());

	}






}

	





}