public class demoMergedLists{
	

	public static void main(String[] args){

	SinglyLinkedList<String> myFirstList = new SinglyLinkedList<>();

	SinglyLinkedList<String>.Node<String> head1 = myFirstList.new Node<>("A1", null);

	SinglyLinkedList<String>.Node<String> node_Part1A = myFirstList.new Node<>("A"+2, null);;

	myFirstList.addLastNode(head1); 
	myFirstList.addLastNode(node_Part1A);


	for(int i=3; i<10; i++){

		node_Part1A = myFirstList.new Node<>("A"+i, null);

		myFirstList.addLastNode(node_Part1A);



	}


	SinglyLinkedList<String> mySecondList = new SinglyLinkedList<>();

	SinglyLinkedList<String>.Node<String> head2 = mySecondList.new Node<>("B1", null);

	SinglyLinkedList<String>.Node<String> node_Part1B = mySecondList.new Node<>("B"+2, null);

	mySecondList.addLastNode(head2); 
	mySecondList.addLastNode(node_Part1B);


	for(int i=3; i<10; i++){

		node_Part1B = mySecondList.new Node<>("B"+i, null);

		mySecondList.addLastNode(node_Part1B);



	}

		SinglyLinkedList<String>.Node<String> node_Part1C = mySecondList.new Node<>("C"+1, null);;


		myFirstList.addLastNode(node_Part1C);
		mySecondList.addLastNode(node_Part1C);


		for(int i=2; i<10; i++){

		node_Part1C = mySecondList.new Node<>("C"+i, null);

		myFirstList.addLastNode(node_Part1C);
		mySecondList.addLastNode(node_Part1C);



	}


	System.out.println(" "); 
	System.out.println("Printing first list"); 


	SinglyLinkedList<String>.Node<String> runningNode1;
	SinglyLinkedList<String>.Node<String> runningNode2; 
	runningNode1 = myFirstList.head; 
	runningNode2 = mySecondList.head; 

	System.out.print(runningNode1.getElement()+ "  ");


	for(int i=0; i< myFirstList.size(); i++){

		
		System.out.print(runningNode1.getElement() + "  "); 
		runningNode1 = runningNode1.getNext();


	}

	System.out.println(" "); 
	System.out.println("Printing second list"); 

	System.out.print(runningNode2.getElement()+ "  ");

	for(int i=0; i< mySecondList.size(); i++){

		
		System.out.print(runningNode2.getElement() + "  "); 
		runningNode2 = runningNode2.getNext();


	}


	System.out.println("Is there any intersection between the two lists: [y]/[n]?");


	System.out.println((myFirstList.ListMerge(mySecondList)) ? "yes" : "no");



















}

}