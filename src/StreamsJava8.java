import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsJava8 {

	public static List<String> filterList(List<String> list, String prefix) {
		
		// Retrieves stream from list 
		Stream<String> stream = list.stream();
		
		// Filters stream with elements started given prefix
		stream = stream.filter(item -> item.startsWith(prefix));
		
		// Transforms filtered stream into list
		List<String> resultList = stream.collect(Collectors.toList());
		
		return resultList;
	}

	public static List<String> convertToUpperCase(List<String> list) {
		
		// Retrieves stream from list 
		Stream<String> stream = list.stream();
		
		// Maps stream with key = value.toUpperCase
		stream = stream.map(item -> item.toUpperCase());
		
		// Retrieves map from stream
		List<String> resultList = stream.collect(Collectors.toList());
		
		return resultList;
	}
	
	public static List<String> sortList(List<String> list) {
		
		// Retrieves stream from list 
		Stream<String> stream = list.stream();
		
		// Sorts stream.
		stream = stream.sorted();
		
		// Transforms stream into list
		List<String> sortedList = stream.collect(Collectors.toList());
		
		return sortedList;
		
	}

	public static long countItem(List<String> list, String itemToCount) {
		
		// Fluently counts how many times 'itemToCount' repeats on list
		return list.stream().filter(item -> item.equals(itemToCount)).count();
		
	}

}
