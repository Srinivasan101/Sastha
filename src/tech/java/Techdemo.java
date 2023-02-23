package tech.java;

public class Techdemo {
	static int grandTotal(int Tamil,int English,int Maths,int Science, int Social){
		int total;
		total = Tamil+English+Maths+Science+Social;
		return total;
	}

	public static void main(String[] args) {
		System.out.println("high total");
	
		int total = grandTotal(98,97,96,95,94);
		System.out.println(total);
}
}
