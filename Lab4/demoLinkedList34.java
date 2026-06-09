public class demoLinkedList34{
	
	public static void main(String[] args){

	SinglyLinkedList<String> myList = new SinglyLinkedList<>();


	System.out.println("(1) Content based insertion"); 


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


	myList.add_after("in", "the course"); 


	while(!myList.isEmpty()){

		System.out.print(myList.removeFirst() +" ");

	}

	System.out.println("");

	System.out.println("(2) Index based insertion");

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



	myList.add_after_indexBased(9, "the course"); 

	while(!myList.isEmpty()){

		System.out.print(myList.removeFirst() +" ");

	}


	System.out.println(""); 
	System.out.println("Solution to Question 3.5"); 


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


	myList.add_after("in", "the course"); 


	Object[] List2array = myList.to_array();

	// String[] sArray = new String[List2array.length];

	// sArray = (String[]) List2array; 

	for(int i=0; i<List2array.length; i++){

		System.out.print(List2array[i]+" ");

	}

	System.out.println("");
	System.out.println("Solution to Exercise 3.6");


	int temp = myList.find("NYU"); 

	System.out.println(temp);

	int temp2 = myList.find("Bob"); 












}}
