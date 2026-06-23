public interface Stack<E>{
	
int size( );
/**Tests whether the stack is empty.*/
boolean isEmpty( );
/**Inserts an element at the top of the stack.*/
void push(E e);
/**Returns, but does not remove top of stack.*/
E top( );
/** Removes and returns top of stack.*/
E pop( );



	
}