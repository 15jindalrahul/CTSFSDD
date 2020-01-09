package commm.lbk;
import commm.lbk.Account;
import commm.lbk.Accounttype;

public class Tester {
	public static void main(String[] args)
	{
		Account account= Account.createAccount(Accounttype.LOAN, 2990);
		System.out.println("account.displayaccount()");
		
		
		
	}

}
