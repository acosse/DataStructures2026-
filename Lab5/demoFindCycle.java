public class demoFindCycle{
	


public static void main(String[] args){

	SinglyLinkedList<String> myList = new SinglyLinkedList<>();

	SinglyLinkedList<String>.Node<String> head = myList.new Node<>("N1", null);


	SinglyLinkedList<String>.Node<String> node_Part1 = myList.new Node<>("N"+2, null);;

	myList.addLastNode(head); 
	myList.addLastNode(node_Part1);

	// first linear part

	for(int i=3; i<10; i++){

		node_Part1 = myList.new Node<>("N"+i, null);

		myList.addLastNode(node_Part1);



	}

	// add second linear part that loops back to the end of the first 
	// linear part (that is to say node_Part1) 


	SinglyLinkedList<String>.Node<String> node_Part2= myList.new Node<>("N"+10, null);;

	myList.addLastNode(node_Part2); 

	for(int i=11; i<20; i++){

		node_Part2 = myList.new Node<>("N"+i, null);

		myList.addLastNode(node_Part2);


	}





	

	SinglyLinkedList<String>.Node<String> node_between = myList.new Node<>("N20", null);

	myList.addBetweenNodes(node_between, node_Part2, node_Part1); 


	SinglyLinkedList<String>.Node<String> runningNode; 

	runningNode = head; 

	System.out.print(head.getElement()+ "  ");

	for(int i=0; i< myList.size()+10; i++){

		runningNode = runningNode.getNext();
		System.out.print(runningNode.getElement() + "  "); 



	}


	System.out.println(""); 
	System.out.println("Is there a cycle? [y]/[n] ?"); 


	System.out.print( (myList.isCycle()) ? "yes" : "no" ); 



}


	

	// 	System.out.print(myList.removeFirst()+ " ");
	// }















}