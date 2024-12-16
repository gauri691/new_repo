package Collection;

import java.util.Scanner;
import java.util.TreeSet;

public class NameSorter {
    public static void main(String[]args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("Gauri");
        set.add("Aleena");
        set.add("Nayonika");
        set.add("Navin");
        set.add("Abhimanyu");

        System.out.println("Names in alphabetical order:");
        for(String str:set){
            System.out.println(str);
        }
        System.out.println("First name:"+set.first());
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a name to print all the names starting from a that name:");
        String name=sc.nextLine();
        System.out.println("\nNames starting from " + name + ":");
        for (String names : set.tailSet(name)) {
            System.out.println(names);
        }
        System.out.println("Enter a name to print the name that comes after the given name:");
        String givenName=sc.nextLine();
        String nextName=set.higher(givenName);
        System.out.println("\nName that comes after " + givenName + ": " + nextName);
    }
}
