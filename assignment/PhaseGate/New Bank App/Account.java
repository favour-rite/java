

public class Account{
	private String name;
	private String accountNumber;
	private String pin;

	public Account(String name, String accountNumber, String pin){
		this.name = name;
		this.accountNumber = accountNumber;
		this.pin = pin;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
	public void setaccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}

	public String getaccountNumber(){
		return accountNumber;
	}
	public void setpin(String pin){
		this.pin = pin;
	}	
	public String getpin(){
		return pin;
	}

	

}