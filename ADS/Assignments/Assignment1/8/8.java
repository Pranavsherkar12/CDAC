import java.util.*;

public class Program8 {
	public static Character nonrepeated(String str) {
		Map<Character, Integer> count = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);

			if (count.containsKey(curr))
				count.put(curr, count.get(curr) + 1);

			else
				count.put(curr, 1);
		}

//Alternate method to find character count and it in the map 		
//		for(char c: str.toCharArray()) {
//			
//			count.put(c, count.getOrDefault(c, 0)+1);
//		}
		for (Map.Entry<Character, Integer> element : count.entrySet()) {

			if (element.getValue() == 1)
				return element.getKey();

		}
		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println(nonrepeated(name));
	}
}
