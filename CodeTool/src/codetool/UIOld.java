/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetool;

import java.io.File;

/**
 *
 * @author jimstewart
 */
public class UIOld {
    
    public boolean newFileOrQuit(String filePath){
            File file = new File(filePath);
            boolean rtrn = false;
            char input = input().charAt(0);
            switch(input){
            case 'y': 
            case 'Y':
                    rtrn = true;
                    break;
            case 'n':
            case 'N':
                    output("Enter new file path: ");
                    filePath = input();
                    file = new File(filePath);
                    rtrn = false;
                    break;
            case 'q':
            case 'Q':
                    System.exit(0);
            default:
                    output("Please enter 'y', 'n', or 'q'");
                    break;
            }

            return rtrn;
    }
 
    public void output(String outputString){
        
    }
    
    public String input(){
        String inputString = "";
        
        return inputString;
    }
}
