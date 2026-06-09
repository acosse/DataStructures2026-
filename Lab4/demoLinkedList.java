public class demoLinkedList{
	
	public static void main(String[] args){

	SinglyLinkedList<String> myList = new SinglyLinkedList<>();

	myList.addFirst("Bonjour"); 


	myList.addLast("Welcome");

	myList.addLast("to");

	myList.addLast("NYU");

	myList.addLast("We");

	myList.addLast("are");

	myList.addLast("happy");

	myList.addLast("to have");

	myList.addLast("you");

	myList.addLast("in");

	myList.addLast("CSCI-UA 9102");




	System.out.println("Returning second to last node");

	System.out.println(myList.second2Last());		


	while(myList.size()>0){

		System.out.print(myList.first()+ " ");

		myList.removeFirst( );

	}

	System.out.println();


	// re-adding the nodes to myList

	myList.addFirst("Bonjour"); 


	myList.addLast("Welcome");

	myList.addLast("to");

	myList.addLast("NYU");

	myList.addLast("We");

	myList.addLast("are");

	myList.addLast("happy");

	myList.addLast("to have");

	myList.addLast("you");

	myList.addLast("in");

	myList.addLast("CSCI-UA 9102");


	SinglyLinkedList<String> L2 = new SinglyLinkedList<>();

	L2.addLast("We");

	L2.addLast("hope");

	L2.addLast("that");
	L2.addLast("you");
	L2.addLast("will");


	L2.addLast("enjoy");
	L2.addLast("the");
	L2.addLast("class");

	myList.append(L2);


	while(myList.size()>0){

		System.out.print(myList.first()+ " ");

		myList.removeFirst( );

	}

	System.out.println();



	/* Just as a demo for the throwing of the exception
	when types are not matching */

	// myList.addFirst("Bonjour"); 


	// myList.addLast("Welcome");

	// myList.addLast("to");

	// myList.addLast("NYU");

	// myList.addLast("We");

	// myList.addLast("are");

	// myList.addLast("happy");

	// myList.addLast("to have");

	// myList.addLast("you");

	// myList.addLast("in");

	// myList.addLast("CSCI-UA 9102");


	// SinglyLinkedList<Double> L3 = new SinglyLinkedList<>();

	// L3.addLast(9.1);

	// L3.addLast(0.2);

	// L3.addLast(2026.0);

	// myList.append(L3); 

	// System.out.println("testing with non matching types");



	myList.addFirst("Bonjour"); 


	myList.addLast("Welcome");

	myList.addLast("to");

	myList.addLast("NYU");

	myList.addLast("We");

	myList.addLast("are");

	myList.addLast("happy");

	myList.addLast("to have");

	myList.addLast("you");

	myList.addLast("in");

	myList.addLast("CSCI-UA 9102");


	System.out.println("Printing list in reverse order");

	while(myList.size()>0){

		System.out.print(myList.last()+ " ");

		myList.removeLast( );

	}

	System.out.println();





}











}