package WideningCasting;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	// Casting-->Converting one type of data(information) into another type of data(information).
	//type casting--> Numeric data to Numeric data.
		
	// 1) Widening Casting (implicit Casting) automatic casting.
    // 2) narrowing Casting(Explicit Casting) manual casting.
		
		// 1) Widening Casting 
		// byte --> short --> int --> long --> float --> double.
		
		byte a = 10;
		int k = a;
		double p = k;
		System.out.println(k);
		System.out.println(p);
		
	//==========================================	
		
		// 2) Narrowing Casting
		// double --> float --> long --> int --> short --> byte.
		
		double u = 180188.45d;
		int r = (int) u;
		short m = (short) r;
		System.out.println(r);
		System.out.println(m);
		
	//============================================
		
		
		int v = 200;
		int e = (int) ((double)v + 40.53d);
		System.out.println(e);
		
	//============================================	
		
		
		short w = 190;
		char n = (char) w;
		System.out.println(n);
	
	//============================================
		
		
		char q = '[';
		int tt = q;
		System.out.println(tt);
		
		
	//============================================	
		
		
		float y = 120.25f;
		long b =  (long) y;
		System.out.println(b);
		
	//============================================
		
		
		int h = 500;
		byte f = (byte) h;
		System.out.println(f);
		
	}

}
