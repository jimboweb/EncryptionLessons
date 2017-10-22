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
public class Encrypter {
    	int shiftAmount = 0;
	public Encrypter() {
		// TODO Auto-generated constructor stub
	}
	public String encrypt(String message, int shiftAmount){
		String code = "";
		char newChar;
		int charNum;
		int patternIndex = 0;
		for(int i=0; i< message.length();i++){
			newChar = message.charAt(i);	// get the character at i
			charNum = (int)newChar;			// turn it into an integer
			charNum = charNum + shiftAmount;// increase it by shiftAmount
			newChar = (char)charNum;		// turn it back into a character
			code = code + newChar;			// add the character to the code
		}
		return code;
	}
        public String patternEncrypt(String message, String pattern){
            CharacterShifter cs = new CharacterShifter();
            String code = cs.shiftCharacters(message, pattern, false);
            return code;
	}

}
