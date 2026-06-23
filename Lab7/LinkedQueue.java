public class LinkedQueue<E> implements Queue<E> {
public SinglyLinkedList<E> list
= new SinglyLinkedList<>( ); // empty list
public LinkedQueue( ) { } // new queue = empty list
public int size( ) { return list.size( ); }
public boolean isEmpty( ) { return list.isEmpty( ); }
public void enqueue(E element) { list.addLast(element); }
public E first( ) { return list.first( ); }
public E dequeue( ) { return list.removeFirst( ); }

public void concatenate(LinkedQueue<E> Q2){

	/* returns concatenation of this and Q2*/

	this.list.tail.setNext(Q2.list.head);  
	this.list.tail = Q2.list.tail;
	this.list.size+=Q2.size();

	Q2.list.head = null;
	Q2.list.tail = null;



}



}