package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
	int id;
	String name;
	int price;

	Product(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

public class javaStreamExample {
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(12, "Dell Laptop", 10000));
		productList.add(new Product(13, "Hp Laptop", 9000));
		productList.add(new Product(14, "Asus Laptop", 12000));
		productList.add(new Product(15, "Lenovo Laptop", 18000));
		productList.add(new Product(16, "Asus Laptop", 7000));

		List<String> newList = productList.stream().filter(e -> e.price > 10000).map(p -> p.name)
				.collect(Collectors.toList());
		System.out.println(newList);

		List<Integer> newList1 = productList.stream().filter(m -> m.price <= 10000).map(m -> m.id)
				.collect(Collectors.toList());
		System.out.println(newList1);
	}
}
