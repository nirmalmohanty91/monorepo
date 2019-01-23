package nirmal.web.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

@Configuration
public class FileReadAndWriteService {
    @Value("${filepath.soucefiles.sourcefile1}")
    String sourcefile1;
    @Value("${filepath.soucefiles.sourcefile2}")
    String sourcefile2;
    @Value("${filepath.targetfiles.targetfile0}")
    String targetfile0;
    @Value("${filepath.targetfiles.targetfile1}")
    String targetfile1;
    @Value("${filepath.targetfiles.targetfile2}")
    String targetfile2;

    public void fileReadWrite() throws IOException {
	File file = ResourceUtils.getFile(sourcefile1);
	// String content = new String(Files.readAllBytes(file.toPath()));
	FileReader fileReader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	// Writing to a file With Java – JDK 6
	File destinationFile = new File(targetfile1);
	FileWriter fileWriter = new FileWriter(destinationFile);
	// Writing to a file With Java – JDK 7
	String line;
	while ((line = bufferedReader.readLine()) != null) {
	    fileWriter.write(line);
	    fileWriter.append("\n");
	}
	fileWriter.flush();
	fileWriter.close();
	fileReader.close();

    }

    public StringBuilder readFile() throws IOException {
	File file = ResourceUtils.getFile(sourcefile1);
	FileReader fileReader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	StringBuilder sb = new StringBuilder();
	String line;
	while ((line = bufferedReader.readLine()) != null) {
	    sb.append(line);
	    sb.append("/n");
	}
	fileReader.close();
	return sb;

    }

    public static void fileReadWrite(String source, String target) throws IOException {
	File file = ResourceUtils.getFile(source);
	FileReader fileReader = new FileReader(file);
	BufferedReader bufferedReader = new BufferedReader(fileReader);
	// Writing to a file With Java – JDK 6
	File destinationFile = new File(target);
	FileWriter fileWriter = new FileWriter(destinationFile, true);
	String line;
	while ((line = bufferedReader.readLine()) != null) {
	    fileWriter.write(line);
	    fileWriter.append("\n");
	}
	fileWriter.flush();
	fileWriter.close();
	fileReader.close();

    }

    public void read1Write2() {
	Runnable task1 = () -> {
	    try {
		FileReadAndWriteService.fileReadWrite(sourcefile1, targetfile1);

	    } catch (Exception e) {
		System.err.println(e.getStackTrace());
	    }

	};

	Runnable task2 = () -> {
	    try {
		FileReadAndWriteService.fileReadWrite(sourcefile1, targetfile2);

	    } catch (Exception e) {
		System.err.println(e.getStackTrace());
	    }

	};

	Thread t1 = new Thread(task1);
	Thread t2 = new Thread(task2);

	t1.start();
	t2.start();

    }

    public void read2Write1() {
	Runnable task1 = () -> {
	    try {
		FileReadAndWriteService.fileReadWrite(sourcefile1, targetfile0);

	    } catch (Exception e) {
		System.err.println(e.getStackTrace());
	    }

	};
	Runnable task2 = () -> {
	    try {
		FileReadAndWriteService.fileReadWrite(sourcefile2, targetfile0);

	    } catch (Exception e) {
		System.err.println(e.getStackTrace());
	    }

	};

	Thread t1 = new Thread(task1);
	Thread t2 = new Thread(task2);

	t1.start();
	t2.start();
    }

}
