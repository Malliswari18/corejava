package interface_examples;

public class ATM implements HDFC_Bank{
	@Override
	public void deposit(int amount) {
		System.out.println(amount+" deposits");
	}
	@Override
	public void withdraw(int amount) {
		System.out.println(amount+" Withdraw");
	}

}
