package javachallenge.generics;

import java.math.BigDecimal;

public class Generics07 {
	
	public static void main(String...strings) {
		Number number = calculate();
		System.out.println(number);
	}
	
	static <T> T calculate() {
		return (T) Double.valueOf(2 * 2);
	}

}
