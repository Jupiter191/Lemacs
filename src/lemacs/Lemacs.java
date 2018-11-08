package lemacs;

import lemacs.view.View;
import lemacs.model.Model;

public class Lemacs{

	private static final Lemacs lemacs = new Lemacs();
	private static final View view = new View();
	private static final Model model = new Model();

	public static void main(String[] args){
		lemacs.start(args);
	}

	private void start(String[] args){
		if(args.length == 0){
//			fileHandler.newFile();
		} else {
			final String fileToOpen = args[0];
//			fileHandler.openFile(fileToOpen);
		}
	}


	private void newFile(){
		
	}


	private void openFile(String fileToOpen){
		
		//try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileToOpen))){
							
		//} catch(IOException e){
			//view.alert(e); // alert overload that takes an Exception
		//}

		System.out.println("NO ARGS - openFile() called");
	}
}
