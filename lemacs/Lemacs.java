package lemacs;

import lemacs.view.View;
import lemacs.model.Model;
import lemacs.io.FileHandler;

public class Lemacs{

	private static final Lemacs lemacs = new Lemacs();
	private static final View view = new View();
	private static final Model model = new Model();
	private static FileHandler fileHandler;

	public static void main(String[] args){
		lemacs.start(args);
	}

	private void start(String[] args){
		if(args.length == 0){
			fileHandler.newFile();
		} else {
			final String fileToOpen = args[0];
			fileHandler.openFile(fileToOpen);
		}
	}


	private void newFile(){
		
	}


	private void openFile(String fileToOpen){
		FileReader fileReader = new FileReader(fileToOpen);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		
		try(bufferedReader){
							
		} catch(IOException e){
			//view.alert(e); // alert overload that takes an Exception
		}

		System.out.println("NO ARGS - openFile() called");
	}
}
