import java.io.File;

public class Main {
    public static void main(String[] args) {
        File f = new File("/home/ester/Documents/File.txt");
        FileReader fileReader = new FileReader();
        fileReader.readFile(f);
    }
}
