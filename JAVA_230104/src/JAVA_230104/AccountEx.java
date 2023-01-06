package JAVA_230104;

public class AccountEx {

	public static void main(String[] args) {

		Account account = new Account();

		account.deposit(10000);
		System.out.println("예금액 : " + account.getBalance());

		try {
			account.withdraw(30000);
		} catch (Exception e) {
			String message = e.getMessage();
			System.out.println(message);
			System.out.println();
			e.printStackTrace();
		}
	}

}
