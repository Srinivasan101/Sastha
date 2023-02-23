package tech.java;

public class Evanodd {

	public static void main(String[] args) {
		 int [] number = {10,13,24,27,32,35,40,49,56,51};
		 System.out.println("EVEN NUMBERS");
		 
		 for(int i = 0;i < number.length;i++) {
			 if(number[i]%2 ==0) {
				 System.out.println(number[i]);
		 }
	}
		System.out.println("ODD NUMBERS");
		for(int i = 0; i< number.length;i++) {
			if(number[i]%2 != 0) {
				System.out.println(number[i]);
			}
		}
		
		
		 

	}

}
