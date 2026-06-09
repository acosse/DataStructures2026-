public class breakCaesarCipher{



	public static void main(String[] args){


		CaesarCipher myEncryption = new CaesarCipher(1);

		String secret = myEncryption.encrypt("BONJOUR WELCOME TO NYU");


		System.out.println("Secret is given by");
		System.out.println(secret); 
		System.out.println("Brute force breaking of the encryption...");
		breakCCipher(secret); 


	}

	public static void breakCCipher(String secret){

		// to do next, throw an exception is a 
		// character is not upper case 

		char[] decoder = new char[26];

		for(int r=0; r<26; r++){

			for(int i=0; i<26; i++){

				decoder[i]= (char)('A' + (i - r + 26)% 26);

			}

			char[] decoded = decypher(secret, r, decoder);
			System.out.println(decoded);

		}



	}


	public static char[] decypher(String secret, int r, char[ ] code){

	char[ ] msg = secret.toCharArray( );
	for (int k=0; k < msg.length; k++){
	if (Character.isUpperCase(msg[k])) {
	int j = msg[k] - 'A'; // get the shift
	msg[k] = code[j]; // obtain character in code
	}


	}
	return msg; }







	

	




}