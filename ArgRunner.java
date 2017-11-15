/**
 * Класс для запуска калькулятор с параметрами.
 */
public class ArgRunner {

	public static void main(String[] args) {
		System.out.println("Calculate...");
		if (args.length == 2) {
			int first = Integer.valueOf(args[0]);
			int second = Integer.valueOf(args[1]);
			Calculator calc = new Calculator();
			calc.add(first, second);
			System.out.println("Sum : " + calc.getResult());
		} else {
			System.out.println("Enter two paramenters.");
		}
	}
}