import java.util.*;

public class Program7 {

	public static List<?> dupli(String str) {

		// We have define the Hashmap to put repeated characters in it
		Map<Character, Integer> count = new HashMap<>();

		// traverse the string and find if character already there in the map if
		// yes:then it will increment by counting its count and then by 1
		// no:incremnent its count by 1
		for (int i = 0; i < str.length(); i++) {
			char currchar = str.charAt(i);
			
			if (count.containsKey(currchar))
				count.put(currchar, count.get(currchar) + 1);
			else
				count.put(currchar, 1);
		}

		// List to store repeated/duplicate characters from map
		List<Character> li = new ArrayList<>();

		// Map.Entry -it is an interface that represents a key-value pair in the HashMap
		// entrySet() - method of HashMap that returns a set view of all the key-value
		// pairs in the map
		// This loop iterates over each key-value pair in the HashMap count and
		// checks if any character has a frequency greater than 1 If so, it adds the character in the list .
		for (Map.Entry<Character, Integer> element : count.entrySet()) {
			if (element.getValue() > 1)
				li.add(element.getKey());
		}
		return li;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String name = sc.nextLine();
		dupli(name);
	}

}
