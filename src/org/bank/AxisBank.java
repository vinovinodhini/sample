package org.bank;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("deposit is 50000");

	}
	public static void main(String[] args) {
		AxisBank ab=new AxisBank();
		ab.deposit();
		ab.savings();
		ab.fixed();
	}
}
