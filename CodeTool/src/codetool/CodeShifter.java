/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetool;

/**
 *
 * @author jimstewart
 */
public class CodeShifter {
    char[] inputCharArray;  //This will message to encode or deoce
    char[] outputCharArray; //The encoded or decoded message
    int charactersEncoded = 0;
    char[] patternString;
    int newCharNum;
    int patternPointer = 0;
    public CodeShifter(String patternString){
        this.patternString = patternString.toCharArray();
    }
    
    public String encode(String code){
        String encodedMessage = codeShift(code, false);
        return encodedMessage;
    }
    
    public String decode(String code){
        String encodedMessage = codeShift(code, true);
        return encodedMessage;
    }
    private String codeShift(String code, boolean decode){
            String outputMessage = "";
            //System.out.println(outputMessage);
            inputCharArray = code.toCharArray();
            outputCharArray = new char[inputCharArray.length];
            for(charactersEncoded = 0; 
                    charactersEncoded < inputCharArray.length;
                    charactersEncoded++){
                    int shift = (int)patternString[patternPointer];
                    if(decode)
                        shift *= -1;
                    newCharNum = (int)inputCharArray[charactersEncoded] + shift;
                    newCharNum = newCharNum % 65535;
                    outputCharArray[charactersEncoded] = (char)newCharNum;
                    patternPointer++;
                    patternPointer = patternPointer % patternString.length;
            }
            outputMessage = String.valueOf(outputCharArray);
            //System.out.println("output = " + code);
            return outputMessage;
    }
     
}
