package fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class UsingFileReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file =new File("C:\\Users\\Admin\\Desktop\\Selvi\\One\\file1.txt");
		FileWriter fWriter;
		try {
	//		fWriter = new FileWriter(file); Every time program run the old data will be earased 
			fWriter = new FileWriter(file,true); // true is append the old data + current run of the program
			BufferedWriter bWriter =new BufferedWriter(fWriter);
			bWriter.write("Jashwanth Dev");
			bWriter.newLine();
			bWriter.write("Selvi Murugar");
			bWriter.newLine();
			bWriter.write("Naveen Kumar");
			bWriter.flush();
			bWriter.close();
		FileReader fReader =new FileReader(file); 
			BufferedReader bReader= new BufferedReader(fReader);
			String line=bReader.readLine();
			int lineCount =0;
			while(line!=null) {
				lineCount++;
				System.out.println(line);
				line=bReader.readLine();
			}
			System.out.println("No of lines : "+lineCount);
		}
		catch(Exception e) {
			System.out.println("Error - "+ e);
			e.printStackTrace();
			
		}

	}

}
