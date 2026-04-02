import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {
		HashMap<String, List<String>> map = new HashMap<>();

		for (int i=0; i < strs.length; i++) {
			char[] arr = strs[i].toCharArray();
			Arrays.sort(arr);
			String sortedWord = new String(arr);

			if (!map.containsKey(sortedWord)) {
				map.put(sortedWord, new ArrayList<>());
			}
			map.get(sortedWord).add(strs[i]);
		}

		return new ArrayList<>(map.values());
	}
}
