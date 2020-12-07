package oop;

public class Addition {
	
	private int x;
	private int y;
	
	public void add() {
		int sum = x+y;
		System.out.println(sum);
	}//end add
	
	private void add(int a, int b) {
		int sum=0;
		sum=a+b;
		System.out.println(sum);		
	}//end add
	
	void add(double a, double b) {
		double sum = a+b;
		System.out.println(sum);
	}//end add
	
	void add(int a, int b, int c) {
		int sum = a+b+c;
		System.out.println(sum);
	}//end add
	

	public static void main(String[] args) {
		
		Addition a1 = new Addition();
		a1.x=10;
		a1.y=15;
		a1.add();
		a1.add(1000, 500);

	}//end main

}//end class
