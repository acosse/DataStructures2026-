public class demoLab8{
	



public static void main(String[] args){


	// Solution Question 8.3

	LinkedPositionalList<String> myList = new LinkedPositionalList<>();


	Position<String> p1 = myList.addFirst("First");

	Position<String> p2 = myList.addAfter(p1, "Second");

	Position<String> p3 = myList.addAfter(p2, "Third");
	Position<String> p4 = myList.addAfter(p3, "Fourth");
	Position<String> p5 = myList.addAfter(p4, "Fifth");



	System.out.println("Representation of the Psitional List:");
	System.out.print(p1.getElement()+"--");
	System.out.print(p2.getElement()+"--");

	System.out.print(p3.getElement()+"--");
	System.out.print(p4.getElement()+"--");
	System.out.print(p5.getElement());

	System.out.println("");
	System.out.println("index of First is " + myList.index_of(p1));
	System.out.println("index of Second is " + myList.index_of(p2));
	System.out.println("index of Third is " + myList.index_of(p3));
	System.out.println("index of Fourth is " + myList.index_of(p4));
	System.out.println("index of Fifth is " + myList.index_of(p5));


	// Solution 8.4. 


	LinkedPositionalList<String> myList2 = new LinkedPositionalList<>();


	Position<String> q1 = myList2.addFirst("First");

	Position<String> q2 = myList2.addAfter(q1, "Second");

	Position<String> q3 = myList2.addAfter(q2, "Third");
	Position<String> q4 = myList2.addAfter(q3, "Fourth");
	Position<String> q5 = myList2.addAfter(q4, "Fifth");


	System.out.println("Retrieving element 'Fifth' and comparing contents");
	Position<String> qretrieved = myList2.findPosition("Fifth");
	System.out.println(" "+ qretrieved.getElement());


	// Solution 8.5


	LinkedPositionalList<String> myList3 = new LinkedPositionalList<>();


	Position<String> r1 = myList3.addFirst("First");

	Position<String> r2 = myList3.addAfter(r1, "Second");

	Position<String> r3 = myList3.addAfter(r2, "Third");
	Position<String> r4 = myList3.addAfter(r3, "Fourth");
	Position<String> r5 = myList3.addAfter(r4, "Fifth");


	System.out.println("Displaying content of Element of index 4");
	System.out.println(""+myList3.positionAtIndex(4).getElement());


	// Solution 8.7


	LinkedPositionalList<String> myList4 = new LinkedPositionalList<>();


	Position<String> s1 = myList4.addFirst("First");

	Position<String> s2 = myList4.addAfter(s1, "Second");

	Position<String> s3 = myList4.addAfter(s2, "Third");
	Position<String> s4 = myList4.addAfter(s3, "Fourth");
	Position<String> s5 = myList4.addAfter(s4, "Fifth");

	System.out.println("Printing list before swap");

	System.out.print(myList4.positionAtIndex(0).getElement()+"--");
	System.out.print(myList4.positionAtIndex(1).getElement()+"--");

	System.out.print(myList4.positionAtIndex(2).getElement()+"--");
	System.out.print(myList4.positionAtIndex(3).getElement()+"--");
	System.out.print(myList4.positionAtIndex(4).getElement());

	System.out.println(" ");

	System.out.println("Printing List after swap");

	myList4.swap(s2, s4);

	System.out.print(myList4.positionAtIndex(0).getElement()+"--");
	System.out.print(myList4.positionAtIndex(1).getElement()+"--");

	System.out.print(myList4.positionAtIndex(2).getElement()+"--");
	System.out.print(myList4.positionAtIndex(3).getElement()+"--");
	System.out.print(myList4.positionAtIndex(4).getElement());


















 



	






}









}