package ro.ubb.dp1819.mihai.uscat.lab1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileService {
    private String fileName;
    private List<String> lines;

    public FileService(String fileName) {
        this.fileName = fileName;
        this.lines = new ArrayList<>();
    }

    public List<String> getLines() {
        File file = new File(this.fileName);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));

            String st;
            while ((st = br.readLine()) != null)
                this.lines.add(st);
        }
        catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch(IOException e) {
            System.out.println("IOException");
        }
        return lines;
    }
}
