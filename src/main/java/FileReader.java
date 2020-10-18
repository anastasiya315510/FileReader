import lombok.Data;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.File;
import java.util.Arrays;
@Data
public class FileReader {

    @SneakyThrows
    public long readFile(File file) {
        if (file.exists()) {
            java.io.FileReader in = new java.io.FileReader("/home/ester/Documents/File.txt");
            BufferedReader br = new BufferedReader(in);
            long l = br.lines()
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .count();

            System.out.println(l);

            in.close();
            return l;
        } else {
            System.out.println("File not exists");
        }
        return 0;
    }
}
