package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws Exception {
	//File creation
		File file =new File("C:\\Users\\Admin\\Desktop\\Selvi\\One\\Java1.txt");
		boolean present=file.exists();
		if(present == false )
			try {
			boolean create = file.createNewFile();
			System.out.println("File created "+ create);
			}
		catch(Exception e) {
			e.printStackTrace();
		}

		file.delete();// file delete
		present=file.exists();
		System.out.println("File Present "+ present);
		//rename a file
		File f1=new File("C:\\Users\\Admin\\Desktop\\Selvi\\One\\Java2.txt");
		f1.createNewFile();
		File newName=new File("C:\\Users\\Admin\\Desktop\\Selvi\\One\\file1.txt");
		f1.renameTo(newName);
		boolean rename =newName.exists();
		System.out.println("Rename Success "+rename);
		//print a file name 
		System.out.println("File name "+ newName.getName());
		System.out.println("File name "+ f1.getName());
		
		
	}

}
