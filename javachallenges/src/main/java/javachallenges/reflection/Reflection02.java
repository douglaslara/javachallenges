package javachallenges.reflection;

import java.lang.annotation.RetentionPolicy;

public class Reflection02 {
	
	public static void main(String...strings) {
		System.out.println(Jedi.class.getAnnotation(Table.class).name());
		System.out.println(Jedi.class.getAnnotation(Column.class).name());
	}
	
	@Table(name ="jedi")
	static class Jedi {
		
		@Column(name = "attack_type")
		String attackType;
		
		public String getAttackType() { return this.attackType; }
		
	}
	
	@Retention(RetentionPolicy.RUNTIME)
	@interface Table {String name;}
	@interface Column {String name;}

}
