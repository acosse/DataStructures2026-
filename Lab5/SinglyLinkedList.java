public class SinglyLinkedList<E> {
//------- nested Node class --------
public class Node<E> {
private E element;
// reference to the element stored at this node
private Node<E> next;
// reference to the subsequent node in the list
public Node(E e, Node<E> n) {
element = e;
next = n;
}
public E getElement( ) { return element; }
public Node<E> getNext( ) { return next; }
public void setNext(Node<E> n) { next = n; }}


public Node<E> head = null; // head node
private Node<E> tail = null; // last node
private int size = 0; // number of nodes
public SinglyLinkedList( ) { } // initialize list
// access methods
public int size( ) { return size; }
public boolean isEmpty( ) { return size == 0; }
public E first( ) { // returns first element
if (isEmpty( )) return null;
return head.getElement( );
}
public E last( ) {
// returns (but does not remove) the last element
if (isEmpty( )) return null;
return tail.getElement( );
}

public void addFirst(E e) { // adds element e to the front
head = new Node<>(e, head); // create and link new node
if (size == 0)
tail = head; // special case: new node becomes tail
size++;}
public void addLast(E e) { // adds element e to the end
Node<E> newest = new Node<>(e, null);
// node will eventually be the tail
if (isEmpty( ))
head = newest; // special case: previously empty list
else
tail.setNext(newest); // new node after existing tail
tail = newest; // new node becomes the tail
size++;
}


public E removeFirst( ) { // removes and returns first element
if (isEmpty( )) return null; // nothing to remove
E answer = head.getElement( );
head = head.getNext( );
// will become null if list had only one node
size--;
if (size == 0)
tail = null; // special case as list is now empty
return answer;}



public void addBetweenNodes(Node<E> n, Node<E> previous, Node<E> next){


	if (isEmpty( ))
		head = n; // special case: previously empty list
	else{
	n.setNext(next);
	previous.setNext(n);}

	size++;


}

public void addLastNode(Node<E> n){

	
	if (isEmpty( ))
		head = n; // special case: previously empty list
	else{
		tail.setNext(n); 
		}		
	tail = n; // new node becomes the tail
	
	size++;


}







public boolean isCycle(){


	Node<E> node1 = head;
	Node<E> node2 = head;

	if(node1 == null || node1.getNext() == null){

		return false;

	}

	while(node1!=null && node2.getNext()!=null){

		node1 = node1.getNext();
		node2 = node2.getNext().getNext();


		if (node1 == node2){

			// cycle found
			return true;

		}



	}
	return false;
	

}


public boolean ListMerge(SinglyLinkedList<E> list2){

	// determine whether the current list and list2 do 
	// have an intersection


	// list1 has length a + c 
	// (where a is the length of the part 
	// where list1 and list2 are not intersecting)
	// list2 has length b + c
	// (where b is the length of the part 
	// where list1 and list2 are  not intersecting)


	// we start with node1 = list1.head, node2 = list2.head
	// we screen list1 with node1, list2 with node2
	// and when reaching the end of list1, 
	// bring node1 to the beginning of list2
	// and similarly for node2
	// this way if there is an intersection after a+c+b iterations,
	// node1 and node2 will be at the intersection 

	boolean doMerge = true; 

	Node<E> node1 = head;
	Node<E> node2 = list2.head; 

	if(node1==null || node2==null){

		return false;
	}

	boolean secondCheck1 = false; 
	boolean secondCheck2 = false; 


	while(node1!=node2){


		if(node1!=null){

			node1 = node1.getNext();
		}
		else
			node1 = list2.head;

			secondCheck1 = true; 



		if(node2!=null){

			node2 = node2.getNext();
		}		
		else
			node2 = head;

			secondCheck2 = true; 


		if((secondCheck2 == true && node2==null) || secondCheck1 == true && node1==null){

			// screening of both lists is done

			doMerge = false; 
			break;

		}


	} 

	return doMerge; 














}
























}
