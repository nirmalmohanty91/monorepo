package MyPreparation.zExperimentPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Solution {


    public static void main(String[] args) throws IOException {
//
//        String fileName = "SampleInput.txt";
//        ClassLoader classLoader = new Solution().getClass().getClassLoader();
//        String actualFileName = classLoader.getResource(fileName).getFile();

        List<String> result = Files.readAllLines(Paths.get("Y:\\MyGitProjects\\monorepo\\microservices\\corejava\\src\\main\\resources\\SampleInput.txt"));
        String s = result.get(0);
        int level = 0;
        int valleys = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'U'){
                level++;
            }else if(s.charAt(i) == 'D'){
                if(level == 0){
                    valleys++;
                }
                level--;
            }
        }

        System.out.println(valleys);
    }
}
