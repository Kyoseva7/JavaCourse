package Zadacha;

public class Account {
	
	public Account() {
		super();
	}

	public Account(double sum) {
		super();
		this.sum = sum;
	}

	private double sum;

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) throws NegativeMoneyException  {
		if(sum < 0) {
			throw new NegativeMoneyException("Sum can't be negative");
		}
		this.sum = sum;
	}
	
	public static void checkIfAccount(Object object) throws InvalidAccountException {
		if(object instanceof PersonalAccount) {
			System.out.println(((PersonalAccount)object).getEgn());
		} else if (object instanceof CorporativeAccount) {
				System.out.println(((CorporativeAccount)object).getEik());
		} else {
			throw new InvalidAccountException("Invalid account");
		}
	}
}
