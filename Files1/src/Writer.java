import java.io.*;
import java.util.Scanner;

public class Writer {

    public static String readFile(String dir) throws IOException{
        FileReader fr = new FileReader(dir);
        Scanner scanner = new Scanner(fr);
        String data = "";
        while (scanner.hasNextLine()){
            data += scanner.nextLine() + "\n";
        }
        fr.close();
        return data;
    }

}
