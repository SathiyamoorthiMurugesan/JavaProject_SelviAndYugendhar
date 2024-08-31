package fileHandling;

import java.io.File;

public class GetTextFile {

	public static void main(String[] args) {
		File file =new File("C:\\Users\\Admin\\Desktop");
		File[] fileAndFolder=file.listFiles();
		
		for (File f:fileAndFolder) 
			if(f.isFile())
		{
			String fileName =f.getName();
		int lastDot= fileName.lastIndexOf(".");
		String extension= fileName.substring(lastDot+1);
		if(extension.equals("pdf"))//checks pdf file
			System.out.println(fileName +" Size :"+f.length());// file size
			
	}
	}
}
