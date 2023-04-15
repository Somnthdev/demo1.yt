package programs;

public class AtmDriver {

	public static void main(String[] args) {
		Bank ATM = new ATM();
		ATM.withdraw(20);
		ATM.deposit(30);
		ATM.checkBalance();
		

	}

}
