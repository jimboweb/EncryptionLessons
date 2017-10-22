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
public class EncryptionToolUnitTest {
    	public static void main(String args[]){
            testPatternDecrypt();
	}
        public static void testPatternDecrypt(){
            		Encrypter enc = new Encrypter();
		Decrypter dec = new Decrypter();
		String message = "Be sure to drink your Ovaltine.";
		String expectedEncryptedMessage = "Î×ÆÍâÖA»ÛÕÒtáØãÙA¦ßÍÐ½ÖÎ";
		System.out.printf("The original message is %s, %n", 
										message);
		
		String encryptedMessage = enc.patternEncrypt(message, "Wild thing!");
		
		if(encryptedMessage == expectedEncryptedMessage){
			System.out.println("Test 1 passed");
			System.out.println("The encoded message is:");
			System.out.println(encryptedMessage);
		} else {
			System.out.println("Test 1 not passed");
			System.out.println("The encoded message is:");
			System.out.println(encryptedMessage);
			System.out.println("Should be:");
			System.out.println(expectedEncryptedMessage);
		}
		
		String decryptedMessage = dec.patternDecrypt(expectedEncryptedMessage, "Wild thing!");
		
		if(decryptedMessage == message){
			System.out.println("Test 1 passed");
			System.out.println("The decoded message is:");
			System.out.println(decryptedMessage);
		} else {
			System.out.println("Test 1 not passedpassed");
			System.out.println("The decoded message is:");
			System.out.println(decryptedMessage);
			System.out.println("Should be:");
			System.out.println(message);
		}
		

        }
}
