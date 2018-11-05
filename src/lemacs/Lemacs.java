package lemacs;

import lemacs.view.View;
import lemacs.model.Model;

public class Lemacs{

	private static final Lemacs lemacs = new Lemacs();
	private static final View view = new View();
	private static final Model model = new Model();

	public static void main(String[] args){

		if(args.length == 0){
			view.initialiseGUI();
		} else {
			lemacs.openFile();
		}
	}


	private void openFile(){
		System.out.println("NO ARGS - openFile() called");
	}
}
