package dz6lesson;

import javax.swing.table.AbstractTableModel;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Object[] arrex = new String[5];
        arrex[1] = "Hello";
        try {
            arrex[2] = 50;
        } catch (ArrayStoreException e){
            System.out.println("ArrayStoreException");;
        }

        String path = "\"C:\\Users\\ttrnv\\Desktop\\Textj.txt\"";
        File file = new File(path);
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line + "\n");
            }
        } catch (IOException e) {
            throw new IOException();
        }
    }
}