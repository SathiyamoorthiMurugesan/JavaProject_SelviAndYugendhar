package fileHandling;

import java.io.File;

public class ListAllFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file =new File("C:\\Users\\Admin\\Desktop");
		String[] listallFiles=file.list();//List all files and foldersin desktop
//		for(int i=0;i<=listallFiles.length-1;i++)
//			System.out.println(listallFiles[i]);
//		for(String each:listallFiles)
//			System.out.println(each);
		File[] listAllFileOnly= file.listFiles();
		for(File f:listAllFileOnly) {
		//	System.out.println(f);// it prints folders and files path
	//		if(f.isFile())
		//		System.out.println(f);//prints only file path
			if(f.isDirectory())
				System.out.println(f);//prints only folders path
	}
		}

}
