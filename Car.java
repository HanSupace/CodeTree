package ch06.sec08.exam3;

public class Car {
	
	int gas;
	
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("가스가 없음");
			return false;
		}
		System.out.println("가스가 "+gas+"만큼 남아있음");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량:"+gas);
				gas--;
			}else {
				System.out.println("가스가 없음");
				return;

			}
		}
	}

}
