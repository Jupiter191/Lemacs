package lemacs;

import lemacs.view.View;
import lemacs.model.Model;
import lemacs.io.FileHandler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Lemacs{

	private static final Lemacs lemacs = new Lemacs();
	private static final View view = new View();
	private static final Model model = new Model();
	private static BufferedReader buffReader;

	public static void main(String[] args){

		if(args.length == 0){
			lemacs.newFile();
		} else {
			lemacs.openFile();
		}
	}


	private void newFile(){
		
	}


	private void openFile(){
		try {
			throw new IOException();			
		} catch(IOException e){
			//view.alert(e); // alert overload that takes an Exception
		}
		System.out.println("NO ARGS - openFile() called");
	}
}
