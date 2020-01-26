package MyPreparation.fileprograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 * There is no need to use BufferedReader or Scanner any more, you can either use
 * Files.readAllLines() if the file is small and you are not concerned about loading all lines in
 * memory, or better use Files.lines() to read a text file line by line lazily. This method will
 * only read lines when a terminal operation will be called on Stream e.g. forEach() method to print
 * lines from a file.
 *
 * <p>It's also worth remembering that, Files.readAllLines() uses UTF-8 character encoding and
 * ensures that file is closed when all bytes are read or an I/O error or runtime exception
 * occurred, but Files.lines() doesn't provide such guarantee. If you want to timely release
 * resource make sure to call Files.lines() method inside try-with-resource statement.
 */
public class UniqueWordsInAFile {

  public static void main(String[] args) throws IOException {
    String fileName = "ForDistinctWords.txt";
    // These two lines to get the file name with absolute path
    ClassLoader classLoader = new UniqueWordsInAFile().getClass().getClassLoader();
    String actualFileName = classLoader.getResource(fileName).getFile();

    // UniqueWordsInAFile.readingFile(actualFileName);
    // UniqueWordsInAFile.bufferedReaderExample(actualFileName);
    // UniqueWordsInAFile.scannerExample(actualFileName);
    // UniqueWordsInAFile.readFileInJava8(actualFileName);
    // UniqueWordsInAFile.uniqueWordsInFile(actualFileName);
    UniqueWordsInAFile.howManyTimesWordRepeated(actualFileName, "My");
  }

  public static void howManyTimesWordRepeated(String fileName, String word) throws IOException {

    int i =
        Files.lines(Paths.get(fileName))
            .map(l -> l.trim())
            .filter(l -> !l.isEmpty())
            .map(
                x -> {
                  List<String> list = Arrays.asList(x.split(" "));
                  return Collections.frequency(list, word);
                })
            .reduce((a, b) -> a + b)
            .get();
    // Reading file to a list
    List<String> result = Files.readAllLines(Paths.get(fileName));
    System.out.println(result);

    System.out.println(word + " is repeated for " + i + " times.");
  }

  public static void uniqueWordsInFile(String fileName) throws IOException {
    System.out.println("Lines in a file: " + Files.lines(Paths.get(fileName)).count());
    System.out.println(
        "Empty lines in a file: "
            + Files.lines(Paths.get(fileName)).map(s -> s.trim()).filter(s -> s.isEmpty()).count());
    System.out.println(
        "Non-Empty lines in a file: "
            + Files.lines(Paths.get(fileName))
                .map(s -> s.trim())
                .filter(s -> !s.isEmpty())
                .count());

    int count =
        Files.lines(Paths.get(fileName))
            .map(s -> s.trim())
            .filter(s -> !s.isEmpty())
            .map(
                s -> {
                  String[] s1 = s.split(" ");
                  HashSet<String> hashSet = new HashSet<>(Arrays.asList(s1));
                  System.out.print(hashSet.size() + " ");
                  return hashSet.size();
                })
            .reduce((a, b) -> a + b)
            .get();
    System.out.println();
    System.out.println("Unique words in a file: " + count);
  }

  /** Java 8 way :) */
  public static void readFileInJava8(String fileName) throws IOException {

    System.out.println("Reading file line by line using Files.lines() in Java 8");
    System.out.println("-----------------------------------------------------------------");
    Files.lines(Paths.get(fileName)).forEach(System.out::println);

    System.out.println("Doing more things than just reading file using Java 8 Streams");
    System.out.println("-----------------------------------------------------------------");
    // Remove Empty lines
    Files.lines(new File(fileName).toPath())
        .map(s -> s.trim())
        .filter(s -> !s.isEmpty())
        .forEach(System.out::println);

    System.out.println("Printing lines which starts with \"");
    System.out.println("---------------------------------------");

    Files.lines(Paths.get(fileName))
        .map(s -> s.trim())
        .filter(s -> s.startsWith("\""))
        .forEach(System.out::println);

    System.out.println("Printing lines using readAllLines()");
    System.out.println("--------------------------------------");
    Files.readAllLines(Paths.get(fileName)).forEach(System.out::println);
  }

  /** Java 7 ways */
  public static void bufferedReaderExample(String fileName) throws IOException {

    FileInputStream fis = null;
    BufferedReader reader = null;

    fis = new FileInputStream(fileName);
    reader = new BufferedReader(new InputStreamReader(fis));
    System.out.println("Reading File line by line using BufferedReader");
    String line = reader.readLine();
    while (line != null) {
      System.out.println(line);
      line = reader.readLine();
    }
  }

  public static void scannerExample(String fileName) throws FileNotFoundException {
    // FileInputStream fis = new FileInputStream("C:/sample.txt");

    FileInputStream fis = new FileInputStream(fileName);

    Scanner scanner = new Scanner(fis);

    // reading file line by line using Scanner in Java
    System.out.println("Reading file line by line in Java using Scanner");

    while (scanner.hasNextLine()) {
      System.out.println(scanner.nextLine());
    }

    scanner.close();
  }

  public static void readingFile(String fileName) throws IOException {

    File file = new File(fileName);
    // File is found
    System.out.println("File Found : " + file.exists());

    // Read File Content
    String content = new String(Files.readAllBytes(file.toPath()));
    System.out.println(content);
  }
}
