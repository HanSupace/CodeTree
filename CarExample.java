package ch06.sec08.exam3;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.gas = 5;
		
		if(myCar.isLeftGas()) {
			myCar.run();
		}
		System.out.println("연료를 채워라");


	}

}
