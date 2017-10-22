/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetool;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jimstewart
 */
public class DataReader{
    BufferedReader reader;
    int nextCharInt;
    char nextChar;
    String source;
    UIOld ui;
    int charactersRead = 0;
    public DataReader(UIOld ui) {
            this.ui = ui;
            source = "";
    }

    public String readFile(String filePath){

            try {
                    reader = new BufferedReader(
                                    new InputStreamReader(
                                                    new FileInputStream(
                                                                    filePath)));
            } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    ui.output("could not open file. Exception: " + e +
                                    "\n message: " + e.getMessage());
            }
            try{
                    while((nextCharInt = reader.read()) != -1){
                            nextChar = (char)nextCharInt;
                            source = source.concat(Character.toString(nextChar));
                            charactersRead++;
                    }
            } catch (IOException e) {
                    ui.output("Error reading from file " + filePath +
                                    " at character " + charactersRead);
            }
            ui.output("Read " + charactersRead + " characters.");
            return source;
    }

}
