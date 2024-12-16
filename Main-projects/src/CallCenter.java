import java.util.*;
public class CallCenter {
    public static void main(String[] args) {
        LinkedList<String> callList = new LinkedList<>();

        callList.add("Call 1. Custormer 1.");
        callList.add("Call 2. Custormer 2.");
        callList.add("Call 3. Custormer 3.");
        callList.add("Call 4. Custormer 4.");
        callList.add("Call 5. Custormer 5.");

        while (!callList.isEmpty()) {
            String firstCall = callList.removeFirst();
            System.out.println("Processing:" + firstCall);
                System.out.println("Calls remaining to be proceeded:"+callList);
            }
            System.out.println("no remaining calls");
        }
    }
