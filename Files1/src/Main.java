import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String data = "";
        String directory = "C:\\Users\\Serj\\Desktop\\a\\a.txt";
        data = Writer.readFile(directory);

        System.out.println("Enter text, exit - to exit(wow)");

        Scanner scanner = new Scanner(System.in);
        FileWriter fw = new FileWriter(directory);


        while (true){
            String input = scanner.nextLine();
            if (input.equals("exit"))
                break;
            data += input + "\n";
        }
        fw.write(data);
        fw.close();

        System.out.println(Writer.readFile(directory));
    }
}