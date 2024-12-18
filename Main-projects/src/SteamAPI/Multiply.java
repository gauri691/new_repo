package SteamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Multiply {
    public static void main(String[]args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> result=numbers.stream().map(n->n*3).collect(Collectors.toList());
        System.out.println(result);
    }
}
