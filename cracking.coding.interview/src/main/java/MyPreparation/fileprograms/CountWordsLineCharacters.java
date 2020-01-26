package MyPreparation.fileprograms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordsLineCharacters {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("C://Users//Prophet//Desktop//nm.txt"));
		String line = null;
		int numberOfLines = 0;
		int numberOfWords = 0;
		int numberOfCharacters = 0;
		System.out.println("======File Content=========");
		while ((line = br.readLine()) != null) {
			numberOfLines++;
			System.out.println(line);
			String[] words = line.replaceAll("\\s", " ").split(" ");
			numberOfWords += words.length;
			for (String s : words) {
				numberOfCharacters += s.length();
			}

		}
		System.out.println("======Details of file========");
		fileOperation("Number of lines: " + numberOfLines);
		fileOperation("Number of words: " + numberOfWords);
		fileOperation("Number of characters: " + numberOfCharacters);
	}

	public static void fileOperation(String s) {
		System.out.println(s);
	}

}