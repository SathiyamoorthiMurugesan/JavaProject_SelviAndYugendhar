package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FolderCreation {

	public static void main(String[] args) throws Exception {
		// Folder creation
		File fl=new File("C:\\Users\\Admin\\Desktop\\Selvi\\One");
		boolean present=fl.exists();		
		System.out.println("Folder exists " + present);
		if(present ==false)
		//	fl.mkdir(); // make directory
			fl.mkdirs();//	Sub folder creation //make directories     
		present = fl.exists();
		System.out.println("Folder exists " + present);
		

	}

}
