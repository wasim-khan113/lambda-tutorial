package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExam {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(12, 4, 24, 1, 34, 22);
		number.stream().sorted().forEach(System.out::println);

		Integer i = number.stream().min((a, b) -> a.compareTo(b)).get();
		System.out.println("min : " + i);
		Integer j = number.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println("Max : " + j);

		List<String> name = Arrays.asList("Farman", "Alfaz", "Anis", "Raunak", "Lovish", "Akash");

		List newName = name.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(newName);

		List<Integer> list = Arrays.asList(4, 3, 6);
		List<Integer> newList = list.stream().map(x -> x * x).collect(Collectors.toList());
		System.out.println(newList);
		list.stream().map(x -> x + x).forEach(y -> System.out.println(y));

	}

}
