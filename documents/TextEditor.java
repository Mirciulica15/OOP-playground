package documents;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextEditor implements TextDocument {

    private String filePath;

    @Override
    public void open() {
        
        try {
            File file = new File(filePath);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
    @Override
    public void close() {
        System.out.println("Closing text editor..." + filePath);
    }

    @Override
    public void setFileInformations(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void countWords() {
        System.out.println("Counting words...");
    }

}
