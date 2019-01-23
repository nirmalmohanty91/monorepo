package nirmal.web.controller;

import nirmal.web.service.FileReadAndWriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class FileOperationController {
  @Autowired
  FileReadAndWriteService fileService;

  @GetMapping("/readFile")
  public StringBuilder readFile() throws IOException {
    return fileService.readFile();
  }

  @GetMapping("/fileOperation")
  public void fileReadWrite() throws IOException {
    fileService.fileReadWrite();
  }

  @GetMapping("/read1Write2")
  public void read1Write2() {
    fileService.read1Write2();
  }

  @GetMapping("/read2Write1")
  public void read2Write1() {
    fileService.read2Write1(); 
  }


}
