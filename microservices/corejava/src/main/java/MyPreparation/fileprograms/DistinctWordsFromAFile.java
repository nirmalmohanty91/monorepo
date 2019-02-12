package MyPreparation.fileprograms;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DistinctWordsFromAFile {
  public static void main(String[] args) throws IOException {
    HashSet<String> set = new HashSet<>();
    Files.lines(Paths.get("/Users/mohantyn/Desktop/test.txt"))
        .forEach(
            x -> {
              List<String> list = Arrays.asList(x.split(" "));
              list.forEach(w -> set.add(w.toLowerCase()));
            });
    System.out.println(set);
    System.out.println("Number of unique words: " + set.size());
  }
}
