package SteamAPI;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class File {
    public static void main(String[]args) throws IOException {
        Path fileName= Paths.get("/Users/gauri/Desktop/example.txt");
        try(Stream<String> lines= Files.lines(fileName)){
            lines.forEach(System.out::println);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
