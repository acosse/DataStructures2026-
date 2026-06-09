public class EncryptionDemo{
	

	public static void main(String[ ] args) {


		CaesarCipher_upperAndLower myEncryption = new CaesarCipher_upperAndLower(1);

		String secret = myEncryption.encrypt("Bonjour, welcome to NYU");

		System.out.println("Encrypted Message");
		System.out.println(secret);

		String decrypted = myEncryption.decrypt(secret);

		System.out.println(decrypted);

		// int testA = 'A';
		// int testZ = 'Z';
		// int testa = 'a';
		// int testz = 'z';	

		// System.out.println(testA);
		// System.out.println(testZ);


		// System.out.println(testa);
		// System.out.println(testz);


}





}