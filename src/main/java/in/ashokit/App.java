package in.ashokit;

import in.ashokit.security.service.PasswordService;

public class App {
	public static void main(String[] args) {
		PasswordService service = new PasswordService();
		String encrypt = service.encrypt("AshokIt@8580");
		System.out.println("Encrypted password is :" + encrypt);

		String decrypt = service.decrypt(encrypt);
		System.out.println("Decrypted password is :" + decrypt);
	}
}
