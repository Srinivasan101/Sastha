package tech.java;

public class Methodsmodel {
	static int basePrice(int x, int y) {
		return x+y;
	}
	static long bestPrice(long a, long b) {
		return a-b;
	}
	static float offerPrice(float c, float d) {
		return c*d;
	}
	static double fixedPrice(double e, double f) {
		return e/f;
	}
	public static void main(String[] args) {
		int shirt = basePrice (240,260);
		long jeans = bestPrice (800L,300L);
		float saree = offerPrice (50f,10f);
		double pants = fixedPrice (10000d,20d);
		System.out.println("allen soly shirts : " + shirt);
		System.out.println("peter england jeans : " + jeans);
		System.out.println("slik saree : " + saree);
		System.out.println("killer pants : " + pants);
	

	}

}
