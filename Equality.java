package week03;

public class Equality {

	public static void main(String[] args) {

		String a = new String ("Hello");
		String b = new String ("Hello");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		// prints false - each new object, even with same values, it's a different object in memory
		System.out.println("equals() method: " + a.equals(b));
		// using the equals method to compare VALUE - prints true
		
		int x = 5;
		int y = 5;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y);
		// prints true - points to the same place in memory
		
		String c = new String("Hello");
		String d = c;
		// prints true - d points back to c
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(c == d);
		
		
	}

}
