package javachallenge.generics;

public class Generics06 {
	
	public static void main(String...strings) {
		new Homer<>("goHomer", 10) {}.<Double>print(10D);
	}
	
	static class Homer<T, O extends Number>{ 
		T t;
		O o;
		
		public Homer(T t, O o){
			this.t = t;
			this.o = o;
		}
		
		<Krusty extends Number> void print(Krusty krusty) {
			System.out.println(t + "" + (o.intValue() + 2) + krusty.intValue());
		}
	}

}
