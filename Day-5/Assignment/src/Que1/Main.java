package Que1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
Que 1 Name some important classes available in java.io package.
Ans This package provides functionality for system input and output through data streams, serialization and the file system.

Character Oriented Classes  -> Reader -> InputStreamReader  -> FileReader
                                      -> BufferedReader
                            -> Writer -> OutputStreamWriter -> FileWriter
                                      -> PrintWriter
                                      -> BufferedWriter
Byte Oriented Classes       -> InputStream -> FileInputStream
                                           -> ObjectInputStream
                            -> OutputStream -> FileOutputStream
                                            -> ObjectOutputStream
 */
public class Main {
    public static void main(String[] args) throws IOException {
        try{
            File file = new File("temp.txt");
            if(file.createNewFile()){
                System.out.println("New File Created! ");
            }else{
                System.out.println("File already exsists! ");
            }
        } catch (IOException e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }

        // FileWriter
        FileWriter fw = new FileWriter("temp.txt");
        fw.write("Lalit Kumar");
        fw.flush();
        fw.close();

        // FileReader
        FileReader fr = new FileReader("temp.txt");
        int ptr = fr.read();
        while (ptr != -1){
            System.out.println((char)ptr);
            ptr = fr.read();
        }

    }
}
