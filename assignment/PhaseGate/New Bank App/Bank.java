import java.util.ArrayList;

public class Bank{
	public ArrayList<Account> accounts = new ArrayList<>();

	public Account createNewAccount(String name, String accountNumber, String pin){
		Account account = new Account( name, accountNumber, pin);
		accounts.add(account);
		return account; 
	}


}