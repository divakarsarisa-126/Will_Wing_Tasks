package Monday_task;

import java.util.HashMap;
import java.util.Map;

   public class States_capitals_map {

    public static void main(String[] args) {
      String data = "AndhraPradesh||Amaravathi-Telangana||Hyderabad";
        char del1 = '-'; 
        char del2 = '|';  

       Map<String, String> stateCapitalMap = getStates(data, del1, del2);

        System.out.println("States and Capitals:");
        for (Map.Entry<String, String> entry : stateCapitalMap.entrySet()) {
            System.out.println("State: " + entry.getKey() + " & Capital: " + entry.getValue());
        }
        }

    public static Map<String, String> getStates(String data, char del1, char del2) {
        Map<String, String> stateCapitalMap = new HashMap<>();
        String[] stateCapitalPairs = data.split(String.valueOf(del1));

        for (String pair : stateCapitalPairs) {
            String[] stateAndCapital = pair.split("\\" + del2 + "\\" + del2); 

            if (stateAndCapital.length == 2) {
                stateCapitalMap.put(stateAndCapital[0], stateAndCapital[1]);
            }
        }

        return stateCapitalMap;
    }
}
