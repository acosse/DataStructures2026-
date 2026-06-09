public class CaesarCipher_upperAndLower {
protected char[ ] encoder = new char[52];
protected char[ ] decoder = new char[52];
/** Constructor */
public CaesarCipher_upperAndLower(int rotation) {

// We sort the letters as 

	// ABC...Zabc ... z


for (int k=0; k < 52; k++) {

if((k + rotation)%52 < 26){
encoder[k]=(char)('A' + (k + rotation)%52);
}
else{

encoder[k]=(char)('a' + (k + rotation)%52 - 26);

}

if((k - rotation + 52)%52 < 26){
decoder[k]=(char)('A' + (k - rotation + 52)%52);
} 
else{

	decoder[k]=(char)('a' + (k - rotation + 52)%52 -26);


}



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
if (Character.isUpperCase(msg[k])){
int j = msg[k] - 'A'; // get the shift
msg[k] = code[j]; // obtain character in code
}
else if(Character.isLowerCase(msg[k])){

int j = msg[k] - 'a';
msg[k] = code[j+26];

}
return new String(msg);}






}
