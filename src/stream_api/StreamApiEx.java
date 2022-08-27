package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiEx {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 3, 12, 8, 5);
		// System.out.println(list);
		List<Integer> newList = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);
		List<Integer> newList1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println(newList1);
		List<Integer> square = list.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println(square);
		list.stream().map(m->m+m).forEach(y->System.out.println(y));

		List<String> str = Arrays.asList("Akram", "vikram", "Asharf", "Khan", "Namit", "Aman");
		List<String> newStr = str.stream().sorted().collect(Collectors.toList());
		System.out.println(newStr);

		List<String> newStr1 = str.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newStr1);
		
		str.stream().forEach(p->System.out.println(p));
		
	}
}
