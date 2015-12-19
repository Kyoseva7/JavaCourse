package Zadacha;

public class CorporativeAccount extends Account {
	
	private String corpName;
	private long eik;
	
	public CorporativeAccount() {
		super();
	}
	
	public CorporativeAccount(double sum, String corpName, long eik) {
		super(sum);
		setCorpName(corpName);
		setEik(eik);
	}

	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}

	public long getEik() {
		return eik;
	}

	public void setEik(long eik) {
		this.eik = eik;
	}
	
	
}
