public class SinglyLinkedList<E> {
//------- nested Node class --------
private static class Node<E> {
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


private Node<E> head = null; // head node
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


public E second2Last(){


	if(size<3){

		return null;
	}

	Node<E> current = head;

	while(current.getNext().getNext() != null){

		current = current.getNext();


	}

	return current.getElement();


}


public void append(SinglyLinkedList L){

	// Ideally , we should make sure that the types of the two list is the same

	if (this.size()>0 && L.size()>0){
	if (((Object) L.first()).getClass() != ((Object) this.first()).getClass()){

		throw new UnsupportedOperationException("Types of Lists are not matching");

	}}


	while(L.size()>0){

		this.addLast((E)L.first());
		L.removeFirst();


	}


}

public E removeLast(){


	E temp = last();

	if(size==0){
		return null;
	}
	else{

		Node<E> current = head;

		while(current.getNext().getNext() != null){

		current = current.getNext();


		}
	current.setNext(null);
	tail = current; 

	size--; 

		return temp;
	}

}


public void add_after(E e_previous, E e_insert) {


// assuming all nodes have distinct contents 
// to be done (1): treat the case where there are multiple 
//	nodes with identical content
// 	to be done (2): provide index instead of content 
// and count to position new node. 

Node<E> current = head;


	while(current.getElement() != e_previous){


		current = current.getNext();


	}

	Node<E> n = new Node<>(e_insert, current.getNext());

	current.setNext(n); 

	size++; 


}

public void add_after_indexBased(int p, E e){


	Node<E> newNode = new Node<>(e, null);
	if(p>size-1){

		throw new IndexOutOfBoundsException("position is not valid");


	}
	else{

		Node<E> current = head;
		int counter = 0;
		while(current.getNext()!=null && counter<p){

			current = current.getNext();

			counter++; 

		}

		size++; 

		newNode.setNext(current.getNext());
		current.setNext(newNode);

		


	}





}


public E[] to_array(){


	E[] array_listImplementation;
	array_listImplementation = (E[]) new Object[size];

	int counter = 0;

	
	Node<E> current = head; 

	while(current.getNext()!= null){

		array_listImplementation[counter] = current.getElement();
		current = current.getNext(); 

		counter++;

	}

	array_listImplementation[counter] = current.getElement();	



	return array_listImplementation;



}


public int find(E element){

// determine whether the list contains a node with content e
// if so, return the correponding index of this node

// Here we throw an exception if element is not found
// (simpler) alternative would consist in returning a 
//	negative if element is not found. 


	Node<E> current = head;
	int position = 0; 

	boolean is_found = false;

	while(current.getNext()!=null && current.getElement()!=element){

		current = current.getNext();
		position++; 



	}

	if(current.getElement() == element){

		is_found = true;



	}
	else{

		throw new IllegalArgumentException("Element does not exist"); 
	}


	return position;







}








}















