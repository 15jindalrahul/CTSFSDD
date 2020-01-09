



package commm.lbk;

import java.time.LocalDate;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Account {

	private String accountno;
	private double amount;
	private LocalDate doo;
	private Accounttype accounttype;
	private static Account account;
	static {
		account = new Account();
	}

	public Account createAccount(Accounttype accounttype,double amount)
	{
		account.setAccountno(UUID.randomUUID().toString());
		account.setAccounttype(accounttype);
		account.setAmount(amount);
		account.setDoo(LocalDate.now());
		return account;
	}
	public String displayaccount()
	{
		return("Accountno:"+ getAccountno() + "amount:"+ getAmount()+"doo:"+getDoo().now()+"accounttype:"+getAccounttype());
	}

}
