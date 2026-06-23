public class ArrayStack<E> implements Stack<E>, Cloneable {
public static final int CAPACITY=1000;
// array capacity
private E[ ] data; // generic array
private int t = -1; // top index
public ArrayStack( ) { this(CAPACITY); }
public ArrayStack(int capacity) {
data = (E[ ]) new Object[capacity];
// safe cast; compiler may give warning
}

public int size( ) { return (t + 1); }
public boolean isEmpty( ) { return (t == -1); }
public void push(E e) throws IllegalStateException {
if (size( ) == data.length)
throw new IllegalStateException("Stack is full");
data[++t] = e;
}
public E top( ) {
if (isEmpty( )) return null;
return data[t];
}
public E pop( ) {
if (isEmpty( )) return null;
E answer = data[t];
data[t] = null;
t--;


return answer;}

// Solution to Exercise 6.6

public ArrayStack<E> clone(){

	ArrayStack<E> shallowCopy;

	try{

		 shallowCopy = (ArrayStack<E>) super.clone();


	}


	catch(CloneNotSupportedException e){

		throw new RuntimeException("Clone not supported"); 

	}

	return shallowCopy;

	// shallowCopy.CAPACITY = this.size();

	// ArrayStack<E> deepCopy = new ArrayStack<>(CAPACITY);
	// ArrayStack<E> temp = new ArrayStack<>(CAPACITY);


	// // to get a deep copy 
	// while(!shallowCopy.isEmpty()){

	// 	deepCopy.push(shallowCopy.top()); 
	// 	temp.push(shallowCopy.top()); 
	// 	shallowCopy.pop();

	// 	counter++; 

	// }

	// while(!temp.isEmpty()){

	// 	this.push(temp.pop());
	// }


	// return deepCopy;

}







}