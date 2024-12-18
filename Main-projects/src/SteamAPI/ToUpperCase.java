package SteamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUpperCase {
public static void main(String[]args){
    String[] array={"apple","orange","banana","kiwi"};
    List<String> upperCase=Arrays.stream(array).map(String::toUpperCase).collect(Collectors.toList());
    System.out.println(upperCase);
}
}
