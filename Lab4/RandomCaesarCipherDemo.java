public class RandomCaesarCipherDemo{
	

	public static void main(String[] args){

	RandomCaesarCipher myCipher = new RandomCaesarCipher();

	System.out.println(myCipher.encoder);
	System.out.println(myCipher.decoder);



	String message = "WELCOME TO NYU";

	System.out.println("Original Message");
	System.out.println(message);

	String secret = myCipher.encrypt(message);

	System.out.println("Secret");
	System.out.println(secret);

	String recovered_message = myCipher.decrypt(secret);

	System.out.println("Recovered message");
	System.out.println(recovered_message);
}


}