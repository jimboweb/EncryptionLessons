/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codetool;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jimstewart
 */
public class DataWriter {
    File file;
    FileWriter fw;
    UIOld ui;
    int lastCharWritten = 0;
    public DataWriter(UIOld ui) {
            this.ui = ui;
    }

    public void writeFile(String filePath, String code){
                    file = new File(filePath);
                    boolean fileWritten = false;
                    boolean overWriteFile = false;
                    while(fileWritten == false){
                    try{
                            if(file.exists() && overWriteFile == false){
                                    ui.output(
                                                    "File " + filePath + " already exists. Overwrite file or quit? (y/n/q)"
                                                    );
                                    overWriteFile = ui.newFileOrQuit(filePath);
                            }

                            file.createNewFile();
                            fw = new FileWriter(file);
                            fileWritten = true;			
                            } catch (IOException e){
                                    ui.output(
                                            "Failed to create file at " + filePath );
                                    ui.output(
                                                    "Try to write to " + filePath + " again, new filename or quit? (y/n/q)"
                                                    );
                                    overWriteFile = ui.newFileOrQuit(filePath);
                            }
                    }
                    char[] charArray = code.toCharArray();
                    for(lastCharWritten=0;lastCharWritten<charArray.length;lastCharWritten++){
                            try{
                                    fw.write(charArray[lastCharWritten]);
                            } catch(IOException e) {
                                    ui.output(
                                            "Error writing to file on character# " + lastCharWritten + 
                                            "\n exception: " + e + 
                                            " \n message: "+ e.getMessage()
                                            );
                                    break;

                            }
                    }
                    try{
                    fw.close();
                    } catch(IOException e){
                            ui.output(
                                            "Error closing file at " + filePath + 
                                            "\n exception: " + e + 
                                            " \n message: "+ e.getMessage()
                            );
                    }
                    ui.output(
                                    lastCharWritten +" characters of " + charArray.length + 
                                    "characters of code written to file" + filePath
                                    );
    }

}
