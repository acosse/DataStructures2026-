public class stackTransfer{
	

	public static <E> void TransferSontoT(ArrayStack<E> T, ArrayStack<E> S){


	while(!S.isEmpty()){

		T.push(S.pop());

	}


	}



	public static void main(String[] args){


		ArrayStack<String> S = new ArrayStack<>(10);

		
		S.push("Data Structures");
		S.push("to");	
		S.push("Introduction");
		S.push("CSCI-9102");
		S.push("NYU");
	


		ArrayStack<String> T = new ArrayStack<>(10);

		T.push("Hello");
		T.push("welcome");
		T.push("to");	

		TransferSontoT(T, S); 

		while(!T.isEmpty()){

			System.out.println(T.pop()); 


		}












	}
	




}