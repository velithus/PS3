
public class Test {

	public static void main(String[] args){
		Account a = new Account(1122, 20000.00);
		a.setAnnualInterestRate(.045);
		try {
			a.withdraw(2500.00);
		} catch (InsufficientFundsException e1) {
			e1.printStackTrace();
		}
		a.deposit(3000.00);
		System.out.println(a.getBalance());
		System.out.println(a.getMonthlyInterestRate());
		System.out.println(a.getDateCreated());
		
		Account b = new Account();
		b.setBalance(500.00);
		try {
			b.withdraw(900.00);
		}
		catch(InsufficientFundsException e){
			System.out.println("Insufficient Funds!");
			return;
		}
	}
}
