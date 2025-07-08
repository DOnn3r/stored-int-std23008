package com.example.demo.service;

import java.io.*;
import java.util.Random;
import org.springframework.stereotype.Service;

@Service
public class StoredIntService {

  public int getStoredInt() throws IOException {
    var filePath = "/tmp/stored-int.txt";
    var file = new File(filePath);
    if (!file.exists()) {
      CreateAndWriteFile(file);
    }

    return readFile(file);
  }

  private int readFile(File file) throws IOException {
    var reader = new BufferedReader(new FileReader(file));
    return reader.read();
  }

  private void CreateAndWriteFile(File file) throws IOException {
    var random = new Random();
    var randomNumber = random.nextInt(1000);

    var writer = new FileWriter(file);
    writer.write(randomNumber);
    writer.close();
  }
}
