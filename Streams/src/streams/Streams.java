package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Streams {

	public static void main(String[] args) 
	{
		// String list that is filtered, mapped and sorted
		List<String> myList = Arrays.asList
				("apples", "banana", "blackberry", "broccoli", "cabbage", "carrot", "coconut", "dragon fruit",
						"eggplant", "fig", "grape", "lotus", "melon","orange", "spinach", "tomato", "zucchini");
	
		myList
			.stream()
			.filter(s -> s.startsWith("c"))
			.map(String::toUpperCase)
			.sorted()
			.forEach(System.out::println);
		
		// Integer stream with specific range
		IntStream.range(1, 10)
	    .forEach(System.out::print);
	}

}
