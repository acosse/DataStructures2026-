
import java.util.Scanner;


public class capitalGain{
	

		public static void main(String[] args){



		Queue<Share> portfolio = new LinkedQueue<>();

		Scanner myscanner = new Scanner(System.in);

		long capital_gain = 0;

		System.out.println("Enter a transaction (enter 'end' to step the encoding):"); 

		while(true){

		String current_input  = myscanner.next();

		if(current_input.equalsIgnoreCase("end")){

			break;

		}

		else if(current_input.equalsIgnoreCase("buy")){

			int x = myscanner.nextInt(); // amount
			int purchase_price = myscanner.nextInt(); // price

			Share additionalShare = new Share(x, purchase_price);
			portfolio.enqueue(additionalShare); 

		}

		else if(current_input.equalsIgnoreCase("sell")){

			int x = myscanner.nextInt(); // sold amount
			int sell_price = myscanner.nextInt(); // sell price

			// computing capital gain 


			while(x>0){

				Share latestSharePurchased = portfolio.first(); 

				if(latestSharePurchased.shares> x){
					

					capital_gain += x*(sell_price - latestSharePurchased.price); 
					latestSharePurchased.shares -= x; 
					x = 0; 

				}
				else if(latestSharePurchased.shares<= x){


					capital_gain += latestSharePurchased.shares*(sell_price - latestSharePurchased.price);
					Share removed = portfolio.dequeue();

					x-=latestSharePurchased.shares; 





				}


			}





		}




		}

		System.out.println("Total capital gain: "+ capital_gain); 



		while(!portfolio.isEmpty()){


			Share currentShare = portfolio.dequeue();
			System.out.print("Number of shares purchased: ");
			System.out.print(currentShare.shares);
			System.out.println("");
			System.out.print("Price of shares: ");
			System.out.print(currentShare.price);
			System.out.println(" "); 

		}






		}






}