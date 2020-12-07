package oop;

public class Calculator {
	
	//instance variable
	int x;
	int y;
	
	void add() {
		int sum = x+y;
		System.out.println(sum);
	}//end add
	
	int sub() {
		int sub= x-y;
		return sub;
	}

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.x=10;
		c1.y=5;
		c1.add();
		int r = c1.sub();
		System.out.println(r);
		
		c1.x= 1000;
		c1.y = 500;
		c1.add();
		c1.sub();
		
		

	}

}
