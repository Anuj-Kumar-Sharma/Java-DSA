package javaOOPS2;

public class LearnEncapsulation2 {

	public static void main(String[] args) {
		
		BankAccount obj = new BankAccount();
//		obj.amount = 4;
		
		obj.setAmount(1234, 100);
		
		System.out.println(obj.getAmount());
		
	}
}

class BankAccount {
	
	public int getAmount() {
		return amount;
	}

	int otp = 1234;
	private int amount;
	
	public void setAmount(int otp, int amount) {
		if(otp == this.otp) {
			this.amount = amount;
		}
	}
	
}
