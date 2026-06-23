public interface Queue<E> {
/** Returns number of elem*/
int size( );
/** Tests whether queue is empty. */
boolean isEmpty( );
/** Inserts an element at the rear of the queue. */
void enqueue(E e);
/** Returns, but does not remove, first elem */
E first( );
/** Removes and returns first elem*/
E dequeue( );}