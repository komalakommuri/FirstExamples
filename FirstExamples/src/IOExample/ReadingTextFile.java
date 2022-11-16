package IOExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import CustomExceptions.CustomFileNotFoundException;
import CustomExceptions.FileAlreadyExisted;

public class ReadingTextFile {

	public String pathName = "";
	public File fileName;
	public Scanner scanFile;
	public int numberCount = 0, vowelCount = 0, consonantCount;
	char character;

	public void readingFile(String pathName) throws CustomFileNotFoundException, FileNotFoundException {
		this.pathName = pathName;
		fileName = new File(this.pathName);

//		try {
//			scanFile = new Scanner(fileName);
//		} catch (FileNotFoundException e) { // Not letting catch custom exception class
//
//			//e.printStackTrace();
//			throw new CustomFileNotFoundException(e.getMessage());
//		}

		scanFile = new Scanner(fileName);

		if (!scanFile.hasNext()) {
			System.out.println("File does not have any lines");
			System.exit(0);
		} else {
			while (scanFile.hasNextLine()) {

				String nextLine = scanFile.nextLine();

				// counting numbersß

				if (scanFile.hasNextInt()) {
					numberCount++;
				}

				// counting vowels and consonants
				for (int i = 0; i < nextLine.length(); i++) {
					character = nextLine.charAt(i);
					if (character == 'a' || character == 'e' || character == 'i' || character == 'o'
							|| character == 'u') {

						vowelCount++;
					} else {
						consonantCount++;
					}

				}

			}
		}

	}

	public void writeFile(String outputFilePath) throws IOException, FileAlreadyExisted {

		// String filePathName = "/users/komalar/Desktop/output5.txt";
		File newFilePath = new File(outputFilePath);
		if (newFilePath.exists()) {
			throw new FileAlreadyExisted("File Already Existed with same name");
		}

		FileWriter newFileWriter = new FileWriter(outputFilePath);

		newFileWriter.write("Count of Numbers in given file " + numberCount);
		newFileWriter.write("\n Number of vowels in given file " + vowelCount);
		newFileWriter.write("\n Number of consonants in given file" + consonantCount);

		System.out.println("filecreated");
		newFileWriter.close();
	}

	public static void main(String[] args) throws  CustomFileNotFoundException {

		Scanner scannerObject = null ;
		try {
		ReadingTextFile readingTextFile = new ReadingTextFile();

		 scannerObject = new Scanner(System.in);

		System.out.println("Enter the File Name with path : ");
		String filePathName = scannerObject.nextLine();
		if (filePathName.isEmpty()) {
			System.out.println("Value should not be null");
			System.exit(0);
		}

		// readingTextFile.readingFile("/users/komalar/Desktop/Example.txt");

		readingTextFile.readingFile(filePathName);

		System.out.println("Enter the output File Name with path : ");
		String outputFilePathName = scannerObject.nextLine();
		if (filePathName.isEmpty()) {
			System.out.println("Value should not be null");
			System.exit(0);
		}

		
			readingTextFile.writeFile(outputFilePathName);}
//		} catch (IOException e) {
//
//			e.printStackTrace();
//		} 
			catch (FileAlreadyExisted e) {

			e.printStackTrace();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch (IOException e) {

			e.printStackTrace();
		} 
		finally {
			scannerObject.close();

		}

	}

}
