package SteamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Length {
    public static void main(String[]args){
        String[] array= {"apple","mango","strawberry","pineapple","papaya"};
        List<Integer>length=Arrays.stream(array).map(String::length).collect(Collectors.toList());
        System.out.println(length);
    }
}
