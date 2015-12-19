package Zadacha;

public class PersonalAccount extends Account {
	
	private String name;
	private long egn;
	
	public PersonalAccount() {
		super();
	}
	public PersonalAccount(double sum, String name, long egn) {
		super(sum);
		setName(name);
		setEgn(egn);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getEgn() {
		return egn;
	}
	public void setEgn(long egn) {
		this.egn = egn;
	}

	
}
