

import java.util.Scanner;
import java.util.Arrays;


public class SolutionsRecursion{



public static void main(String[] args){


	// demo solution Exercise 1.1. 


	int n_test;

	System.out.println("Enter an integer");
	Scanner my_scanner = new Scanner(System.in);

	n_test = my_scanner.nextInt(); 
	System.out.println("Computing the sum of 1 to "+n_test);
	System.out.println(""+recursionSum(n_test)); 


	// demo solution Exercise 1.2. 

	System.out.println("Enter a String");

	String test_string = my_scanner.next(); 
	System.out.println("Displaying all permutations of the string...");
	StringPerm(test_string,""); 



	// Demo Solution Exercise 1.3.

	System.out.println("Solution to exercise 1.3.");

	System.out.println("Displaying the series for a couple of values");	

	for(int i=1; i<10; i++){


		System.out.println(""+Sum_iOveriPlus1(i));

	}

	// Demo Solution to Exercise 1.5

	System.out.println("Solution to exercise 1.5.");

	System.out.println("Enter an integer m");
	int m = my_scanner.nextInt();
	System.out.println("Enter an integer n");
	int n = my_scanner.nextInt();
	System.out.println("Displaying the GCD of m and n");

	System.out.println("" + GCD(m,n));


	// Demo Solution exercise 1.8

	int[] A = {1,2,9,7,12,6};
	
	System.out.println("Printing integer array: "+ Arrays.toString(A)); 
	System.out.println("Does there exist a pair j,k <i s.t. A[j]+A[k] = A[i]? [y]/[n]");

	System.out.println((hasSumPair(A)) ? "yes" : "no");


	
	// Demo Solution exercise 1.10

	System.out.println("Enter a String..."); 
	String test_string2 = my_scanner.next(); 
		
	System.out.println("Is the string a palindrome? [y]/[n]?"); 

	System.out.println((isPalindrome(test_string2)) ? "yes" : "no");
	

	// Demo Solution Exercise 1.13

	System.out.println("Printing Pascal's triangle");

	System.out.println("Enter a number of rows..."); 
	n = my_scanner.nextInt();
	for(int i=0; i<n; i++){

		int[] row_n = PascalTriangleRow(i);


		for(int j=0; j<i+1; j++){

			System.out.print(row_n[j]); 

		}
		System.out.println(""); 

	}
	


}



public static int recursionSum(int n){
	
	if(n==0){

		return 0;
	}
	else
		return n+recursionSum(n-1);


}


public static int factorial(int n){

	if(n==0){

		return 1;
	}
	else{

		return n*factorial(n-1); 
	}


}




public static void StringPerm(String s, String result){

// generates all permutations of the string s


	char[] temp_array = s.toCharArray();

	char char1;

	for(int i=0; i<s.length(); i++){

		char1 = temp_array[i]; 

		StringPerm(s.substring(0,i)+s.substring(i+1), result + char1); 

	}


	if(s.length()==0){

		System.out.println(result);

	}}

public static double Sum_iOveriPlus1(int n){


	if(n==0){

		return 1;

	}
	else{

		return (double)n/(n+1) + Sum_iOveriPlus1(n-1); 

	}

}


public static int GCD(int m, int n){


	if(m%n == 0){

		return n;

	}
	else{

		return GCD(n, m%n);

	}



}

// Solution to exercise 1.8

public static boolean hasSumPair(int[] A){

	/* start with i=2, if i<2, it is impossible to find j and k 
	   with j,k<i and such that A[j] + A[k] = A[i]*/

	return checkI(A, 2);

}


public static boolean checkI(int[] A, int i){

	if(i>=A.length){

		return false;
	}

	// recursive part 
	if (checkI_JK(A, i, 0,1)){

		return true;

	}

	return checkI(A, i+1); 

}

public static boolean checkI_JK(int[] A, int i, int j, int k){

	// check whether A[j] + A[k] = A[i] for j,k<i

	if (j>=i){

		return false;
	}

	if(k>=i){

		// we start with j,j+1 then j,j+2 and so on 
		// and when k reaches i, we go back to j' = j+1 so 
		// j+1, j+2 and then j+1, j+3, ..

		return checkI_JK(A, i, j+1, j+2);


	}

	if (A[i] == A[j] + A[k]){

		return true;
	}

	return checkI_JK(A, i, j, k+1);



}


public static boolean isPalindrome(String s){

	// returns true if s[0] = s[s.length()-1] 
	// and s[1] = s[s.length()-2] ....

	if(s.length() < 2){

		return true;
	}
	else{

		char[] temp_array = s.toCharArray();		
		return (temp_array[0] == temp_array[s.length()-1] && isPalindrome(s.substring(1,s.length()-1)));

	}

}


public static int[] PascalTriangleRow(int n){

	if(n==0){

		return new int[]{1};
	}

	int[] prev = PascalTriangleRow(n-1);
	int[] curr = new int[n+1];


	curr[0] = 1;
	curr[n] = 1; 

	for(int i=1; i<n; i++){

		curr[i] = prev[i-1] + prev[i];

	}
	return curr;

}




































}

