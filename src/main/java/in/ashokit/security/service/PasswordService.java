package in.ashokit.security.service;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {

	public String encrypt(String plainText) {
		int x = 10;
		System.out.println(x);
		Encoder encoder = Base64.getEncoder();
		String encodedString = encoder.encodeToString(plainText.getBytes());
		return encodedString;
	}

	public String decrypt(String encodedText) {
		System.out.println("HEllo");
		Decoder decoder = Base64.getDecoder();
		byte[] decode = decoder.decode(encodedText);
		return new String(decode);
	}

}
