package javachallenge.streams;

import java.util.stream.*;

public class IntStream00 {
	
	public static void main(String...strings) {
		IntStream.range(0, 10).forEach(index -> { System.out.println(index); });
	}

}
