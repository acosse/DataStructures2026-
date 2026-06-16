
import java.lang.System;

import java.util.Random;


public class testRuntime{
	

	public static void main(String[] args){



		int numTest = 100; 
		long[] runtimes = new long[numTest];

		for(int exp=0; exp<100; exp++){
		

		for(int n=1; n<numTest; n+=1){
		
		long startTime = System.nanoTime(); //System.currentTimeMillis();

			quadraticTime(n);

		long endTime = System.nanoTime();//System.currentTimeMillis();

		runtimes[n]+=(endTime - startTime);

		
		//System.out.println(startTime);
		//System.out.println(endTime);
		

		}}

		for(int i=0; i<numTest; i++){

			System.out.print(runtimes[i]/100 + ",");

		}

		






		






	}

	// linear time example
	public static void linearTime(int n){

		Random random = new Random();

		int[] my_array = new int[n];

		int total = 0;

		for(int i=0; i<n; i++){

			total+=random.nextInt();

		}


	}



	public static void quadraticTime(int n){

		Random random = new Random();

		int[] my_array = new int[n];

		int total = 0;

		for(int j=0; j<n; j++){

			int jj = random.nextInt();

		for(int i=0; i<n; i++){

			int ii = random.nextInt();

			total+= ii+jj; 


		}}


	}




}