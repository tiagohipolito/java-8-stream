import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;


public class StreamsJava8Test {

	private List<String> list;
	
	@Before
	public void setUp() {
		list = Arrays.asList("md", "ga", "qt", "zm", "z4", "pf", "ba", "qt", "bh", "y9");
	}
	
	@Test
	public void filterListTest() {

		List<String> filteredList = StreamsJava8.filterList(list, "b");
		
		assertEquals(2, filteredList.size());
		assertTrue(filteredList.contains("ba"));
		assertTrue(filteredList.contains("bh"));
		
	}

	@Test
	public void convertToUpperCaseTest() {
		
		List<String> convertedList = StreamsJava8.convertToUpperCase(list);
		
		assertEquals(10,convertedList.size());
		assertTrue(convertedList.contains("ZM"));
		assertFalse(convertedList.contains("zm"));		
		
	}
	
	@Test
	public void sortListTest() {
		
		List<String> sortedList = StreamsJava8.sortList(list);

		assertEquals("ba",sortedList.get(0));
		assertEquals("zm",sortedList.get(9));		
		
	}
	
	@Test
	public void countItem() {
		assertEquals(2,StreamsJava8.countItem(list,"qt"));
	}
	
}
