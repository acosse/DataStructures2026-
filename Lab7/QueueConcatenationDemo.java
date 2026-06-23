public class QueueConcatenationDemo{
	


	public static void main(String[] args){

	LinkedQueue<String> Q1 = new LinkedQueue<>();


	Q1.enqueue("Bonjour");

	Q1.enqueue("Welcome");
	Q1.enqueue("to");
	Q1.enqueue("NYU");
	Q1.enqueue("CSCI-UA 9102");

	LinkedQueue<String> Q2 = new LinkedQueue<>();

	Q1.enqueue("Introduction");
	Q1.enqueue("to");
	Q1.enqueue("Data Structures");

	Q1.concatenate(Q2);

	System.out.println("printing result of concatenation");
	while(!Q1.isEmpty()){
	System.out.println(Q1.dequeue());
	}



	}
	
	




}