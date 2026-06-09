

import java.util.Random; 

public class RandomCaesarCipher {
public char[ ] encoder = new char[26];
public char[ ] decoder = new char[26];

/** Constructor */
public RandomCaesarCipher() {

	Random r= new Random();
	int rotation;


int[] encoder_tmp = new int[26];

for(int k=0; k<26; k++){

encoder_tmp[k] = k;

} 

// random mixing

for(int k=0; k<26; k++){

	rotation = r.nextInt(25);

	int tmp = encoder_tmp[k];
	encoder_tmp[k] = encoder_tmp[rotation];
	encoder_tmp[rotation] = tmp; 
} 

for(int k=0; k<26; k++){

	encoder[k] = (char)('A'+encoder_tmp[k]);
}

// defining the decoder

for(int k=0; k<26; k++){

	int j = encoder_tmp[k];
	decoder[j] = (char)('A'+ k);

}}



public String encrypt(String message) {
return transform(message, encoder);
}
public String decrypt(String secret) {
return transform(secret, decoder);
}
private String transform(String original, char[ ] code) {
char[ ] msg = original.toCharArray( );
for (int k=0; k < msg.length; k++)
if (Character.isUpperCase(msg[k])) {
int j = msg[k] - 'A'; // get the shift
msg[k] = code[j]; // obtain character in code
}
return new String(msg);}




}