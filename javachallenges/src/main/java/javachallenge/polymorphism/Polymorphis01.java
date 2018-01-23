package javachallenge.polymorphism;

public class Polymorphis01 {
	
	static class Jedi {
		 static void attack() {	System.out.println("Any Jedi's attack"); }
		 void quote() { System.out.println("May the force be with you!");}
	}
	
	static class Luke extends Jedi {
		 static void attack() { System.out.println("Luke's attack"); }
		 void quote() { System.out.println("Noooooooo!"); }
	}

	public static void main(String[] args) {
		Jedi jedi = new Luke();
		jedi.attack();
		jedi.quote();
	}

}
