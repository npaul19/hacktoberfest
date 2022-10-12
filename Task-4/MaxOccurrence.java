import java.util.*;
class MaxOccurance {

  static String find(String s) {
    HashMap<String, Integer> frequencyMap = new HashMap<String, Integer>();
 
        for (String word: s.split("[\\s\\,\\.]")) {
            
            if (frequencyMap.containsKey(word.toLowerCase())) {
                frequencyMap.put(word.toLowerCase(), frequencyMap.get(word.toLowerCase()) + 1);
            }
           
            else {
                frequencyMap.put(word.toLowerCase(), 1);
            }
        }
 
        Set<Map.Entry<String, Integer> > set = frequencyMap.entrySet();
        String key = "";
        int value = 0;
        for (Map.Entry<String, Integer> entry : set) {
            if (entry.getValue() > value) {
                value = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
  }

  public static void main(String args[]) {
    // Find the word with max occurrences in the given sentence
    System.out.println(find("Bob hit a ball, the hit BALL flew far away after it was hit")); // Output : "hit"
    System.out.println(find("Bob hit a ball, the hit BALL flew far away when Bob threw the ball.")); // Output : "ball"
  }
}
