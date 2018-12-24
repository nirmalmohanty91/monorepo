package interviewquestions.infy;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsLineCharacters {

	public static void readFileAndPrintCounts(String crunchifyFile) throws FileNotFoundException {

		int crunchifyTotalWords = 0;
		int crunchifyTotalLines = 0;
		int crunchifyTotalCharacters = 0;

		String crunchifyLine;

		// Read file contents
		// The try-with-resources statement is a try statement that declares one
		// or more resources. A resource is an
		// object that must be closed after the program is finished with it. The
		// try-with-resources statement ensures
		// that each resource is closed at the end of the statement.
		try (BufferedReader crunchifyBuffer = new BufferedReader(new FileReader(crunchifyFile))) {
			crunchifyLog("========== File Content ==========");

			// read each line one by one
			while ((crunchifyLine = crunchifyBuffer.readLine()) != null) {
				crunchifyLog(crunchifyLine);
				crunchifyTotalLines++;

				// ignore multiple white spaces
				String[] myWords = crunchifyLine.replaceAll("\\s+", " ").split(" ");

				for (String s : myWords) {
					crunchifyTotalCharacters += s.length();
				}

				crunchifyTotalWords += myWords.length;

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		crunchifyLog("\n========== Result ==========");

		crunchifyLog("* Total Characters: " + crunchifyTotalCharacters);
		crunchifyLog("* Total Words: " + crunchifyTotalWords);
		crunchifyLog("* Toal Lines: " + crunchifyTotalLines);
	}

	private static void crunchifyLog(String string) {
		System.out.println(string);
	}

	public static void main(String[] args) {
		try {
			String crunchifyFile = "C://Users//Prophet//Desktop//Intro.txt";
			readFileAndPrintCounts(crunchifyFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}