



public class circularArrayList<E>{


	private E[] data;
	private int front = 0;
	private int size = 0;


	public circularArrayList(int capacity){
		
		data = (E[]) new Object[capacity]; 

	}


	public int size(){

	return size;

	}

	


	public boolean isEmpty(){

	return size == 0;

	}

	public void addFront(E e){

	if(size == data.length){
		throw new IllegalStateException("Array is full"); 
		}
		front = (front-1+data.length)%data.length;
		data[front] = e;
		size++; 

	}

	public void addBack(E e ){

	if(size == data.length){
		throw new IllegalStateException("Array is full");
		}

		int available_cell = (front+size)%data.length; 
		data[available_cell] = e;
		size++; 

	}


	public E removeFirst(){

		if(isEmpty()){

			throw new IllegalStateException("List is empty"); 

		}

		E value = data[front];
		data[front] = null;
		front = (front + 1)% data.length;
		size--;

		return value;  

	}

	public E removeLast(){

		if(isEmpty()){

			throw new IllegalStateException("List is empty"); 

		}

		E value = data[(front+size-1)%data.length];

		data[(front+size)%data.length] = null;
		size--;
		return value; 


	}








	







}