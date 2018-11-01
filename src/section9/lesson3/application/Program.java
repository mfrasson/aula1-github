package section9.lesson3.application;

import section9.lesson3.entities.Account;
import section9.lesson3.entities.BusinessAccount;
import section9.lesson3.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1020, "Alex", 1000.0, 0.01);
		
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
	}

}
