/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encrypttool;

/**
 *
 * @author jimstewart
 */
public class Decrypter {
    	int shiftAmount = 0;
	public Decrypter() {
		// TODO Auto-generated constructor stub
	}
	public String decrypt(String message, int shiftAmount){
		String code = "";
		char newChar;
		int charNum;
		int patternIndex = 0;
		for(int i=0; i< message.length();i++){
			newChar = message.charAt(i);	// get the character at i
			charNum = (int)newChar;			// turn it into an integer
			shiftAmount *= -1;
			charNum = charNum + shiftAmount;// increase it by shiftAmount
			newChar = (char)charNum;		// turn it back into a character
			code = code + newChar;			// add the character to the code
		}
		return code;
	}
        public String patternDecrypt(String message, String pattern){
            CharacterShifter cs = new CharacterShifter();
            String code = cs.shiftCharacters(message, pattern, true);
            return code;
	}

}
