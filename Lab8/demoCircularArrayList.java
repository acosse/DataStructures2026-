public class demoCircularArrayList{
	

	


	public static void main(String[] args){


		// demo of the circularArrayList class

		System.out.println("Testing fixed capacity array based implementation of list"); 


		circularArrayList<String> myList = new circularArrayList<>(20);

		myList.addFront("Front_Element1");


		myList.addFront("Front_Element2");

		myList.addFront("Front_Element3");
		myList.addFront("Front_Element4");


		myList.addBack("back_Element1");


		myList.addBack("back_Element2");

		myList.addBack("back_Element3");
		myList.addBack("back_Element4");


		System.out.println(myList.removeFirst());
		System.out.println(myList.removeLast());

		System.out.println(myList.removeFirst());
		System.out.println(myList.removeLast());

		System.out.println(myList.removeFirst());
		System.out.println(myList.removeLast());


		// demo of the Dynamical version 

		System.out.println("Testing dynamical case");

		DynamicalCircularArrayList<String> myList2 = new DynamicalCircularArrayList<>(4);

		myList.addFront("Front_Element1");


		myList.addFront("Front_Element2");

		myList.addFront("Front_Element3");
		myList.addFront("Front_Element4");


		myList.addBack("back_Element1");


		myList.addBack("back_Element2");

		myList.addBack("back_Element3");
		myList.addBack("back_Element4");


		System.out.println(myList.removeFirst());
		System.out.println(myList.removeLast());

		System.out.println(myList.removeFirst());
		System.out.println(myList.removeLast());

		System.out.println(myList.removeFirst());
		System.out.println(myList.removeLast());





	}




}