package lambdaExp;

public class Main {
	public static void main(String[] args) {
		System.out.println("main method start");
		LambdaExpressionImpl obj = new LambdaExpressionImpl();
		obj.show();

		LambdaExpression i = () -> {
			System.out.println("first lambda expression ");
		};
		i.show();

		LambdaExpression i2 = () -> System.out.println("Second lambda expression");
		i2.show();

		SumInter sumIntr = (a, b) -> a + b;

		System.out.println(sumIntr.sum(2, 4));
		System.out.println(sumIntr.sum(5, 9));

		LengthInter l = str -> str.length();
		System.out.println(l.getLength("Hello"));

		
	}

}
