public class first50primes{
	
	
	public static ArrayStack<Integer> firstPrimes(int n) {


	ArrayStack<Integer> myStack = new ArrayStack<>(2*n);


		int counter = 0;
		boolean is_prime;
		int candidate = 3;  

		while(counter<n){

			is_prime = true; 


			for(int i=2; i<candidate; i++){

				if(candidate%i == 0){

					is_prime = false; 

				}

			}

			if(is_prime){
				myStack.push(candidate);
				counter ++;

				}

			candidate++;
			


		}



		return myStack; 


	}

	public static void main(String[] args){

	ArrayStack<Integer> myStack = firstPrimes(50);

	while(!myStack.isEmpty()){

		System.out.println(""+myStack.pop()); 

	}




	}




}