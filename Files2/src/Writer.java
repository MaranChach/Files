import java.io.*;
import java.io.IOException;
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
    public static void writeInBeginOfFirst(String firstDir, String secondDir) throws IOException {
        String data2 = readFile(secondDir);
        String data1 = readFile(firstDir);
        FileWriter fw = new FileWriter(firstDir);
        fw.write(data2 + data1);
        fw.close();
    }
}
