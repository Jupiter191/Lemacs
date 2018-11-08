package lemacs.model.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileHandler{

    public void newFile(){

    }

    public void openFile(String fileToOpen){
        FileReader fileReader = new FileReader(fileToOpen);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try(bufferedReader){

        } catch(IOException e){
            //view.alert(e); // alert overload that takes an Exception
        }

        System.out.println("NO ARGS - openFile() called");
    }
}
